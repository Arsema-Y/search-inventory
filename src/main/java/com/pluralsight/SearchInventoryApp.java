package com.pluralsight;

import java.util.ArrayList;

public class SearchInventoryApp {
    public static void main(String[] args) {
        ArrayList<Product> products = getProducts();
        System.out.println("We carry the following inventory: ");

        //loop to go thru the ArrayList
        //    counter ;  limit     ; iteration update
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    product.getId(), product.getName(), product.getPrice());
        }

        //dataType(class) varName: array name
        for(Product product: products){

            System.out.printf( ". id: %d %s - Price: $%.2f%n",
                    product.getId(), product.getName(), product.getPrice());
        }
    }

    public static ArrayList<Product> getProducts() {

        ArrayList<Product> inventory = new ArrayList<Product>();
        // this method loads product objects into inventory
        // int, string, float
        Product product1 = new Product(4567, "10' 2x4 (grade B)", 9.99f);
        Product product2 = new Product(1234, "Hammer", 19.49f);
        Product product3 = new Product(2345, "Box of nails", 9.29f);

        //add objects into inventory ArrayList
        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);

        // and its details are not shown
        return inventory;
    }

}

