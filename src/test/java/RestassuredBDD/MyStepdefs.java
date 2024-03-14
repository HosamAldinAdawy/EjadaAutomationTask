package RestassuredBDD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
public class MyStepdefs {
    private String endpoint;
    private String requestBody;
    private Response response;
        @Given("the API endpoint is {string}")
        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        @When("a GET request is sent")
        public void sendGetRequest() {
            response = RestAssured.get(endpoint);
        }

        @Then("the response status code should be {int}")
        public void verifyStatusCode(int expectedStatusCode) {
            int actualStatusCode = response.getStatusCode();
            Assert.assertEquals(expectedStatusCode, actualStatusCode);
        }

        @Then("the response body should contain a list of books")
        public void verifyResponseBody() {
            String responseBody = response.getBody().asString();
            System.out.println("Response body: " + responseBody);
        }


    @Given("the request body is:")
    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    @When("a DELETE request is sent")
    public void sendDeleteRequest() {
            response = RestAssured.delete(endpoint);
    }

    }
