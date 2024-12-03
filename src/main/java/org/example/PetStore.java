package org.example;

import java.util.ArrayList;
import java.util.List;

public class PetStore {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " | Цена: $" + product.getPrice() + " | Количество: " + product.getQuantity());
        }
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

}
