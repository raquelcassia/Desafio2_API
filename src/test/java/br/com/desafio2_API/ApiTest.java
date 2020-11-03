package br.com.desafio2_API;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class ApiTest {
	
	private static String ID_DO_FILME = "tt1285016";
	private static String API_KEY = "52ec71bf";
	private static String endpoint = "http://www.omdbapi.com/";
	private static Response response;

	
	@Test
	public void validarTituloAnoIdioma()  {
			
		response = given()
				.relaxedHTTPSValidation()
				.param("i", ID_DO_FILME) 
				.param("apikey", API_KEY) 
				.when()
				.get(endpoint)
				.then()
				.statusCode(200) 
				.contentType(ContentType.JSON) 
				.body("Title", equalTo("The Social Network"))
				.body("Year", equalTo("2010")) 
				.body("Language", equalTo("English, French"))
				.log().all().extract().response();
	}
	
	@Test
	public void validarFilmeInexistenteIdInvalida() {
					
		response = given()
		.relaxedHTTPSValidation()
		.param("t", "123453")
		.param("apikey", API_KEY) 
		.when()
		.get(endpoint)
		.then()
		.statusCode(200) 
		.contentType(ContentType.JSON) 
		.body("Response", equalTo("False")) 
		.body("Error", equalTo("Movie not found!"))
		.log().all().extract().response();

		
	}	

	@Test
	public void validarFilmeInexistenteKeyInvalida() {
					
		response = given()
		.relaxedHTTPSValidation()
		.param("t", ID_DO_FILME)
		.param("apikey", "123453") 
		.when()
		.get(endpoint)
		.then()
		.contentType(ContentType.JSON) 
		.body("Response", equalTo("False")) 
		.body("Error", equalTo("Invalid API key!"))
		.log().all().extract().response();

		
		}
	}
