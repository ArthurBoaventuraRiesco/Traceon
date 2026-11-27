package traceon.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class HealthControllerTest {

    @Autowired
    private WebApplicationContext applicationContext;

    @Test
    void healthEndpointShouldReturnOkWithExpectedMessage() throws Exception {
        MockMvcBuilders.webAppContextSetup(applicationContext)
                .build()
                .perform(get("/api/health"))
                .andExpect(status().isOk())
                .andExpect(content().string("Traceon API is running!"));
    }
}