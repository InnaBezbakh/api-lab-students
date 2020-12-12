import User8787.User8787;
import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.entity.ContentType;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class Test1 {

    @Test

    public void getIdOfUser(){
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification
                .baseUri("https://petstore.swagger.io")
                .basePath("/v2/user/user1")
                .get();
        Assert.assertEquals(200, response.getStatusCode());

    }


    @Test
    public void getUserNotFoundMessage(){


        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification
                .baseUri("https://petstore.swagger.io")
                .basePath("/v2/user/user8877")
                .get();
 User8787 body = response.getBody().as(User8787.class);
 Assert.assertEquals(body.getMessage(),"User not found");
    }



}


