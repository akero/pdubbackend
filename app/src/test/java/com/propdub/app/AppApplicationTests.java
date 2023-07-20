package com.propdub.app;

import com.propdub.app.controller.controller; 
import com.propdub.app.service.service;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.mockito.BDDMockito.given;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(properties = "spring.config.name=application-test")
class AppApplicationTests {

    @Autowired
    private controller controller;

    @MockBean
    private service service;

    @Test
    void contextLoads() {
    }

    @Test
    void helloTest() {
        given(service.sayHello()).willReturn("Hello, World!");

        String greeting = controller.hello();

        assertThat(greeting).isEqualTo("Hello, World!");
    }
}
