package com.shop;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class MapToJson {
    public static void main(String[] args){
        Map<String, String> map= new HashMap<>();
        map.put("id", "1");
        map.put("name", "jane");

        Gson gson=new Gson();
        String jsonStr=gson.toJson(map);

        System.out.println(jsonStr);
    }

}
