package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] products = new Product[3];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println();
        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println();
        System.out.println("Shown only product.count > 10");
        for (Product product : products) {
            if (product.getCount() > 10) {
                System.out.println(product.getName() + " - " + product.getCount());
            }
        }
    }
}