package entrevistaIntelipost;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class IntelipostDefinitions{
	
	public IntelipostDefinitions() {
        RestAssured.baseURI = IntelipostConfiguration.OPEN_NOTIFY_API_URI;
    }
	
	 public void requestInfo() {
	        Response response =
	                given().
	                        contentType("application/json")
	                        .headers("api-key","4aa90b1087807b5fb8e52b01584f84e416ddb8ab8e5b800ae5d0f075a2d1e379").
	                when().
	                
	                        get("/info").
	                then().
	                        statusCode(200).
	                        extract().response();
	    }
	 public void validateInfoStatusContents() {
	        Response response =
	                given().
	                        contentType("application/json")
	                        .headers("api-key","4aa90b1087807b5fb8e52b01584f84e416ddb8ab8e5b800ae5d0f075a2d1e379").
	      	              
	                when().
	                        get("/info").
	                then().
	                        body(("status"), equalTo("OK")).
	                extract().response();
	    }
}