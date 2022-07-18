import java.util.Scanner;
import java.util.ArrayList;
import Paquete.*;


public class InicioProyecto extends menus{

    static Scanner variable = new Scanner(System.in);
    static Scanner entrada = new Scanner(System.in);

    //ArrayList<RegistroUsuario> listaPersonas = new ArrayList<RegistroUsuario>();
    //ArrayList<JuegosUsuario> listajuegos = new  ArrayList<JuegosUsuario>();

    boolean salir = false;
    boolean logInSuccess = false;
    boolean correct = false;

    static int opcion, opcionA, opcionB, x, telefono, dias, dias2, resultado, resultado2, cuantosjuegos, cuantosjuegos2;
    String id, nombre, apellido, usuario, clave, direccion, y, dmy, juegoquiere, eliminacion;

    void crearUsuario() {
        System.out.println("Cantidad de usuarios que sea crear ");
        x = variable.nextInt();

        for (int i = 1; i <= x; i++) {

            //final RegistroUsuario usu = new RegistroUsuario();

            System.out.println("Bienvenido ");
            //y = variable.nextLine();

            System.out.println("Ingrese su ID:");
            id = variable.nextLine();

            System.out.println("Ingrese su Nombre:");
            nombre = variable.nextLine();

            System.out.println("Ingrese su Apellido:");
            apellido = variable.nextLine();

            System.out.println("Ingrese su Usuario:");
            usuario = variable.nextLine();

            System.out.println("Ingrese su Clave:");
            clave = variable.nextLine();

            System.out.println("Ingrese su direccion:");
            direccion = variable.nextLine();

            System.out.println("Ingrese su numero de telefono:");
            telefono = variable.nextInt();

            //listaPersonas.add(new RegistroUsuario(id, nombre, apellido, usuario, clave, direccion, telefono));
        }

        //for (int i = 0; i < listaPersonas.size(); i++) {
        //    System.out.println((i + 1) + " " + listaPersonas.get(i));
        //}
    }

    void validaUsuario() {
        int intentos = 0;
        do {
            logInSuccess = false;
            System.out.println("Ingrese sus datos*");
            
            System.out.println("Ingrese su usuario*");
            usuario = variable.nextLine();
            System.out.println("Ingrese su Clave:");
            clave = variable.nextLine();
            
                
                if (usuario.equals("admin") && clave.equals("admin")) {
                    logInSuccess = true;
                    
                }
            
            if (logInSuccess) {
                menuPrincipal();
            } else {
                System.out.println("datos incorrectos:");
            }
            intentos++;
        } while (intentos <= 3 && logInSuccess == false);
    }

    int intentos = 0;

    void menuUsuario2() {

        do{

         final ArrayList<String> Pc = new ArrayList<String>();
            Pc.add("Fortnite");
            Pc.add("Resident evil");
            Pc.add("Apex_legends");
            Pc.add("Minecraft");
            Pc.add("Counter_strike");
            Pc.add("Halo Reach");
            
        System.out.println(" ************ Menu ****************");
        System.out.println("* 1 - Juegos                      **");
        System.out.println("* 2 - Alquiler del juego           *");
        System.out.println("* 3 - Devolucion del juego rentado *");
        System.out.println("* 4 - Mostrar juegos rentados      *");
        System.out.println("* 5 - Salir del menu               *");
        System.out.println(" **********************************");
        final int eleccion = variable.nextInt();
        final int intentos = 0;

            switch (eleccion) {
                case 1:
                    System.out.println("1.- Juegos para Pc ");
                    System.out.println("0.- Salir del menu de juegos");
                    final int opcionB = variable.nextInt();
                    switch (opcionB) {

                        case 1:
                            System.out.println("");
                            System.out.println("--------------------------");
                            System.out.println("|   Ha elegido Pc        |");
                            System.out.println("--------------------------");
                            System.out.println("Estos son los juegos de Pc");
                            Pc.forEach((x) -> System.out.println(x));

                        case 0:
                            boolean Salir = true;
                        break;
                        }
                        break;

              case 2:
                 System.out.println(" -----------------------------------");
                 System.out.println("|  Cuantos juegos quiere alquilar   |");
                 System.out.println(" -----------------------------------");
                 int limite = entrada.nextInt();

                 System.out.println("Que juego quiere alquilar");  //hacer un for con los limites
                   // meterlo en el for 
                     // hacer un limite en int
                     //ArrayList listaJuegos  ;
                 for (int i = 0;i <= limite; i++){
                     //String juego= variable.next();
                 	//listajuegos.add(new JuegosUsuario(listajuegos));
                    //final JuegosUsuario juegosbusca = listajuegos.get(i);
                   
                 }

                 System.out.println(" -----------------------------------");
                 System.out.println("|Por cuantos dias alquilara su juego|");
                 System.out.println(" -----------------------------------");
                 dias = entrada.nextInt();

                 if (dias > 0){
                    for (int i = 8; i >= dias; i++){
                         System.out.println("El precio de alquiler por: " + cuantosjuegos + " Juego/s " 
                         					+ " El total de: " + dias + " dias" + " Usted debe de pagar: " + dias*8 + " Quetzales por cada juego rentado ");
                         break;
                    } 
                 }
                break;

                case 3:
                 System.out.println("Cuantos juegos rento: ");
                 	cuantosjuegos = entrada.nextInt();
                 System.out.println("Cuantos juegos devolvera: ");
                	 cuantosjuegos2 = entrada.nextInt();
                		 resultado2 = cuantosjuegos - cuantosjuegos2;

                 System.out.println(" ---------------------------");
                 System.out.println("|Cuantos dias rento el juego| ");
                 System.out.println(" ---------------------------");
                 dias = variable.nextInt();

                System.out.println(" -------------------------------------------------");
                System.out.println("|A los cuantos dias lo devolvio de haberlo rentado| ");
                System.out.println(" -------------------------------------------------");
                dias2 = variable.nextInt();
                resultado = dias - dias2;

                if (dias > 0){
                    for (int i = dias; i <= dias; i++){
                         for (int j = 8; j >=dias2; j++ ) {
                            System.out.println("Usted rento: " + cuantosjuegos + " juego/s " + "" + " Y devolvera: " + cuantosjuegos2 + " juego/s ");
                            System.out.println("");
				            System.out.println("Usted rento el juego por: " + dias + " dias" +""+ " Y lo devolvio a los: " + dias2 +""+ " dias " +
				                                "Entonces se le debe de dolver: " + resultado*8 + "" + " Quetzales por los juego que devolvio");
                            break;   
                         }
                         break;
                    } 
                 }
                break;

                case 4:
                 System.out.println("-- Mostrar los juegos en su perfil -- ");
                 System.out.println("Los juegos que usted a rentado son: "  ); // tostring o un arraylist y hacer una clase diferente, 

                break;
            }

        }while (intentos <= 7 && logInSuccess == false);
    }

    public static void main(final String[] args) {
        final InicioProyecto proyecto = new InicioProyecto();
        int intentos = 0;
        
                proyecto.validaUsuario();
                intentos++;
        
        
            System.out.println("Gracias vuelva pronto :)");
        
    }
}