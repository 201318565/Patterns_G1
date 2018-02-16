package state_pattern;

public class Context {
       //SINGLETON
    private static Context SINGLETON;
    public static Context getSingleton(){
        if (SINGLETON==null){
            SINGLETON = new Context();
        }
        return SINGLETON;
    }
    //FIN-SIGLENTON     
   private State state;

   public Context(){
      state = null;
   }

   public void setState(State state){
      this.state = state;		
   }

   public State getState(){
      return state;
   }
}