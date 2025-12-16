package org.example;

import java.util.List;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface Management {

    void displayProducts(List<Product> products, Consumer<Product> con);

    void displayProductsByFilter(List<Product> products,
                                 Predicate<Product> pre,
                                 Consumer<Product> con);

    String returnProductsNames(List<Product> products,
                               Function<Product, String> fun);

    Product createProduct(Supplier<Product> sup);

    List<Product> sortProductsById(List<Product> products,
                                   Comparator<Product> com);

    Stream<Product> convertToStream(List<Product> products);
}
