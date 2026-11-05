import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregar(Producto producto) {
        productos.add(producto);
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (Producto p : productos) {
            subtotal += p.getSubtotal();
        }
        return subtotal;
    }

    // SINTOMA: cada promocion nueva obliga a abrir y modificar este metodo
    public double calcularTotal(EstrategiaDescuento estrategia) {
        double subtotal = getSubtotal();
        if(estrategia == null){
            return subtotal;
        }
        return estrategia.calcularTotal(subtotal);
    }
}
