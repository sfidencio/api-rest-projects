package com.github.sfidencio.exemplo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ExemploAopAnnotationsJunit5ApplicationTests {


    @Autowired
    private ApplicationContext context;

    @Test
    void contextLoads() {
        Assertions.assertThat(context).isNotNull();
    }
}
