
package decorator_pattern.ticket_class;

public class SC1 extends Tickets{
     @Override
    public String getDescription() {
        return "SC1 - Sleeper Class";
    }
    
    @Override
    public double cost() {
        return 75.00;
    }
}
