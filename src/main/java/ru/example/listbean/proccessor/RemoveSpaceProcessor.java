package ru.example.listbean.proccessor;

import org.springframework.stereotype.Component;

@Component
public class RemoveSpaceProcessor implements Processor {

    @Override
    public String process(String str) {
        return str.replace(" ", "");
    }
}
