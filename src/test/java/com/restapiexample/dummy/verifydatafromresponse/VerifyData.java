package com.restapiexample.dummy.verifydatafromresponse;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class VerifyData {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {

        RestAssured.baseURI = "https://dummy.restapiexample.com/";
        RestAssured.basePath = "api/v1/";
        response = given()
                .when()
                .get("employees")
                .then().statusCode(200);

    }

    //Verify total records
    @Test
    public void test001() {
        ArrayList<Integer> record = response.extract().path("data");
        System.out.println("Verify total record : " + record.size());
    }

    //Verify value for data[23].id
    @Test
    public void test002() {
        int record = response.extract().path("data[23].id");
        System.out.println("Verify data[23].id value : " + record);
    }

    //Verify value for data[23].employee_name
    @Test
    public void test003() {
        String name = response.extract().path("data[23].employee_name");
        System.out.println("Verify data[23].employee_name is : " + name);
    }

    //Verify value for message
    @Test
    public void test004() {
        String message = response.extract().path("message");
        System.out.println("Verify message : " + message);
    }

    //Verify value for status
    @Test
    public void test005() {
        String status = response.extract().path("status");
        System.out.println("Verify status : " + status);
    }

    //Verify employee salary
    @Test
    public void test006() {
        int salary = response.extract().path("data[2].employee_salary");
        System.out.println("Verify employee salary is : " + salary);
    }

    //Verify employee age
    @Test
    public void test007() {
        int age = response.extract().path("data[5].employee_age");
        System.out.println("Verify employee age is : " + age);
    }

    //Verify employee name
    @Test
    public void test008() {
        String name = response.extract().path("data[10].employee_name");
        System.out.println("Verify employee name is : " + name);
    }

}




