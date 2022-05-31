package com.restapiexample.dummy.employeeinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeePostTest extends TestBase {

      @Test
      public void createEmployee(){

          EmployeePojo employeePojo = new EmployeePojo();

          employeePojo.setName("Sachin Tendulkar");
          employeePojo.setAge(40);
          employeePojo.setSalary(10000000);

          Response response = given()
                  .when()
                  .header("Content-Type","application/json")
                  .body(employeePojo)
                  .post("create");
          response.then().statusCode(200);
          response.prettyPrint();

      }

}
