package ru.example.listbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.example.listbean.proccessor.Processor;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class ListBeanApplication implements ApplicationRunner {

    private final List<Processor> processorList;
    private final Map<String, Processor> processorMap;

    @Value("${stringValue}")
    private String value;

    public ListBeanApplication(List<Processor> processorList, Map<String, Processor> processorMap) {
        this.processorList = processorList;
        this.processorMap = processorMap;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListBeanApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) {

        for (Processor processor : processorList) {
            value = processor.process(value);
        }
    }

    public String getValue() {
        return value;
    }

    public Map<String, Processor> getProcessorMap() {
        return processorMap;
    }
}
