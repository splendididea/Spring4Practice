package org.java.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml"})
public class SampleControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(SampleControllerTest.class);

    @Inject
    private WebApplicationContext wac;


    // 브라우저에서 요청과 응답을 의미하는 객체로 간주
    private MockMvc mockMvc;

    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        logger.info("setup.............");
    }

    @Test
    public void testDoA() throws Exception {
        // get, post 방식을 호출을 사용
        mockMvc.perform(MockMvcRequestBuilders.get("/doA"));
    }
}
