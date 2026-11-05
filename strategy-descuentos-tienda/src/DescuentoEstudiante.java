public class DescuentoEstudiante implements EstrategiaDescuento{
    @Override 
    public double calcularTotal(double subtotal){
        return subtotal*0.9;
    }
    
}
