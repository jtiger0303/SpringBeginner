package com.shop.controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value="/productlist", method = RequestMethod.GET)
    public String productList(){

        JsonObject obj1=new JsonObject();
       obj1.addProperty("item_nm", "수제 햄버거");
       obj1.addProperty("item_detail", "소고기 패티와 토마토가 들어있는 햄버거");
       obj1.addProperty("item_reg_date", "2022/04/22");
       obj1.addProperty("item_price", "4000");

       JsonObject obj2=new JsonObject();
        obj2.addProperty("item_nm", "카레 라이스");
        obj2.addProperty("item_detail", "매운 3분 카레라이스");
        obj2.addProperty("item_reg_date", "2021/09/10");
        obj2.addProperty("item_price", "8000");

        JsonArray infoArray=new JsonArray();
        infoArray.add(obj1);
        infoArray.add(obj2);

        return infoArray.toString();
    }
}
