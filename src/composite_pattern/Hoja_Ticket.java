/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_pattern;

import decorator_pattern.ticket_class.Tickets;

/**
 *
 * @author Adrian
 */
public class Hoja_Ticket implements Ticket_Componente{
    
    Tickets ticket;
    
    @Override
    public double precio() {
        return ticket.cost();
    }
    
    @Override
    public String descripcion() {
        return "Paquete de: " + ticket.getDescription();
    }
    
    public Hoja_Ticket(Tickets t){
        this.ticket = t;
    }

}
