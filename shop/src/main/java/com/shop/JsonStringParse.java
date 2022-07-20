package com.shop;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonStringParse {
    public static void main(String[] args){
        String json= "{\"id\":1, \"students\": [\"Anna\", \"Jerry\"], \"subject\":{\"name\":\"Java\",\"professor\":\"Tony\"}}";

        JsonElement element= JsonParser.parseString(json);
        JsonObject object=element.getAsJsonObject();

        long id=object.get("id").getAsLong();
        System.out.println("id: "+id);

        JsonArray studentsJsonArray=object.get("students").getAsJsonArray();
        for(int i=0; i< studentsJsonArray.size(); i++){
            String student=studentsJsonArray.get(i).getAsString();
            System.out.println("student["+i+"]:"+student);
        }

        JsonObject subjectJsonObject=object.get("subject").getAsJsonObject();
        String subjectName=subjectJsonObject.get("name").getAsString();
        String subjectProfessor=subjectJsonObject.get("professor").getAsString();
        System.out.println("subject.name: "+subjectName);
        System.out.println("subject.professor: "+subjectProfessor);
    }
}
