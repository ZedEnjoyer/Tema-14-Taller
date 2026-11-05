public class DescuentoSinPromocion implements EstrategiaDescuento {
    @Override 
    public double calcularTotal(double subtotal){
        return subtotal;
    }
    
}
