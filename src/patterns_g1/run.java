package patterns_g1;

import composite_pattern.Hoja_Almuerzo;
import composite_pattern.Hoja_Cena;
import composite_pattern.Hoja_Ticket;
import composite_pattern.Paquete_Composite;
import decorator_pattern.extras.*;
import decorator_pattern.ticket_class.*;
import java.util.Scanner;
import state_pattern.*;

public class run {

    static Paquete_Composite paquete = new Paquete_Composite();
    static Hoja_Almuerzo almuerzo = new Hoja_Almuerzo();
    static Hoja_Cena cena = new Hoja_Cena();
    static Context context = new Context(); // CONTEXTO DE LA VENTANILLA

    public static void main(String[] args) {
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println("Bienvenido a la estación de transportes");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("================== MENU=================");
            System.out.println("(1) - Compra de Tiket");
            System.out.println("(2) - Estado de la Ventanilla");
            System.out.println("(3) - Salir");
            System.out.print("Ingrese su elección:\t");
            int selection = scanner.nextInt();
            if (selection == 1) {
                 if("Trabajando".equals(context.getState().toString())){
                    paquete = new Paquete_Composite();
                    menuTickets();
                 } else if ("Cerrada".equals(context.getState().toString())){
                      System.out.print("Lo sentimos la ventanilla ya fue cerrada\n\n");
                 } else if ("Suspendida".equals(context.getState().toString())){
                     System.out.print("Vuelva en 5 min la ventanilla no esta atendiendo en este momento \n\n");
                 }
                
            } else if (selection == 2) {
                menuVentanilla();
            } else if (selection == 3) {
                break;
            }

        }

    }

    public static void menuTickets() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la compra de ticket ");
        System.out.println("A continuación se le presentan las distintas clases con sus respectivos precios");
        System.out.println("(1) - AC1 – Primera clase con aire acondicionado - Q. 100");
        System.out.println("(2) - Sleeper Class - Q. 75");
        System.out.println("(3) - AC Chair Class - Q. 50");
        System.out.println("(4) - Second Sitting - Q.40");
        System.out.println("(5) - Regresar");
        System.out.print("Ingrese su elección:\t");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                Tickets newTiket = new AC1();
                System.out.println("A continuación se le presentan las distancias");
                System.out.println("(1) - 100 km");
                System.out.println("(2) - 200 km ");
                System.out.println("(3) - 300 km");
                System.out.println("(4) - Cancelar compra");
                selection = scanner.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket = new Membership(newTiket);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    case 2:
                        newTiket = new km_200(newTiket);
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket = new Membership(newTiket);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    case 3:
                        newTiket = new km_300(newTiket);
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket = new Membership(newTiket);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    default:

                }
                break;
            case 2:
                Tickets newTiket2 = new SC1();
                System.out.println("A continuación se le presentan las distancias");
                System.out.println("(1) - 100 km");
                System.out.println("(2) - 200 km ");
                System.out.println("(3) - 300 km");
                System.out.println("(4) - Cancelar compra");
                selection = scanner.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket2 = new Membership(newTiket2);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }

                        break;
                    case 2:
                        newTiket2 = new km_200(newTiket2);
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket2 = new Membership(newTiket2);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    case 3:
                        newTiket2 = new km_300(newTiket2);
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket2 = new Membership(newTiket2);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket2));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    default:
                }
                break;
            case 3:
                Tickets newTiket3 = new AC2();
                System.out.println("A continuación se le presentan las distancias");
                System.out.println("(1) - 100 km");
                System.out.println("(2) - 200 km ");
                System.out.println("(3) - 300 km");
                System.out.println("(4) - Cancelar compra");
                selection = scanner.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket3 = new Membership(newTiket3);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    case 2:
                        newTiket3 = new km_200(newTiket3);
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket3 = new Membership(newTiket3);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    case 3:
                        newTiket3 = new km_300(newTiket3);
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket3 = new Membership(newTiket3);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket3));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    default:
                }
                break;
            case 4:
                Tickets newTiket4 = new SC2();
                System.out.println("A continuación se le presentan las distancias");
                System.out.println("(1) - 100 km");
                System.out.println("(2) - 200 km ");
                System.out.println("(3) - 300 km");
                System.out.println("(4) - Cancelar compra");
                selection = scanner.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket4 = new Membership(newTiket4);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    case 2:
                        newTiket3 = new km_200(newTiket4);
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket4 = new Membership(newTiket4);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    case 3:
                        newTiket4 = new km_300(newTiket4);
                        System.out.println("Dispone de membresía");
                        System.out.println("(1) - Si");
                        System.out.println("(2) - No");
                        selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                newTiket4 = new Membership(newTiket4);
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("A continuación se le presentas las opciones de comida");
                                System.out.println("(1) - Almuerzo");
                                System.out.println("(2) - Cena");
                                System.out.println("(3) - Sin comida");
                                selection = scanner.nextInt();
                                switch (selection) {
                                    case 1:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(almuerzo);
                                        break;
                                    case 2:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                        paquete.add(cena);
                                        break;
                                    default:
                                        paquete.add(new Hoja_Ticket(newTiket4));
                                }
                                System.out.println("=====================");
                                System.out.println("Su compra : " + paquete.descripcion());
                                System.out.println("Total : " + Double.toString(paquete.precio()));
                                System.out.println("=====================");
                        }
                        break;
                    default:
                }
                break;
            default:
        }

    }

    public static void menuVentanilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estado de la ventanilla");
        System.out.println("(1) - Ventanilla abierta");
        System.out.println("(2) - Ventanilla cerrada");
        System.out.println("(3) - Ventanilla suspendida");
        System.out.println("(4) - Regresar");
        System.out.print("Ingrese su elección:\t");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                StartState startState = new StartState();
                startState.doAction(context);
                break;
            case 2:
                StopState stopState = new StopState();
                stopState.doAction(context);
                break;

            case 3:
                SuspendState supendState = new SuspendState();
                supendState.doAction(context);
                break;
            default:

        }

    }

}
