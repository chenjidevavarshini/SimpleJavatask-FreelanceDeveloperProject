package com.nt.itemService.repository;




import org.springframework.stereotype.Repository;

import com.nt.itemService.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemRepository {

    private List<Item> items = new ArrayList<>();

    public Item save(Item item) {
        items.add(item);
        return item;
    }

    public Optional<Item> findById(int id) {
        return items.stream()
                .filter(item -> item.getId() == id)
                .findFirst();
    }
}
