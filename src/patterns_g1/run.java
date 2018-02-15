package patterns_g1;

import decorator_pattern.extras.*;
import decorator_pattern.ticket_class.*;
import java.util.Scanner;

public class run {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la estación de transportes");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("================== MENU=================");
            System.out.println("(1) - Comprar Tiket");
            System.out.println("(2) - Salir");
            System.out.print("Ingrese su elección:\t");
            int selection = scanner.nextInt();
            if (selection == 1) {
                menuTickets();
            } else if (selection == 2) {
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket2.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket2.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket2.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket2.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket2.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket2.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket2.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket2.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket2.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket2.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket2.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket2.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket3.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket3.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket3.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket3.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket3.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket3.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket3.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket3.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket3.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket3.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket3.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket3.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket4.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket4.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket4.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket4.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket4.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket4.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket4.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket4.cost()));
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
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket4.getDescription());
                                System.out.println("Total : " + Double.toString(newTiket4.cost()));
                                System.out.println("=====================");
                                break;
                            default:
                                System.out.println("=====================");
                                System.out.println("Su compra : " + newTiket4.getDescription());
                                System.out.println("Su compra : " + Double.toString(newTiket4.cost()));
                                System.out.println("=====================");
                        }
                        break;
                    default:
                }
                break;
            default:
        }

    }

}
