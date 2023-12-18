package rw.ac.rca.melissakabalisaterm1b.endtoend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathApplicationE2ETest {

    private final TestRestTemplate restTemplate = new TestRestTemplate();
    @LocalServerPort
    private int port;

    @Test
    public void testApiEndpoint() {
        String url = "http://localhost:" + port + "/api/endpoint";
        String response = restTemplate.getForObject(url, String.class);

        assertEquals("Expected Response", response);
    }
}