package com.restapiexample.dummy.employeeinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteEmployee extends TestBase {

      @Test
    public void deleteEmployee(){

          Response response = given()
                  .when()
                  .delete("delete/21");
          response.then().statusCode(200);
          response.prettyPrint();

      }

}
