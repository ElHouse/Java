package com.elcanto.mockito.TestMockitoMVC;

import com.elcanto.mockito.TestMockitoMVC.controller.HelloController;
import com.elcanto.mockito.TestMockitoMVC.service.HelloService;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class HelloControllerTest {

    private MockMvc mockMvc;

    @Mock
    private HelloService helloService;

    @InjectMocks
    private HelloController helloController;

    @Before
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
    }

    @Test
     public void testHelloWoString() throws  Exception{

        when(helloService.hello()).thenReturn("hello");

        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));

        verify(helloService).hello();
    }

    @Test
    public void testHelloJsonGET() throws  Exception{
        mockMvc.perform(get("/hello/json")
                .accept(APPLICATION_JSON))
                .andExpect(jsonPath("$.title",  Matchers.is("adr")))
                .andExpect(jsonPath("$.value",  Matchers.is("can")))
                .andExpect(jsonPath("$.*",hasSize(2)));
    }

    @Test
    public void testHelloJsonPost() throws  Exception{
        String json = "{\n" +
                "  \"title\": \"adr\",\n" +
                "  \"value\": \"can\"\n" +
                "}";
        mockMvc.perform(post("/hello/json")
                .contentType(APPLICATION_JSON)
                .content(json)
                .accept(APPLICATION_JSON))
                .andExpect(jsonPath("$.title",  Matchers.is("adr")))
                .andExpect(jsonPath("$.value",  Matchers.is("can")))
                .andExpect(jsonPath("$.*",hasSize(2)));
    }

}