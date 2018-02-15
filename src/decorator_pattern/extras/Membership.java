
package decorator_pattern.extras;
import decorator_pattern.ticket_class.Tickets;

public class Membership extends Extras_Decorator{
    
    public Membership(Tickets b){
        this.Tikect = b;
    }
      
    @Override
    public String getDescription() {
        return Tikect.getDescription() + ", descuento por membresía";    
    }

    @Override
    public double cost() {        
        return Tikect.cost() - 35;
    }
}
