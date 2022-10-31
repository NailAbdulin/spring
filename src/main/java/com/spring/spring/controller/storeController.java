package com.spring.spring.controller;

import com.spring.spring.model.Item;
import com.spring.spring.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class storeController {

    private final StoreService storeService;

    public storeController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        storeService.add(ids);

    }

    @GetMapping("/get")
    public Collection<Item> get() {
        return storeService.get();
    }
}
