package restApi;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostTest {
	@Test
	public void postUSersNormalMap() {
		Map<String,Object> mp=new HashMap<String, Object>();
		mp.put("name", "Sourav");
		mp.put("job", "Team Lead");

		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(mp)

		.when().post("https://reqres.in/api/users")

		.then()
		.statusCode(201)
		.log().body();
	}
	@Test
	public void postUSersJsonObject() {
		
		JSONObject req=new JSONObject();
		req.put("Sourav", "Captain");
		req.put("job", "Team Lead");
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(req.toJSONString())

		.when().post("https://reqres.in/api/users")

		.then()
		.statusCode(201)
		.log().body();
	}
	@Test
	public void putUSersJsonObject() {
		
		JSONObject req=new JSONObject();
		req.put("Sourav", "Captain");
		req.put("job", "Team Lead");
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(req.toJSONString())

		.when().put("https://reqres.in/api/users/2")

		.then()
		.statusCode(200)
		.log().body();
	}
	@Test
	public void patchUSersJsonObject() {
		
		JSONObject req=new JSONObject();
		req.put("Sourav", "Captain");
		req.put("job", "Team Lead");
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(req.toJSONString())

		.when().patch("https://reqres.in/api/users/2")

		.then()
		.statusCode(200)
		.log().body();
	}
	@Test
	public void deletechUSersJsonObject() {
		
		JSONObject req=new JSONObject();
		req.put("Sourav", "Captain");
		req.put("job", "Team Lead");
		
		given()
		

		.when().delete("https://reqres.in/api/users/2")

		.then()
		.statusCode(204)
		.log().body();
	}
}
