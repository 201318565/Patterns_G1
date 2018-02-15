package composite_pattern;

public class Hoja_Almuerzo implements Ticket_Componente{

    @Override
    public double precio() {
        return 25;
    }

    @Override
    public String descripcion() {
        return ", con almuerzo";
    }
    
    
}
