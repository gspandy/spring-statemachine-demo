package com.github.trang.statemachine;

import com.github.trang.statemachine.persist.Persist;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateMachineApplication implements CommandLineRunner {

    @Autowired
    private Persist persist;
    @Autowired
    private Gson gson;

    public static void main(String[] args) {
        SpringApplication.run(StateMachineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(gson.toJson(persist.get(1L)));
//        persist.change(1L, Events.INTENTION);
//        System.out.println(gson.toJson(persist.get(1L)));
    }

}
