package com.example.demo.test.controller;

import com.example.demo.test.service.TestService;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/")
@RequiredArgsConstructor
public class TestController {
    final TestService testService;


    @GetMapping(value = "test")
    public Map<String, String> test() {
        return Maps.newHashMap(ImmutableMap.of(testService.test(), "hello world"));
    }

    @GetMapping(value = "save_test")
    public Map<String, String> saveTest() {
        return
                Maps.newHashMap(
                        ImmutableMap
                                .of("key",
                                        Long.toString(
                                                testService.save("description11", "content11")
                                        )
                                )
                );
    }


    @GetMapping(value = "update")
    public Map<String, String> update() {
        testService.update(1L, "des 0101", "con 0101");
        return null;
    }
    @GetMapping(value = "all")
    public Object getAll() {
        return testService.getAllDescription();
    }


}
