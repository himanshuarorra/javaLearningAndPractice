package selenium;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	/*
	 * Product	Article	Price
	 * p1		0001	10
	 * p2		0002	12
	 * p3		0003	15
	 * p4		0004	5
	 * p4		0005	20
	 */

	/*
	 * in some of the tables the header row is kept in a separate tag section
	 * called 'thead', so the indexing of rows in the table start from the first 
	 * row having data and to find the data in header ro we can go as:
	   //table//thead//tr//th[2]
	 */

	/*
	 * tr - table rows
	 * th - table header
	 * td - table row data
	 * 
	 * To find number of rows - 	Find number or tr tags
	 * To find number of columns = take any row any find number of td or th 
	 */

	/*
	 * Xpath of any data :
	 * Article number of p3: Take xpath using rows and column
	 //table//tr[4]//td[2]  : here tr[4] refers to the 4th row and td[2] to 2nd column
	 */

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:/RestAssuredApiAutomation/LearningAndPractice/src/main/java/selenium/chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("");

		//find number of rows
		int rows = d.findElements(By.xpath("table//tr")).size();
		System.out.println(rows);

		//find number of columns
		int col = d.findElements(By.xpath("table//tr//th")).size();
		System.out.println(col);

		//find number of headers
		int hdr = d.findElements(By.xpath("table//tr//th")).size();
		System.out.println(hdr);

		//print the entire table
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.println(d.findElement(By.xpath("//table//tr["+i+"]//td["+col+"]"))+"	");
			}
			System.out.println();
		}

		//Suppose you don't  know the column number f the one i'm looking for
		//use this to fin out
		List<WebElement> c = d.findElements(By.xpath("table//tr//th"));
		int count = 1;
		for(int i=1;i<=c.size();i++)
		{
			WebElement el = c.get(i);
			if(el.getText()=="Product")
			{
				count = i;
			}
		}

		//Print a particular row
		for(int i=2;i<=rows;i++)
		{
			System.out.println(d.findElement(By.xpath("//table//tr["+i+"]//td["+count+"]"))+"	");
			System.out.println();
		}

		//print product and its price
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.println(d.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]"))+"	");
			}
			System.out.println();
		}
	}

}
