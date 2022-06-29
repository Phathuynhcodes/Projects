package com.revature.model;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer productId;

    private String name;
    private String description;
    private Category category;

    private Double price;
    private Integer quantityOnHand;
}
