public class BlackFriday implements EstrategiaDescuento{
    @Override 
    public double calcularTotal(double subtotal){
        return subtotal * 0.8;
    }
}
