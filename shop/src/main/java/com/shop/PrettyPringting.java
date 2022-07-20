package com.shop;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrettyPringting {
    public static void main(String[] args){
        Student student=new Student(1, "anna");
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        String studentJson=gson.toJson(student);
        System.out.println(studentJson);
    }

}
