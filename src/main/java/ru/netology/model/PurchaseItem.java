package ru.netology.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseItem {
    private int itemId;
    private int itemPrice;
    private int count;
}
