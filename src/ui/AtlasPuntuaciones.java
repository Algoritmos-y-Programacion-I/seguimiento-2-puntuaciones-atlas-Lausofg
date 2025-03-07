// Análisis (completar)
// Descripción del programa:
// Entradas:
// Salidas:
// Ejemplo:


package ui; // No olvidar especificar el paquete / carpeta de nuestro programa

import java.util.Scanner; // Para poder usar Scanner, debemos importarlo

public class AtlasPuntuaciones {

	// Declaración del Escaner que nos ayudará en todo el programa
	private Scanner escaner;

	// Declaración de nuestras constantes a utilizar
	 	private final int MINIMO_CANTIDAD_JUGADORES=1;
		private final int MAXIMO_CANTIDAD_JUGADORES =10;
	  
	  private final int MINIMORONDAS =1;
	  private final int MAXIMORONDAS =5;
      private final int MINIMOPUNTAJE =0;
      private final int MAXIMOPUNTAJE =100;

	private AtlasPuntuaciones() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{

			int numerojugadores;
			int numeroderondas;

		// Declaracion de todas las variables a usar en el programa
		
		// aqui en este paso solicitaremos la cantidad de jugadores 
		 
		  System.out.println ("Holaa, ingresame la cantidad de jugadores que deseas :3");
		  numerojugadores = escaner.nextInt();
		  escaner.nextLine();
		      System.out.println ("Holaa, ingresame tambien el numero rondas que deseas :3");

          numeroderondas = escaner.nextInt();
		  escaner.nextLine();
		  
           System.out.println ("Holaa, ingresame tambien el numero rondas que deseas :3");

			/*
		   MINIMO_CANTIDAD_JUGADORES + "-" +
		   MAXIMO_CANTIDAD_JUGADORES +"):");
		   */
			if(numerojugadores<MINIMO_CANTIDAD_JUGADORES && numerojugadores>MAXIMO_CANTIDAD_JUGADORES){

				System.out.println ("no es un valor ");

			}
              while(numerojugadores<MINIMO_CANTIDAD_JUGADORES && numerojugadores>MAXIMO_CANTIDAD_JUGADORES);
		    /* solicitamos la cantidad de rondas en esta area 
            */ 
            System.out.println ("Ingresa por fis la cantidad de rondas"+MINIMORONDAS + MAXIMORONDAS);
			  numeroderondas = escaner.nextInt();
			  if(numeroderondas<MINIMORONDAS && numeroderondas>MAXIMORONDAS);
              
            System.out.println ("Este valor no es valido D:"); 

			  while(numeroderondas<minimorondas && numerorondas>maximorondas);{

			  }
			  /*
			  usemos arreglos para poner los nombres como tambien los puntajes que nos piden 

			  */

			 String[][] nombres= new String[numerojugadores][numeroderondas];
	}
			  
                
	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	/**
	 * Descripción: El método calcularSumaTotal permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public int calcularSumaTotal(int[] numeros) {
       return 0;
    }

	/**
	 * Descripción: El método calcularPromedio permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public double calcularPromedio(int[] numeros) {
        return 0;
    }

	/**
	 * Descripción: El método encontrarMayor permite ...
	 * @param double[] numeros
	 * @return 
	 */
    public double encontrarMayor(double[] numeros) {
        return 0;
    }

	

	
}