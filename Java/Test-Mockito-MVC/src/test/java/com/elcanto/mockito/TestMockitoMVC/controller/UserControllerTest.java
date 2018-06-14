package com.elcanto.mockito.TestMockitoMVC.controller;

import com.elcanto.mockito.TestMockitoMVC.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;

import static org.mockito.Mockito.verify;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserControllerTest {

    private MockMvc mockMvc;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private  UserController userController;

    @Before
    public void setUp() throws  Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void test() throws Exception{

        Mockito.when(userRepository.findAll()).thenReturn(Collections.emptyList());

        mockMvc.perform(MockMvcRequestBuilders.get("/user/l")
                .accept(MediaType.APPLICATION_JSON))
                .andReturn();

        verify(userRepository).findAll();

    }
}