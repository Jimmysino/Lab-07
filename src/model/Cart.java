package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    public Cart() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Producto añadido: " + product.getName() + " - S/." + product.getPrice());
    }
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;}

    public List<Product> getProducts() {
        return products;
    }}