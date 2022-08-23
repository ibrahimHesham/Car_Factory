package com.carfactory.repository;

import com.carfactory.model.Customer;
import com.carfactory.model.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryItemRepository  extends JpaRepository<InventoryItem,Long> {
}
