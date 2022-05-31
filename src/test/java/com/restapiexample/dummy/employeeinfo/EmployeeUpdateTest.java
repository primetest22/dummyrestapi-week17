package com.restapiexample.dummy.employeeinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeeUpdateTest extends TestBase {

     //Update salary of employee just created
     @Test
     public void updateEmployee(){

         EmployeePojo employeePojo = new EmployeePojo();
         employeePojo.setSalary(200000);

         Response response = given()
                 .when()
                 .header("Content-Type","application/json")
                 .body(employeePojo)
                 .put("update/21");
         response.then().statusCode(200);
         response.prettyPrint();


     }

}
