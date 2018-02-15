/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class Paquete_Composite implements Ticket_Componente{
    //lista para hacer el paquete
    private List<Ticket_Componente> lista = new ArrayList();
    
    @Override
    public double precio() {
        int precio = 0;
        for(Ticket_Componente tc : lista){
            precio += tc.precio();
        }
        return precio;
    }
    
    @Override
    public String descripcion() {
        String desc = "";
        for(Ticket_Componente tc : lista){
            desc += tc.descripcion();
        }
        return desc;
    }
    
    public void add(Ticket_Componente componente) {
        lista.add(componente);
    }
    // Removes the graphic from the composition.
    public void remove(Ticket_Componente componente) {
        lista.remove(componente);
    }

}
