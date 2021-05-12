package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import pages.Payload;

public class SumValidation {
	
	@Test
	public void sumOfCourses()
	{
			JsonPath js = new JsonPath(Payload.CoursePrice());
			int count =js.getInt("courses.size()");
			int totalSum = 0;
			for(int i=0;i<count;i++) {
				
				int price = js.getInt("courses["+i+"].price");
				int copies = js.getInt("courses["+i+"].copies");
				int amount= price * copies;
				//System.out.println(amount);
				totalSum = totalSum+amount;
			}
			System.out.println(totalSum);
			int dashAmount = js.getInt("dashboard.purchaseAmount");
			Assert.assertEquals(totalSum, dashAmount);
			System.out.println("Equal.");

	}

}
