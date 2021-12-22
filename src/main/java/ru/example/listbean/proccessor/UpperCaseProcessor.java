package ru.example.listbean.proccessor;

import org.springframework.stereotype.Component;

@Component
public class UpperCaseProcessor implements Processor {

    @Override
    public String process(String str) {
        return str.toUpperCase();
    }
}
