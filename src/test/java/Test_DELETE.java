import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_DELETE {

	@Test
	public void test3() {

		JSONObject request = new JSONObject();
		given().
		body(request.toJSONString()).
		when().
		delete("https://petstore.swagger.io/v2/pet/0").
		then().statusCode(204).
		log().all();

	}

}