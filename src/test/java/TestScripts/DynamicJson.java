package TestScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import pages.Payload;
import pages.ResuableMethods;

import static io.restassured.RestAssured.*;


public class DynamicJson {
	
	@Test(dataProvider="BookData")
	public void AddBook(String aisle, String isbn) {
		RestAssured.baseURI = "http://216.10.245.166";
		
		String response =  given().log().all().header("Content-type", "application/json")
		.body(Payload.AddBook(aisle,isbn)).
		when().post("/Library/Addbook.php").
		then().assertThat().log().all().statusCode(200)
		.extract().response().asString();
		System.out.println("Response: " + response);
		JsonPath js = ResuableMethods.parsedToJson(response);
		String id = js.get("ID").toString();
		System.out.println("ID: " + id);
	
	}
	
	//Parameterization using testng annotations
	@DataProvider(name="BookData")
	public Object[][] getData()
	{
		//array==collections of elements
		//multi dim array--collection of arrays
		return new Object[][] {{"first","76576"}, {"second","9866"}, {"third","8757"}};
	}

}
