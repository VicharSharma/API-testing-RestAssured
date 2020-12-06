import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Test_GET {

	@Test
	public void test_1(){

		Response response = get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");

		System.out.println(response.getBody().asPrettyString());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	}
	
}
