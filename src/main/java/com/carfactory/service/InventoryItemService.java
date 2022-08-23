package com.carfactory.service;

import com.carfactory.model.Customer;
import com.carfactory.model.InventoryItem;
import com.carfactory.repository.InventoryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryItemService {
    private InventoryItemRepository inventoryItemRepository;

    @Autowired
    public InventoryItemService(InventoryItemRepository inventoryItemRepository) {
        this.inventoryItemRepository = inventoryItemRepository;
    }

    public List<InventoryItem> getInventoryItem(){
        return inventoryItemRepository.findAll();
    }


    public InventoryItem addInventoryItem(InventoryItem inventoryItem){
        return inventoryItemRepository.save(inventoryItem);
    }
}
