/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/



import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_NOCHES_OPEDAJE= 150000;
    final double COSTO_TRAYECTO_AVION = 500000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();

        // ...
        System.out.println("Bienvenido " + nombre + "!");
        // ...

        // Declaracion de salidas calculadas (completar)
        double totalTransporte;
        int noches;

        // Calculo de salidas mediante metodos (completar)
                 // aqui podrian faltar parametros
        System.out.println("Perfecto " + nombre + " Me podria decir tu edad? ");
        String edad;
        edad = escaner.nextLine();
        System.out.println("Perfecto " + nombre +(" entonces tienes ") + edad +(" años"));
        System.out.println("Me podria decir tu numero de Documento de Identidad");
        String DNI;
        DNI = escaner.nextLine();
        System.out.println("Ahora me puedes decir desde que ciudad te comunicas");
        String ciudad;
        ciudad = escaner.nextLine();
        System.out.println("Bienvenido a EVENTOS ATLAS, cuantas noches deseas hospedarte?");
        noches = escaner.nextInt();
        totalTransporte = calcularTotalTransporte(noches, COSTO_NOCHES_OPEDAJE);
    
        double op = noches*COSTO_NOCHES_OPEDAJE;
    



       System.out.println("Entonces tu ospedaje costaria " + COSTO_TRAYECTO_AVION );
                       
	}

    public double calcularTotalTransporte(int noches, double COSTO_NOCHES_OPEDAJE) {
        double op = noches*COSTO_NOCHES_OPEDAJE;
        return op; // Completar operacion
    }
	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */

	

	
}