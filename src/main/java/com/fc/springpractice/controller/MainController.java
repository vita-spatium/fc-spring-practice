package com.fc.springpractice.controller;

import com.fc.springpractice.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final SortService sortService;

    public MainController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam List<String> list) {
        return sortService.doSort(list).toString();
    }
}
