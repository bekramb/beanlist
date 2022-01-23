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
    void checkList() {

        assertThat(listBeanApplication.getProcessorList()).hasSize(2);
        assertThat(listBeanApplication.getValue()).isEqualTo("TESTSTRING");
    }

    @Test
    void checkMap() {

        assertThat(listBeanApplication.getProcessorMap()).hasSize(2);
        assertThat(listBeanApplication.getProcessorMap().get("removeSpaceProcessor").process("Test String")).isEqualTo("TestString");
    }

}
