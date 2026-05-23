#1. Descripción del problema abordado.
El ejercicio trata sobre desarrollar una tienda virtual en java usando los tres patrones aprendidos en clase se puede hacer descuentos, agregar productos y formas de pagor y recibir notificaciones gracias al patron observer
#2. Explicación de los patrones dentro del contexto de la tienda
Para strategy:
  Permite a las tres clases implementadas tener distintos tipos de descuento sin modificar su composicion
Para adapter:
  Adapata CreditCardPaymentProcessor y ExternalPayPalService con la clase PayPalAdapter  
Para Observer:
  Sirve para crear el sistema de notificaciones de la tienda para las clases EmailNotificationObserver InventoryObserver AdminNotificationObserver llamando a update()
  

--- TIENDA VIRTUAL ---
Producto añadido: Teclado Gamer - S/.350.0
Producto añadido: Audifonos Gamer - S/.600.0
Producto añadido: Pantalla hz Gamer - S/.1000.0
Pago realizado con PayPal: PEN 1755.0
Compra confirmada por S/1755.0
Mandando correo al cliente.................
Actualizando inventario...
Notificando al administrador...
