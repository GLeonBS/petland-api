package com.petland.start;

import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements ApplicationRunner {

    @Override
    public void run(org.springframework.boot.ApplicationArguments args) throws Exception {
        System.out.println("Testando método");
    }
}
