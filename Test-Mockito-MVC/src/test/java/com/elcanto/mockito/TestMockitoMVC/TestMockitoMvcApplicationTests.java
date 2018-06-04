package com.elcanto.mockito.TestMockitoMVC;

import com.elcanto.mockito.TestMockitoMVC.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.Collections;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
@WebMvcTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestMockitoMvcApplicationTests.class)
public class TestMockitoMvcApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void test() throws Exception{

        when(userRepository.findAll())
                .thenReturn(Collections.emptyList());

        MvcResult mvcResult =  mockMvc.perform(get("/user")
                .accept(MediaType.APPLICATION_JSON))
                .andReturn();

        System.out.println("asdasd"+mvcResult);

        verify(userRepository).findAll();
    }

}
