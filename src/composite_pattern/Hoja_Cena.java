package composite_pattern;

public class Hoja_Cena implements Ticket_Componente{

    @Override
    public double precio() {
        return 30;
    }

    @Override
    public String descripcion() {
        return ", con cena";
    }
    
    
}
