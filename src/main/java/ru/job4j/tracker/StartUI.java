package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public String createdTime(Item item) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String itemCreated = formatter.format(item.getCreated());
        return itemCreated;
    }

    public static void main(String[] args) {
        Item item = new Item();
        StartUI startUI = new StartUI();
        System.out.println(startUI.createdTime(item));
    }
}
