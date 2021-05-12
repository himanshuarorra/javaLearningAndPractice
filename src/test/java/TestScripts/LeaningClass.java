package TestScripts;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import pages.Payload;
import pages.ResuableMethods;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

public class LeaningClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		//verify if add place api is working as expected
		//Add place- update place with new address -> Get place to validate if new address is present in respopnse
		
		//Given -- All input details
		//when--submit the api, resource, http-methd
		//then==validate the response
		
		//to send body from external json--content of the file to string -->content f file can convert into byte-->Byte data into string
		String response =  given().log().all().queryParam("key", "qaclick123").header("content-type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("D:\\RestAssuredApiAutomation\\RestAssuredApiAutomation\\src\\test\\java\\pages\\inputData.json")))).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println(response );
		JsonPath js = new JsonPath(response); //for parsing json
		String placeId =  js.getString("place_id");
		System.out.println("Place id: " + placeId );
		
		
		//Update place
		String place = "This is my new address";
		given().log().all().queryParam("key", "qaclick123").header("content-type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\"481b47e5789502e56862fa8e9129a61e\",\r\n" + 
				"\"address\":\""+ place +"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}")
		.when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		//get place
		String response1 =  given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", "481b47e5789502e56862fa8e9129a61e")
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		JsonPath js1 = ResuableMethods.parsedToJson(response1);
	    String actualAddress = js1.getString("address");
	    System.out.println("Updates address: " + actualAddress);
	    Assert.assertEquals(actualAddress, place);
	    System.out.println("Assertion passed.");
	    
	}

}
