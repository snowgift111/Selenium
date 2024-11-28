package sel.definitions;

import java.util.List;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.Argument;
import io.restassured.path.json.JsonPath;
import sel.actions.ActionHelper;
import sel.baseclass.Base;
import sel.locators.LoginPageLocators;
import sel.utils.UtilityHelper;

public class LoginSD extends Base {

	ActionHelper act = new ActionHelper(); 
	LoginPageLocators loc = new LoginPageLocators(driver);
	UtilityHelper util = new UtilityHelper(); 
	
	@Given("User is on Amazon page")
    public void loginTest() {
       act.getUrl();
       }
	@When("User enter credentials")
    public void enterCred(DataTable dataTable) {
       List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
       act.sendKeys(loc.usr, list.get(0).get("Username"));
       act.sendKeys(loc.pwd, list.get(0).get("Password"));
    }
	@And("Click login button")
    public void pressLogin() {
		RestAssured.baseURI = "dghd";
		String JsonString = " ";
		Response response = given().auth().oauth2("geriwt74365v762r").header("content-type","application/json").when().get("ebfef");
		given().auth().oauth2("geriwt74365v762r").header("content-type","application/json").when().get("ebfef").then().assertThat().statusCode(200);
	
		given().baseUri("hbsdvb").contentType(ContentType.JSON).log().all().body("hbhb")
		.when().post("jyguyg")
		.then().statusCode(200).extract().asString();
		
					
				
    }

}
