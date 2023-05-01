package com.example.demo.controller;

import com.example.demo.model.MyClass;
import com.example.demo.model.Name;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/somecontroller")
public class SomeRandomController {

    @GetMapping
    public MyClass<Name> test() throws JsonProcessingException {

        TypeReference<MyClass<Name>> responseType = new TypeReference<MyClass<Name>>() {};

        Name nameName = new Name();

        nameName.setName("nish");

        MyClass<Name> myClass = new MyClass<>();
        myClass.setResult("SUCCESSO");
        myClass.setGenericValue(nameName);

        String json = "{\"result\":\"BABAMUSHAAMI\",\"genericValue\":{\"name\":\"nish\"}}";


        ObjectMapper objectMapper = new ObjectMapper();


        MyClass<Name> a = objectMapper.readValue(json,responseType);

        System.out.println(a.getResult());
        return myClass;


    }

}
