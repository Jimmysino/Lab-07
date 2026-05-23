package observer;

public class EmailNotificationObserver implements OrderObserver {
    @Override
    public void update(String message) {
        System.out.println("Mandando correo al cliente.................");
    }
}