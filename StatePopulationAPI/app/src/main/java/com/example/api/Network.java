package com.example.api;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Network {
    public static String makeHTTPReq(URL url) throws IOException {

        HttpURLConnection httpcon= (HttpURLConnection) url.openConnection();
        InputStream instream=httpcon.getInputStream();
try{
        Scanner sc=new Scanner(instream);
        sc.useDelimiter("\\A");

        boolean hasInput= sc.hasNext();
        if (hasInput)
            return sc.next();
        else
            return null;

    }finally {
    httpcon.disconnect();
    }
    }
}
