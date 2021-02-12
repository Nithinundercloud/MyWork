package TestRestAssure;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpaceXAPITest {
	private Response response;
@BeforeTest
public void hitGetRequest(){
 RestAssured.baseURI="https://api.spacexdata.com/v4/launches/latest";
 RequestSpecification request = RestAssured.given();
 response = request.get();
 
 //JsonPath = response.getBody();
}

@Test
public void statusCode(){
	Assert.assertEquals(response.getStatusCode(), 200);
}

@Test
public void headerinfo(){
	
	Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
	Assert.assertEquals(response.header("Content-Encoding"), "gzip");
	Assert.assertEquals(response.header("Server"), "cloudflare");
}

@Test
public void spaceXattempt(){
	JsonPath json = response.jsonPath();
	Assert.assertEquals(json.get("success"), true);
}

@Test
public void falseRequest(){
	 RestAssured.baseURI="https://api.spacexdata.com/v4/launches/latest";
	 RequestSpecification request = RestAssured.given();
	 response = request.get("/new");
	 
	 Assert.assertEquals(response.getStatusCode(),404);
}
}
