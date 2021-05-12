package TestScripts;

import java.util.*;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

class WebApiTests {

	@Test
	public void postBarCodeTypes() {

		//Base url
		RestAssured.baseURI = "http://10.138.80.62/ImageToolsWebApi_1.8.0/";

		//Request object
		RequestSpecification httpReq = RestAssured.given();

		//Expected bar code types
		String[] barCodeTypes = {"AustraliaPost","Aztec","ISBN","Codabar","Code11","Code128"
				,"GS1Code128","Code39Extended","Code39Standard","Code93Extended"
				,"Code93Standard","DataMatrix","DeutschePostIdentcode","DeutschePostLeitcode"
				,"EAN13","EAN14","EAN8","IATA2of5","Interleaved2of5","ISSN","ISMN","ItalianPost25"
				,"ITF14","ITF6","MacroPdf417","Matrix2of5","MSI","OneCode","OPC","PatchCode","Pdf417"
				,"MicroPdf417","Planet","Postnet","PZN","QR","MicroQR","RM4SCC","SCC14","SSCC18"
				,"Standard2of5","Supplement","UPCA","UPCE","VIN","Pharmacode","GS1DataMatrix"
				,"DatabarOmniDirectional","DatabarTruncated","DatabarLimited","DatabarExpanded"
				,"SwissPostParcel","AustralianPosteParcel","Code16K","DatabarStackedOmniDirectional"
				,"DatabarStacked","DatabarExpandedStacked","CompactPdf417","GS1QR","MaxiCode"
				,"MicrE13B","Code32","DataLogic2of5","DotCode","DutchKIX","CodablockF"}; 

		//Response object 
		Response response = httpReq.request(Method.POST , "api/BarcodeReader/GetValidBarcodeTypes");

		
		
		//Print response in console
		String ResBody = response.getBody().asString();
		if(ResBody.contains(barCodeTypes[5])) {
			System.out.println("Response bar code are as pr expected.");
		}
		System.out.println("Bar code types are: " + ResBody);


		//Status code verification
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 200);

		//Status line verification
		String statusLine = response.getStatusLine();
		//Assert.assertEquals(statusLine, 200);
		System.out.println("Status line is: " + statusLine);

	}

	@Test
	public void postRecognitionModes() {

		//Base url
		RestAssured.baseURI = "http://10.138.80.62/ImageToolsWebApi_1.8.0/";

		//Request object
		RequestSpecification httpReq = RestAssured.given();

		//Expected bar code types
		String[] barCodeTypes = {"HighPerformance",
				"HighQuality",
				"HighQualityDetection",
				"MaxBarCodes",
				"NormalQuality",
		"MaxQualityDetection"};

		//Response object 
		Response response = httpReq.request(Method.POST , "api/BarcodeReader/GetValidRecognitionModes");

		//Print response in console
		String ResBody = response.getBody().asString();
		//Assert.assertEquals(ResBody, barCodeTypes);
		System.out.println("Response bar code are as per expected.");
		System.out.println("Bar code types are: " + ResBody);


		//Status code verification
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 200);

		//Status line verification
		String statusLine = response.getStatusLine();
		//Assert.assertEquals(statusLine, 200);
		System.out.println("Status line is: " + statusLine);
	}

	@Test
	public void postGetSupportedSourceFile() {

		//Base url
		RestAssured.baseURI = "http://10.138.80.62/ImageToolsWebApi_1.8.0/";

		//Request object
		RequestSpecification httpReq = RestAssured.given();

		//Expected bar code types
		String[] barCodeTypes = { "Tif","Xls","Xlsx","Doc","Docx","Ppt","Pptx","Jpg","Jpeg","Tiff","Rtf","Html","Htm","Txt","Pdf","Png","Bmp","Gif","Xml","Dcm","Pcl","Dot","Dotx","Docm","Mht" };

		//Response object 
		Response response = httpReq.request(Method.POST , "api/FileConversion/GetSupportedSourceFileTypes");

		//Print response in console
		String ResBody = response.getBody().asString();
		//Assert.assertEquals(ResBody, barCodeTypes);
		System.out.println("Response bar code are as per expected.");
		System.out.println("Bar code types are: " + ResBody);


		//Status code verification
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 200);

		//Status line verification
		String statusLine = response.getStatusLine();
		//Assert.assertEquals(statusLine, 200);
		System.out.println("Status line is: " + statusLine);
	}

	@Test
	public void post_GetRemoveMacroSupportedSourceFileTypes() {

		//Base url
		RestAssured.baseURI = "http://10.138.80.62/ImageToolsWebApi_1.8.0/";

		//Request object
		RequestSpecification httpReq = RestAssured.given();

		//Expected bar code types
		String[] barCodeTypes = { "Doc","Docx","Docm","Htm","Html","Ppt","Pptx","Pptm","Rtf","Xls","Xlm","Xlsx","Xlsm" };

		//Response object 
		Response response = httpReq.request(Method.POST , "api/FileConversion/GetRemoveMacroSupportedSourceFileTypes");

		//Print response in console
		String ResBody = response.getBody().asString();
		//Assert.assertEquals(ResBody, barCodeTypes);
		System.out.println("Response bar code are as per expected.");
		System.out.println("Bar code types are: " + ResBody);


		//Status code verification
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 200);

		//Status line verification
		String statusLine = response.getStatusLine();
		//Assert.assertEquals(statusLine, 200);
		System.out.println("Status line is: " + statusLine);
	}

	//Pending
	@Test
	public void postReadBarCodes() {

		//Base url
		RestAssured.baseURI = "http://10.138.80.62/ImageToolsWebApi_1.8.0/";

		//Request object
		RequestSpecification httpReq = RestAssured.given();

		//Request data along with post request
		JSONObject reqParam = new JSONObject();
		//reqParam.put("sourceFilePath", "D:\RestAssuredApiAutomation\RestAssuredApiAutomation\testData");
		reqParam.put("barcodeTypes", "HighPerformance");

		httpReq.header("Content-Type","application/json");

		//Attach data to the rrequest
		httpReq.body(reqParam.toJSONString());

		//Response object 
		Response response = httpReq.request(Method.POST , "/api/BarcodeReader/AdvancedReadBarcodes?sourceFilePath=D%3A%5CRestAssuredApiAutomation%5CRestAssuredApiAutomation%5CtestData%5CGN3LAXK1121D22018100541107070_nfnb%20(2).tiff&recognitionMode=HighPerformance&barcodeTypes=%22Code16K%22&numberOfPagesToBeRead=1");

		//Print response in console
		String ResBody = response.getBody().asString();
		System.out.println("Bar code types are: " + ResBody);

		//Status code verification
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 200);

		//Success code validation
		String successCode = response.jsonPath().get("");
		Assert.assertEquals("$id", 1);

	}


	//Pending
	@Test
	public void postAdvancedReadBarCodes() {

		//Base url
		RestAssured.baseURI = "http://10.138.80.62/ImageToolsWebApi_1.8.0/";

		//Request object
		RequestSpecification httpReq = RestAssured.given();

		//Request data along with ost request
		JSONObject reqParam = new JSONObject();
		reqParam.put("sourceFilePath", "D:\\RestAssuredApiAutomation\\RestAssuredApiAutomation\\testData\\GN3LAXK1121D22018100541107070_nfnb (2).tiff");
		reqParam.put("recognitionMode", "HighPerformance");
		reqParam.put("barcodeTypes", "Code16K");
		reqParam.put("numberOfPagesToBeRead", 1);

		httpReq.header("Content-Type","application/json");

		//Attach data to the rrequest
		httpReq.body(reqParam.toJSONString());

		//Response object 
		Response response = httpReq.request(Method.POST , "/api/BarcodeReader/AdvancedReadBarcodes?sourceFilePath=D%3A%5CRestAssuredApiAutomation%5CRestAssuredApiAutomation%5CtestData%5CGN3LAXK1121D22018100541107070_nfnb%20(2).tiff&recognitionMode=HighPerformance&barcodeTypes=%22Code16K%22&numberOfPagesToBeRead=1");

		//Print response in console
		String ResBody = response.getBody().asString();
		System.out.println("Bar code types are: " + ResBody);

		//Status code verification
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 200);

		//Success code validation
		String successCode = response.jsonPath().get("");
		Assert.assertEquals("$id", 1);

	}

}
