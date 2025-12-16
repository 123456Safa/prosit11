package org.example;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(3, "Café", 2.5);
        Product p2 = new Product(1, "Thé", 1.5);
        Product p3 = new Product(2, "Chocolat", 3.0);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        ProductManagement pm = new ProductManagement();

        System.out.println("=== Tous les produits ===");
        pm.displayProducts(products, System.out::println);
        System.out.println("\n=== Produits avec prix > 2 ===");
        pm.displayProductsByFilter(products,
                product -> product.getPrix() > 2,
                System.out::println);

        String noms = pm.returnProductsNames(products, Product::getNom);
        System.out.println("\n=== Noms des produits ===");
        System.out.println(noms);
        Product p4 = pm.createProduct(() -> new Product(4, "Jus", 2.0));
        products.add(p4);
        System.out.println("\n=== Produit créé via Supplier ===");
        System.out.println(p4);
        List<Product> sortedProducts = pm.sortProductsById(products,
                Comparator.comparingInt(Product::getId));
        System.out.println("\n=== Produits triés par ID ===");
        pm.displayProducts(sortedProducts, System.out::println);

        System.out.println("\n=== Stream des produits avec prix <= 2 ===");
        pm.convertToStream(products)
                .filter(product -> product.getPrix() <= 2)
                .forEach(System.out::println);
    }
}
