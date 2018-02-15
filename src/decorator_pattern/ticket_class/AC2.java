
package decorator_pattern.ticket_class;

public class AC2 extends Tickets{
     @Override
    public String getDescription() {
        return "AC2 - Chair Class";
    }
    
    @Override
    public double cost() {
        return 50.00;
    }
}
