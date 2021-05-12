package TestScripts;

import io.restassured.path.json.JsonPath;
import pages.Payload;

public class CmplexJsonParse {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JsonPath js = new JsonPath(Payload.CoursePrice());

		//Print no of courses
		int count =  js.getInt("courses.size()");
		System.out.println("Count: " + count);

		//Print purchase amount
		int purAmount =  js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase amuunt: "+ purAmount);

		//print titl of first course
		String titleFirst = js.get("courses[0].title");
		System.out.println("titl of first course: " +  titleFirst);

		//print titl of 2nd course
		String titlescnd = js.get("courses[2].title");
		System.out.println("titl of first course: " +  titlescnd);

		//Print all courses titles and their rspective prices
		for (int i =0 ; i<count; i++) {
			String title = js.get("courses[" + i +"].title");
			int price = js.getInt("courses[" + i +"].price");
			System.out.println("Title of " + i + "st/th" + title);
			System.out.println("Price of " + i + "st/th" + price);

		}

		//print no of copies sold by rpa
		for (int i =0 ; i<count; i++) {
			String title = js.get("courses[" + i +"].title");
			if(title.equalsIgnoreCase("RPA")) {
				//copies sold
				int copiesCount = js.get("courses[" + i +"].copies");
				System.out.println("Copies of RPA " + copiesCount);
				break;
			}

		}

	}

}
