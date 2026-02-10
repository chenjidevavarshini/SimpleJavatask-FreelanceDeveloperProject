package com.nt.itemService.controller;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import com.nt.itemService.model.Item;
import com.nt.itemService.repository.ItemRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemRepository repository;

    public ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    // Add new item
    @PostMapping
    public Item addItem(@Valid @RequestBody Item item) {
        return repository.save(item);
    }

    // Get item by ID
    @GetMapping("/{id}")
    public Item getItem(@PathVariable int id) {
        Optional<Item> item = repository.findById(id);

        if (item.isEmpty()) {
            throw new RuntimeException("Item not found with id: " + id);
        }

        return item.get();
    }
}

