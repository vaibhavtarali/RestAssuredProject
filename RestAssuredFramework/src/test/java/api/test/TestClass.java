package api.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestClass {
	
	//RestAssured.
	
	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	
	//System.out.println();
	
	// response.getStatusCode();u
	

}
