package com.adorno.mappers;

import java.util.Optional;

import com.adorno.modelo.Item;
import com.adorno.modelo.ItemUpdateRequest;
import com.adorno.modelo.Mapper;

public class ItemUpdateRequestMapper implements Mapper<ItemUpdateRequest,Item>{
    @Override
    public ItemUpdateRequest map(Item item) {
    	return null;
//        return ItemUpdateRequest.builder().description(Optional.of(item.getDescription())).cheked(Optional.of(item.isChecked())).build();
    }
}
