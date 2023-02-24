package com.adorno.mappers;

import java.util.LinkedHashMap;

import com.adorno.modelo.Item;
import com.adorno.modelo.Mapper;

public class LinkedHashMapItemMapper implements Mapper<Item, LinkedHashMap> {
    @Override
    public Item map(LinkedHashMap linkedHashMap) {
        return new Item(
        		(Integer)linkedHashMap.get("id"),
        		(String)linkedHashMap.get("description"),
        		(Boolean)linkedHashMap.get("checked"),
        		new ProccesorMapper().map(linkedHashMap.get("procesador"))
        		);
    }
}
