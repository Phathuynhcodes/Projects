package com.revature.model;

public enum Category {
    HOUSEHOLD("HOUSEHOLD"),
    CLOTHING("CLOTHING"),
    PET_SUPPLIES("PET_SUPPLIES"),
    ELECTRONICS("ELECTRONICS");

    final String value;

    Category(String value) {this.value = value;}

}
