package co.com.ortega3.microservice.resolveEnigmaApi3.api;

import co.com.ortega3.microservice.resolveEnigmaApi3.model.JsonApiBodyRequest;
import co.com.ortega3.microservice.resolveEnigmaApi3.model.JsonApiBodyResponseErrors;
import co.com.ortega3.microservice.resolveEnigmaApi3.model.JsonApiBodyResponseSuccess;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GetStepApiControllerIntegrationTest {

    @Autowired
    private GetStepApi api;

    @Test
    public void getStepTest() throws Exception {
        JsonApiBodyRequest body = new JsonApiBodyRequest();
        ResponseEntity<JsonApiBodyResponseSuccess> responseEntity = api.getStep(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
