package com.adorno.services;


import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.adorno.modelo.Item;

@Service
public class ItemService {
    private Map<Long, Item> items = new ConcurrentHashMap<>();
    private AtomicLong lastId = new AtomicLong();

    public ItemService() {
        addItem(new Item(1, "cosas"));
    }


    public Optional<Item> addItem(Item item) {
        if (!items.containsValue(item)) {
            long id = lastId.incrementAndGet();
            item.setId(id);
            items.put(id, item);
           return Optional.of(item);
        }
        return Optional.empty();
    }

    public Optional<Item> findItemById(Long id) {
        return Optional.ofNullable(items.get(id));
    }

    public List<Item> findAll() {
        return items.values().stream().collect(Collectors.toList());
    }
    public Map<Long, Item> getItems() {
        return items;
    }

    public Item getItemsStartWith(String inicial) {
        return new Item(1,"comandante");
    }

    public boolean contains(Long id) {
        return items.entrySet().stream().anyMatch((entry)->{
            return entry.getValue().getId()==id;
        });
    }
}
