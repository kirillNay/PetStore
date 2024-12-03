package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаём магазин
        PetStore shop = new PetStore();

        // Добавляем товары
        Animal dog = new Animal("Собака", 300.0, 10);
        Animal fish = new Animal("Рабка", 10.0, 50);
        Food dogFood = new Food("Собачий корм", 20.0, 30);
        Food fishFood = new Food("Корм для рыб", 5.0, 100);

        shop.addProduct(dog);
        shop.addProduct(fish);
        shop.addProduct(dogFood);
        shop.addProduct(fishFood);

        // Список товаров
        shop.listProducts();

        // Поиск товара
        Product foundProduct = shop.findProductByName("Собака");
        if (foundProduct != null) {
            System.out.println("\nНайденный товар: " + foundProduct.getName() + " | Цена: $" + foundProduct.getPrice());
        } else {
            System.out.println("\nТовар не найден.");
        }

        // Продаём товар
        if (foundProduct != null) {
            foundProduct.sell(2);
        }

        // Список товаров после продажи
        System.out.println("\nТовары после продажи:");
        shop.listProducts();
    }
}
