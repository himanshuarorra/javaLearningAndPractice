package pages;

import io.restassured.path.json.JsonPath;

public class ResuableMethods {

	public static JsonPath parsedToJson(String response)
	{
		JsonPath js = new JsonPath(response);
		return js;
	}

}
