package demoPackage;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import io.restassured.module.jsv.JsonSchemaValidator.*;
import io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import io.restassured.response.Response;
import io.restassured.matcher.RestAssuredMatchers.*; 
import org.testng.annotations.Test;
public class DemoTest {

	@Test
	public void test1() {

		Response response =  RestAssured.get("https://jsonplaceholder.typicode.com/todos/1");
		System.out.println(response.statusCode());
		System.out.println(response.time());
		System.out.println(response.getBody().asString());
		System.out.println(response.statusLine());
		System.out.println(response.getHeader("content-type"));
	}

	}
