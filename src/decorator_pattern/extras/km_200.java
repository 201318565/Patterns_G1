
package decorator_pattern.extras;
import decorator_pattern.ticket_class.Tickets;

public class km_200 extends Extras_Decorator{
    
    public km_200(Tickets b){
        this.Tikect = b;
    }
      
    @Override
    public String getDescription() {
        return Tikect.getDescription() + ", mas de 200 km";    
    }

    @Override
    public double cost() {        
        return Tikect.cost() + 100;
    }
}
