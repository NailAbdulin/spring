package com.spring.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class storeController {

    @GetMapping("/add")
    public void add(@RequestParam("id")List<Integer> ids) {

    }
    @GetMapping("/get")
    public Collection<item> get() {
}
