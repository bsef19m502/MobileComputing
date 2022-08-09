package com.example.api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView inp;
    TextView out;
    Button submit;
    String CityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inp=findViewById(R.id.input);
        out=findViewById(R.id.result);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.submit)
        {
            CityName = inp.getText().toString();
            getData();
           
        }

    }

    private void getData() {
        Uri uri= Uri.parse("https://datausa.io/api/data?drilldowns=State&measures=Population&year=latest").
                buildUpon().build();
        URL url= null;
        try {
            url = new URL(uri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        new DOTask().execute(url);


    }
    class DOTask extends AsyncTask<URL,Void,String> {

        @Override
        protected String doInBackground(URL... urls) {
            URL url=urls[0];
            String data=null;
            try {
                data=Network.makeHTTPReq(url);
            } catch (IOException e) {
                e.printStackTrace();
            }


            return data;
        }

        @Override
        protected void onPostExecute(String s) {
            parseJSON(s);
        }

        private void parseJSON(String s) {
            JSONObject jo=null;
            JSONArray cities=null;
            try {
                jo=new JSONObject(s);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                cities= jo.getJSONArray("data");
            } catch (JSONException e) {
                e.printStackTrace();
            }

            for (int i=0; i <cities.length();i++){
                try {
                    JSONObject city=cities.getJSONObject(i);
                    String citys=city.get("State").toString();
                    if(citys.equals(CityName))
                    {
                        String population=city.get("Population").toString();
                        out.setText(population);
break;
                    }
                    else
                        out.setText("Not Found");


                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}