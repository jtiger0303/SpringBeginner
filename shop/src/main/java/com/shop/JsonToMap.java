package com.shop;

import com.google.gson.Gson;

import java.util.Map;

public class JsonToMap {
    public static void main(String[] args){
        String jsonStr="{\"id\": 1, \"name\": \"Anna\"}";

        Gson gson= new Gson();

        Map<String, Object> map=gson.fromJson(jsonStr, Map.class);
        for(Map.Entry<String, Object> entry: map.entrySet()){
            System.out.println(entry.getKey()+ "="+entry.getValue());
        }
    }
}
