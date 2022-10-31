package com.spring.spring.service;

import com.spring.spring.component.Basket;
import com.spring.spring.model.Item;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreService {

    private final Basket basket;
    private Map<Integer, Item> items;

    public StoreService(Basket basket) {
        this.basket = basket;
    }
@PostConstruct
    public void init() {
    items = Map.of(1,new Item(1,"Смартфон ", 30_000),
            2,new Item(2,"Телевизор ", 40_000),
            3,new Item(3,"Холодильник ", 50_000));
    }
    public void add(List<Integer> ids) {
        basket.add(ids.stream().map(items::get).collect(Collectors.toList()));
    }

    public Collection<Item> get() {
        return basket.get();
    }
}
