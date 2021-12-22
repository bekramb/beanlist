package ru.example.listbean;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ListBeanApplicationTests {

    @Autowired
    private ListBeanApplication listBeanApplication;

    @Test
    void contextLoads() {

        assertThat(listBeanApplication.getValue()).isEqualTo("TESTSTRING");
    }

}
