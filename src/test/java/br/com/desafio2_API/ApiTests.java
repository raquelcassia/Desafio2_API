package br.com.desafio2_API;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;
import io.restassured.http.ContentType;

public class ApiTests {
	
	private static  String ID_DO_FILME = "tt1285016";
	private static  String API_KEY = "52ec71bf";
	
	
	@Test
	public void validarTituloAnoIdioma() {
		
		String endpoint = "http://www.omdbapi.com/";
			
		given()
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
		.body("Language", equalTo("English, French"));
	}
	

	
}
