package com.ankur.interview.multithreading.concurrency;

public class Item {
    private long itemId;
    private String itemName;

    public Item(long id, String s) {
        this.itemId =id;
        this.itemName=s;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
