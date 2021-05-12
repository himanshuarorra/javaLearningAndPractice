package TestScripts;


import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;


public class JiraTest {

	@Test
	public void CreateIssue()
	{
		RestAssured.baseURI = "http://localhost:8080";
		SessionFilter sf = new SessionFilter();
		//getting login cookies
		Response res = given().header("Content-Type","application/json").body("{ \"username\": \"himanshuarorra\", \"password\": \"Himanshu@1\" }")
				.  log().all().filter(sf)
				.when()
				.post("rest/auth/1/session").then().log().all().extract().response();
		String response = res.asString();
		JsonPath js = new JsonPath(response);
		String sesName = js.getString("session.name");
		String sesId = js.getString("session.value");
		System.out.println("sesName: "+ sesName+ "  sesId: "+sesId);


		//Add comment
		given().pathParam("id", "10106").header("Content-Type","application/json")
		//.header("Cookie",sesName+"="+sesId)
		.body("{\r\n" + 
				"    \"body\": \"Updating the comment from java code again.\",\r\n" + 
				"    \"visibility\": {\r\n" + 
				"        \"type\": \"role\",\r\n" + 
				"        \"value\": \"Administrators\"\r\n" + 
				"    }\r\n" + 
				"}").filter(sf).when().post("rest/api/2/issue/{id}/comment")
		.then().log().all().extract().response();

		//Add attachment
		given().header("X-Atlassian-Token","no-check").filter(sf).pathParam("id","10106")
		.header("Content-Type","multipart/form-data")
		.multiPart("file",new File("D:\\RestAssuredApiAutomation\\RestAssuredApiAutomation\\src\\test\\java\\pages\\jira.txt"))			//Multipart is used to send files as attachnents
		.when()
		.post("rest/api/2/issue/{id}/attachments")
		.then().log().all().extract().response();

	}

	/*
	 * 
	 *Code Download
package files;

import static io.restassured.RestAssured.*;



import java.io.File;



import org.testng.Assert;



import io.restassured.RestAssured;

import io.restassured.filter.session.SessionFilter;

import io.restassured.path.json.JsonPath;



public class JiraTest {



public static void main(String[] args) {

// TODO Auto-generated method stub

RestAssured.baseURI="http://localhost:8080";

//Login Scenario

SessionFilter session=new SessionFilter();

String response=given().relaxedHTTPSValidation().header("Content-Type","application/json").body("{\r\n" +

"    \"username\": \"RahulShetty\",\r\n" +

"    \"password\": \"XXXX11\"\r\n" +

"}").log().all().filter(session).when().post("/rest/auth/1/session").then().log().all().extract().response().asString();

String expectedMessage ="Hi How are you?";

//Add comment

String addCommentResponse = given().pathParam("key", "10101").log().all().header("Content-Type","application/json").body("{\r\n" +

"    \"body\": \""+expectedMessage+"\",\r\n" +

"    \"visibility\": {\r\n" +

"        \"type\": \"role\",\r\n" +

"        \"value\": \"Administrators\"\r\n" +

"    }\r\n" +

"}").filter(session).when().post("/rest/api/2/issue/{key}/comment").then().log().all()

.assertThat().statusCode(201).extract().response().asString();

JsonPath js=new JsonPath(addCommentResponse);

String commentId= js.getString("id");

//Add Attachment

given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key", "10101")

.header("Content-Type","multipart/form-data")

.multiPart("file",new File("jira.txt")).when().

post("rest/api/2/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);

//Get Issue

String issueDetails=given().filter(session).pathParam("key", "10101")

.queryParam("fields", "comment")

.log().all().when().get("/rest/api/2/issue/{key}").then()

.log().all().extract().response().asString();

System.out.println(issueDetails);

JsonPath js1 =new JsonPath(issueDetails);

int commentsCount=js1.getInt("fields.comment.comments.size()");

for(int i=0;i<commentsCount;i++)

{

String commentIdIssue =js1.get("fields.comment.comments["+i+"].id").toString();

if (commentIdIssue.equalsIgnoreCase(commentId))

{

String message= js1.get("fields.comment.comments["+i+"].body").toString();

System.out.println(message);

Assert.assertEquals(message, expectedMessage);

}

}

}



}



Fullscreen
Go to Previous lecture50. Importance of Assertions and Https Validations…
Go to Next lecture52. Introduction to OAuth 2.0 and different Grant …
	 */

}
