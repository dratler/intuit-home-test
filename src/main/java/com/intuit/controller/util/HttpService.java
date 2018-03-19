package com.intuit.controller.util;

import com.google.gson.Gson;
import com.typesafe.config.Config;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

public class HttpService {
    @Inject
    private Config config;

    @Inject private Gson gson;

    public List<String> getData(String jsonName) throws Exception {
        String url = config.getString("env.url");
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url+"/json/"+jsonName+".json");
        int statusCode = client.executeMethod(method);
        if(statusCode != 200){
            throw new Exception("The Mock Data from "+jsonName+".json not found");
        }
        String res = new String(method.getResponseBody());
        String[] parsed = gson.fromJson(res,String[].class);
        return Arrays.asList(parsed);
    }
}
