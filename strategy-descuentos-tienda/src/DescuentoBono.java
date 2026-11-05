public class DescuentoBono implements EstrategiaDescuento{
    @Override 
    public double calcularTotal(double subtotal){
        if (subtotal  >= 150000){
            return subtotal-20000;
        }
        return subtotal;
    }
    
}
