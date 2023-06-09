package api.endpoint;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

import org.seleniumhq.jetty9.server.Authentication.User;

import io.restassured.response.Response;

public class UserEndPoints {
	
	public static Response createUser(User payload)
	{
		
		Response response = given()
		 .contentType(ContentType.JSON)
		 .accept(ContentType.JSON)
		.when()
		   .post(Routes.post_url);
		
		return response;
		
	}
	
	public static Response readUser(String userName)
	{
		
		Response response = given()
				.pathParam("username", userName)
		 .contentType(ContentType.JSON)
		 .accept(ContentType.JSON)
		.when()
		   .post(Routes.get_url);
		
		return response;
		
	}

}
