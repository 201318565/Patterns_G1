/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_pattern;

public class SuspendState implements State{
       @Override
   public void doAction(Context context) {
      System.out.println("La atención en la ventanilla esta suspendida!!!!!!!!!!!");
      context.setState(this);	
   }

   @Override
   public String toString(){
      return "Suspendida";
   }
}
