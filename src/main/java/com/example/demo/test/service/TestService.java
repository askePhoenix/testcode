package com.example.demo.test.service;

import com.example.demo.test.domain.TestInfo;
import com.example.demo.test.repository.TestRepository;
import com.google.common.collect.ImmutableList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository repository;

    public String test(){
        test2();
        return "test222";
    }

    private String test2(){


        TestInfo test33 = TestInfo.builder()
                .id(3L)
                .contents("zzz")
                .build();

        return "";
    }

    public Long save(String des, String con){
        // save
        return repository.save(
                TestInfo.builder()
                        .description(des)
                        .contents(con)
                        .build()
        ).getId();
    }

    public boolean update(Long id,String des, String con){
        // save
        repository.save(
                TestInfo.builder()
                        .id(id)
                        .description(des)
                        .contents(con)
                        .build()
        ).getId();
        return true;
    }

    public List<String> getAll(){
        List<TestInfo> list = repository.findAll();
        List<String> result = new ArrayList<>();

        // 기능 1개
        for(TestInfo info : list){result.add(info.getDescription());}
        // 기능 1개

        return result;
    }

    public List<String> getAllDescription(){
        // 1. 간결
        // validate 1 줄당 코드 한줄

        repository.findAll().stream().map(TestInfo::getDescription).collect(Collectors.toList());
        repository.findAll().stream().map(TestInfo::getDescription).collect(Collectors.toList());
        repository.findAll().stream().map(TestInfo::getDescription).collect(Collectors.toList());
        // 동기

        return repository.findAll().stream().map(TestInfo::getDescription).collect(Collectors.toList());
    }



}
