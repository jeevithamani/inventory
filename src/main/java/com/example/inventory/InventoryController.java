package com.example.inventory;

import com.example.inventory.entity.Inventory;
import com.example.inventory.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


@RestController
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;


    @GetMapping("/inventory/{product}")
    public ResponseEntity<Integer> checkStock(@PathVariable(name="product") String product)
    {
        Inventory result =  inventoryRepository.findByProductname(product);
        return ResponseEntity.status(HttpStatus.OK).body(result.inventoryonhand);
    }
}
