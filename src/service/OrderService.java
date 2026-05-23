package service;

import adapter.PaymentProcessor;
import model.Cart;
import observer.OrderObserver;
import strategy.DiscountStrategy;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<OrderObserver> observers;

    public OrderService() {
        this.observers = new ArrayList<>();
    }
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }
    public void processOrder(Cart cart, DiscountStrategy discountStrategy, PaymentProcessor paymentProcessor) {
        double subtotal = cart.calculateTotal();
        double finalTotal = discountStrategy.applyDiscount(subtotal);
        paymentProcessor.pay(finalTotal);
        System.out.println("Compra confirmada por S/"+finalTotal);
        notifyObservers("Orden completada");
    }
    private void notifyObservers(String message) {
        for (OrderObserver observer : observers) {
                    observer.update(message);
        }
    }
}