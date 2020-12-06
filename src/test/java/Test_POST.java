import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_POST {

	@Test
	public void test2() {

		String payload = "\"{  \\\"id\\\": 1122,  \\\"category\\\": {    \\\"id\\\": 0,    \\\"name\\\": \\\"string\\\"  },  \\\"name\\\": \\\"doggie\\\",  \\\"photoUrls\\\": [    \\\"string\\\"  ],  \\\"tags\\\": [    {      \\\"id\\\": 0,      \\\"name\\\": \\\"string\\\"    }  ],  \\\"status\\\": \\\"available\\\"}\"";

		given().
		body(payload).
		when().
		post("http://petstore.swagger.io/v2/pet").
		then().statusCode(201 );

	}

}
