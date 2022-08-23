package com.carfactory.controller;

import com.carfactory.model.Customer;
import com.carfactory.model.InventoryItem;
import com.carfactory.service.InventoryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/inventoryitems")
public class InventoryItemController {
    private InventoryItemService inventoryItemService;

    @Autowired
    public InventoryItemController(InventoryItemService inventoryItemService) {
        this.inventoryItemService = inventoryItemService;
    }

    @GetMapping
    public List<InventoryItem> getInventoryItem(){
        return inventoryItemService.getInventoryItem();
    }

    @PostMapping
    public InventoryItem addInventoryItem(@RequestBody InventoryItem inventoryItem){
        return inventoryItemService.addInventoryItem(inventoryItem);
    }
}
