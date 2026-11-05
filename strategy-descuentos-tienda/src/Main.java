import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        carrito.agregar(new Producto("Audifonos", 120000, 1));
        carrito.agregar(new Producto("Cuaderno", 8500, 4));
        carrito.agregar(new Producto("Morral", 95000, 1));

        System.out.println("Subtotal:     " + pesos(carrito.getSubtotal()));
        System.out.println("Black Friday: " + pesos(carrito.calcularTotal(new BlackFriday())));
        System.out.println("Estudiante:   " + pesos(carrito.calcularTotal(new DescuentoEstudiante())));
        System.out.println("Bono 20 mil:  " + pesos(carrito.calcularTotal(new DescuentoBono())));
        System.out.println("Sin Promocion:  " + pesos(carrito.calcularTotal(new DescuentoSinPromocion())));
    }

    static String pesos(double valor) {
        return String.format(Locale.forLanguageTag("es-CO"), "$%,.0f", valor);
    }
}
