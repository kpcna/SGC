package com.sgc.RestController;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sgc.Model.Entity;

@RestController
public class EntityController 
{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/entity")
    public Entity appgenerator(@RequestParam(value="name", defaultValue="World") String name, @RequestParam(value="mytext[]") String[] myParams) {
        return new Entity(counter.incrementAndGet(),
                            String.format(template, name),
                            myParams);
    }
}