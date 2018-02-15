
package decorator_pattern.ticket_class;

public class SC2 extends Tickets{
     @Override
    public String getDescription() {
        return "AC1 – Primera clase con aire acondicionado";
    }
    
    @Override
    public double cost() {
        return 40.00;
    }
}
