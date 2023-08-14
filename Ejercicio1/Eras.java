/* Programación orientada a objetos.
 * @author Jose Pablo Ordoñez Barrios
 * @version 1.0 
*/
// importar random y scanner de util
import java.util.Random;
import java.util.Scanner;

public class Eras {
    public static void main(String[] args) {
        // nuevas instancias.
        Comprador compra = new Comprador();
        Localidad loca3 = new Localidad();
        Localidad loca2 = new Localidad();
        Localidad loca1 = new Localidad();
        Ticket ticket = new Ticket();
        Random rand = new Random();
        Scanner opcion = new Scanner(System.in);
        Scanner datos = new Scanner(System.in);
        // nuevas variables
        boolean run = true;
        int no1 = 0;
        int no2 = 0;
        // asignar el número de localidad.
        loca3.setNolocalidad(3);
        loca2.setNolocalidad(2);
        loca1.setNolocalidad(1);
        // asignar el precio de cada localidad.
        loca1.setPrecio(100);
        loca2.setPrecio(500);
        loca3.setPrecio(1000);
        // asignar disponibilidad a cada localidad.
        loca1.setDisponible(20);
        loca2.setDisponible(20);
        loca3.setDisponible(20);
        // While donde funciona todo el programa.
        while (run) {
            // Menú para que el usuario pueda navegar por el programa.
            System.out.println("----- Bienvenido al programa -----");
            System.out.println("Ingresa una opción: ");
            System.out.println("1. Nuevo comprador ");
            System.out.println("2. Nueva solicitud de boleto ");
            System.out.println("3. Consultar disponibilidad total ");
            System.out.println("4. Consultar disponibilidad individua ");
            System.out.println("5. Reporte de caja ");
            System.out.println("6. Salir ");
            int menu = opcion.nextInt();
            opcion.nextLine();
            // Switch para realizar una acción según lo que escogió el usuario.
            switch (menu) {
                case 1:
                    // reemplaza la instancia actual del comprador activo
                    // solicitar y almacenar nombre
                    System.out.println("Ingresa tu nombre");
                    String nombre = datos.nextLine();
                    compra.setNombre(nombre);
                    // solicitar y almacenar correo electronico.
                    System.out.println("Ingresa tu Correo Electrónico");
                    String correo = datos.nextLine();
                    compra.setEmail(correo);
                    // solicitar y almacenar boletos
                    System.out.println("Ingresa la cantidad de boletos deseados");
                    int boletos = datos.nextInt();
                    compra.setBoletos(boletos);
                    // solicitar y almacenar presupuesto
                    System.out.println("Ingresa tu presupuesto");
                    int presupuesto = datos.nextInt();
                    datos.nextLine();
                    compra.setPresupuesto(presupuesto);
                    // mostrar los datos almacenados del comprador.
                    System.out.println("Tu nombre es: " + compra.getNombre() + ", tu Email es: " + compra.getEmail()
                            + ", la cantidad de boletos deseada es: " + compra.getBoletos() + ", y tu presupuesto es: $"
                            + compra.getPresupuesto());

                    break;

                case 2:
                    // permite al comprador actual participar para comprar boletos.
                    // Generar número aleatorio para el No. de ticket y los númeor para verificar.
                    ticket.setNoboleto(rand.nextInt(15000) + 1);
                    no1 = rand.nextInt(15000) + 1;
                    no2 = rand.nextInt(15000) + 1;
                    System.out.println("No. Ticket: " + ticket.getNoboleto() + " Valor verificador No.1: " + no1
                            + " Valor verificador No.2: " + no2);
                    // Verificar si el usuario es apto verificando que el No. de ticket esté entre los números verificadores.
                    if ((ticket.getNoboleto() >= no1 && ticket.getNoboleto() <= no2)
                            || (ticket.getNoboleto() >= no2 && ticket.getNoboleto() <= no1)) {
                        System.out.println("Eres apto para adquirir un boleto");
                        // Número random para seleccionar la localización
                        int local = rand.nextInt(3) + 1;
                        if (local == 1) {
                            System.out.println("Has sido seleccionado para la localidad 1");
                            // Restricciones para saber si el usuario es apto para comprar boletos.
                            if ((loca1.getDisponible() == 0) || (compra.getPresupuesto() < loca1.getPrecio())) {
                                System.out.println("No puesdes comprar boletos");
                                break;
                            } else {
                                // Almacena la cantidad de dinero y de boletos comprados.
                                loca1.setTdinero(loca1.getTdinero() + (compra.getBoletos()*loca1.getPrecio()));
                                loca1.setTboleto(loca1.tboleto + compra.getBoletos());
                                System.out.println("Se han vendido: " + compra.getBoletos() + " Boletos.");
                            }
                        } else if (local == 2) {
                            System.out.println("Has sido seleccionado para la localidad 2");
                            if ((loca2.getDisponible() == 0) || (compra.getPresupuesto() < loca2.getPrecio())) {
                                System.out.println("No puesdes comprar boletos");
                                break;
                            } else {
                                loca3.setTdinero(loca2.getTdinero() + (compra.getBoletos()*loca2.getPrecio()));
                                loca2.setTboleto(loca2.tboleto + compra.getBoletos());
                                System.out.println("Se han vendido: " + compra.getBoletos() + " Boletos.");
                            }
                        } else if (local == 3) {
                            System.out.println("Has sido seleccionado para la localidad 3");
                            if ((loca3.getDisponible() == 0) || (compra.getPresupuesto() < loca3.getPrecio())) {
                                System.out.println("No puesdes comprar boletos");
                                break;
                            } else {
                                loca3.setTdinero(loca3.getTdinero() + (compra.getBoletos()*loca3.getPrecio()));
                                loca3.setTboleto(loca3.tboleto + compra.getBoletos());
                                System.out.println("Se han vendido: " + compra.getBoletos() + " Boletos.");
                            }
                        }
                    } else {
                        System.out.println("No eres apto para adquirir un boleto");

                        break;
                    }

                    break;

                case 3:
                    // se muestran cuántos boletos se han vendido en cada localidad y cuantos
                    // boletos hay disponibles para las 3 localidades.
                    int totalb = loca1.getTboleto() + loca2.getTboleto() + loca3.getTboleto();
                    int dispt = 60 - totalb;
                    System.out.println("Boletos vendidos en Localidad 1: " + loca1.getTboleto());
                    System.out.println("Boletos vendidos en Localidad 2: " + loca2.getTboleto());
                    System.out.println("Boletos vendidos en Localidad 3: " + loca3.getTboleto());
                    System.out.println("La cantidad de boletos disponibles en total es: " + dispt);

                    break;

                case 4:
                    // Se le pide al usuario que defina una localidad y se muestran solo los boletos
                    // disponibles para la localidad seleccionada.
                    System.out.println("¿De que localidad desea ver la disponibilidad?");
                    int donde = datos.nextInt();
                    datos.nextLine();
                    // Switch para saber que localidad quiere el usuario conocer la disponibilidad.
                    switch (donde) {
                        case 1:
                            int tbol1 = 20 - loca1.getTboleto();
                            System.out.println("La cantidad de boletos disponibles en la localidad 1 es: " + tbol1);
                            break;

                        case 2:
                            int tbol2 = 20 - loca2.getTboleto();
                            System.out.println("La cantidad de boletos disponibles en la localidad 2 es: " + tbol2);
                            break;

                        case 3:
                            int tbol3 = 20 - loca3.getTboleto();
                            System.out.println("La cantidad de boletos disponibles en la localidad 3 es: " + tbol3);
                            break;
                    }

                    break;

                case 5:
                    // Mostrar cuánto se ha generado de dinero dados los boletos vendidos en las 3
                    // localidades.
                    int totald = loca1.getTdinero() + loca2.getTdinero() + loca3.getTdinero();
                    System.out.println("Entre las 3 localidades se ha generado un todal de: $" + totald);

                    break;

                case 6:
                    // termina la ejecución del programa.
                    System.out.println("----- Programa finalizado -----");
                    run = false;
            }
        }
    }
}
