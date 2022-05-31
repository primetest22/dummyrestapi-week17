package com.restapiexample.dummy.employeeinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeeGetTest extends TestBase {

    //Get all employee information
    @Test
    public void getAllEmployee() {
        Response response = given()
                .when()
                .get("employees");
        response.then().statusCode(200);
        response.prettyPrint();

    }
    //Get employee information with id 8
    @Test
    public void getEmployeeId() {
        Response response = given()
                .when()
                .get("employee/8");
        response.then().statusCode(200);
        response.prettyPrint();
    }


}
