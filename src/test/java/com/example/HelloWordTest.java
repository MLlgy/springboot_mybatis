package com.example;

import com.example.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 17-3-15 下午12:57
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class HelloWordTest {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception{
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }
    @Test
    public void getHello() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/inex").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
