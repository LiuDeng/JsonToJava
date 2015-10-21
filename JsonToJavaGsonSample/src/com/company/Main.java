package com.company;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
public class Main {

    private static  Object getJsonFromUrl(String url) throws IOException {

//		OkHttpClient client = new OkHttpClient();
//		URLConnection connection = client.open(new URL(url));
//		BufferedReader reader = new BufferedReader()
        InputStream in = new URL(url).openStream();
        String jsonString = IOUtils.toString(in);
        Gson gson = new Gson();
        Joke joke = gson.fromJson(jsonString, Joke.class);
        System.out.println(joke.getText());
        return null;
    }

    public static void main(String[] args) {
	// write your code here
        try {
            getJsonFromUrl("http://localhost:5000/");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
