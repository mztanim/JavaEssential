package com.nordea;

import org.junit.Test;

import static io.restassured.RestAssured.*;

public class MainTest {

    @Test
    public void addTest(){
        System.out.println(1==1);
    }

    @Test
    public void deleteTest(){
        System.out.println(1-1==0);
    }

    @Test
    public void rest1stTest(){
        //when().get("").then().statusCode(200).assertThat().body("length", equals(196)).body("fact",)


    }
}
