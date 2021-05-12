package TestScripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import oracle.net.aso.p;
import pojo.AddPlace;
import pojo.Location;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class serializedClass {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		AddPlace a = new AddPlace();
		a.setAccuracy(50);
		a.setAddress("nahi bataunga");
		a.setLanguage("Angreji");
		a.setPhone_number("8989898989");
		a.setWebsite("www.bakar.com");
		a.setName("skjcdck");
		List<String> list =new ArrayList<String>();
		list.add("my");
		list.add("way");
		a.setTypes(list);
		Location l = new Location();
		l.setLat(546);
		l.setLng(87);
		a.setLocation(l);
		
		
		Response response =  given().queryParam("key", "qaclick123")
				.body(a).log().all()
				.when().post("maps/api/place/add/json")
				.then().assertThat().statusCode(200)
				.extract().response();
				
	}

}
