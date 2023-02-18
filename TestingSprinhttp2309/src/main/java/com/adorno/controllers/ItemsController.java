package com.adorno.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adorno.mappers.ItemUpdateRequestMapper;
import com.adorno.modelo.Item;
import com.adorno.modelo.ItemUpdateRequest;
import com.adorno.services.ItemService;


@RestController
//hasta ahora http://localhost:8080
@RequestMapping("/items")
//hasta ahora http://localhost:8080/items
public class ItemsController {

    private final ItemService itemService;
    public final String COMIENZO="/comienzo";

    public ItemsController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/all")
    //hasta ahora http://localhost:8080/items/all
    public List<Item> findAll() {
        return itemService.findAll();
    }

    //otra forma de escribir las rutas
    @GetMapping(value = COMIENZO)
    public Item findStartingWith(@RequestParam String inicial, @RequestParam String terminal,
                                 @RequestParam Item item) {
        return itemService.getItemsStartWith(inicial);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemUpdateRequest> updateItem(@PathVariable Long id, @RequestBody ItemUpdateRequest itemUpdate) {
        if (itemService.contains(id)) {
            return new ResponseEntity<ItemUpdateRequest>(new ItemUpdateRequestMapper().map(itemService.findItemById(id).get()), HttpStatus.OK);
        }
        return new ResponseEntity<ItemUpdateRequest>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id) {
        Optional<Item> item = itemService.findItemById(id);
        if (item.isPresent())
            return new ResponseEntity<>(item.get(), HttpStatus.OK);
        return new ResponseEntity<>(new Item(0, ""), HttpStatus.OK);
    }

    //hasta ahora http://localhost:8080/items/item
    @PostMapping("/item")
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        return  itemService.addItem(item)
               .map((it1)->{return new ResponseEntity<Item>(it1,HttpStatus.OK);})
               .orElse(new ResponseEntity<Item>(HttpStatus.UNAUTHORIZED));
    }
    @PostMapping("/newitem")
    public Item addNewItem(@RequestBody Item item) {
        return  itemService.addItem(item).get();
    }

}



