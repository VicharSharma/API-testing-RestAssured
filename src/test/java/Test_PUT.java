import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_PUT {

	@Test
	public void test2() {

		JSONObject request = new JSONObject();
		request.put("name", "cat");

		System.out.println(request);
		System.out.println(request.toString());

		given().
		body(request.toJSONString()).
		when().
		put("https://petstore.swagger.io/v2/pet").
		then().statusCode(200);

	}

}