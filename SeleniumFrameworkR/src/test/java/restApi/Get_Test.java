package restApi;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get_Test {
	@Test
	public void test_1() {
		given().when().get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.log().body()
		.body("data.id[0]",equalTo(7))
		.body("data.first_name",hasItems("Michael","Lindsay","Tobias"));
	}
}
