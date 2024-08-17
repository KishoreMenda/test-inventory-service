package dev.kishoremenda.microservices.inventory.service;

import org.springframework.stereotype.Service;

import dev.kishoremenda.microservices.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity) {


        //find in inventory for a given sku code and quantity
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }

}
