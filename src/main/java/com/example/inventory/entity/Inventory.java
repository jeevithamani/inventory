package com.example.inventory.entity;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productname;
    private String productlabel;
    private Integer inventoryreceived;
    private Integer inventoryshipped;
    public Integer inventoryonhand;
    private String supplier;

    // getters and setters
}