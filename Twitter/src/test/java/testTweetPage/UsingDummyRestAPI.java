package testTweetPage;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingDummyRestAPI {
    @Test
    void postNewEmployees(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";

        RequestSpecification httpReqeust = RestAssured.given();


        //Here we created data that we can send along with teh post request.
        JSONObject requestParams = new JSONObject();

        requestParams.put("name", "Shaifur");
        requestParams.put("salary", "10B");
        requestParams.put("age", "28");
        requestParams.put("profile_image"," ");


        //Add a header stating the request body is a JSON
        httpReqeust.header("Content-Type", "application/json");

        //Add the JSON to the body of the request
        httpReqeust.body(requestParams.toJSONString());

        //Post Request
        Response response = httpReqeust.request(Method.POST,"/create");

        //Capturing the response body ot perform validation
        String responseBody= response.getBody().asString();

        Assert.assertEquals(responseBody.contains("Shaifur"), true);
        Assert.assertEquals(responseBody.contains("10B"), true);
        Assert.assertEquals(responseBody.contains("28"), true);

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

    }
}
