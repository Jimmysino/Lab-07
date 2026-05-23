import adapter.ExternalPayPalService;
import adapter.PayPalAdapter;
import adapter.PaymentProcessor;
import model.Cart;
import model.Product;
import observer.AdminNotificationObserver;
import observer.EmailNotificationObserver;
import observer.InventoryObserver;
import service.OrderService;
import strategy.DiscountStrategy;
import strategy.PercentageDiscountStrategy;

public class Main {
    public static void main(String[] args) {
        // 1. Crear productos
        System.out.println("--- TIENDA VIRTUAL ---");
        Product teclado= new Product("Teclado Gamer", 350.00);
        Product audifonos = new Product("Audifonos Gamer", 600.00);
        Product pantalla = new Product("Pantalla 144 hz Gamer", 1000.00);
        // 2. Agregar productos al carrito
        Cart cart = new Cart();
        cart.addProduct(teclado);
        cart.addProduct(audifonos);
        cart.addProduct(pantalla);

        OrderService orderService = new OrderService();
        orderService.addObserver(new EmailNotificationObserver());
        orderService.addObserver(new InventoryObserver());
        orderService.addObserver(new AdminNotificationObserver());
        // 3. Aplicar estrategia de descuento
        DiscountStrategy discount = new PercentageDiscountStrategy(0.10);
        // 4. Procesar pago usando Adapter
        ExternalPayPalService externalPayPal = new ExternalPayPalService();
        PaymentProcessor paymentMethod = new PayPalAdapter(externalPayPal);

        // Procesar order
        orderService.processOrder(cart, discount, paymentMethod);
    }
}