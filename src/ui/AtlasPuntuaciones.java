package ui;
import java.util.Scanner;

public class AtlasPuntuaciones {
    private Scanner escaner;
    private final int MINIMO_CANTIDAD_JUGADORES = 1;
    private final int MAXIMO_CANTIDAD_JUGADORES = 10;
    private final int MINIMORONDAS = 1;
    private final int MAXIMORONDAS = 5;
    private final int MINIMOPUNTAJE = 0;
    private final int MAXIMOPUNTAJE = 100;
    
    private AtlasPuntuaciones() {
        escaner = new Scanner(System.in);
    }
    
    public void run() {
        int numerojugadores;
        int numeroderondas;
        do {
            System.out.print("Ingrese la cantidad de jugadores :3 (" + MINIMO_CANTIDAD_JUGADORES + "-" + MAXIMO_CANTIDAD_JUGADORES + "): ");
            numerojugadores = escaner.nextInt();
        } while (numerojugadores < MINIMO_CANTIDAD_JUGADORES || numerojugadores > MAXIMO_CANTIDAD_JUGADORES);
        do {
            System.out.print("Ingrese la cantidad de rondas :D (" + MINIMORONDAS + "-" + MAXIMORONDAS + "): ");
            numeroderondas = escaner.nextInt();
        } while (numeroderondas < MINIMORONDAS || numeroderondas > MAXIMORONDAS);
        
        String[] nombres = new String[numerojugadores];
        int[][] puntajes = new int[numerojugadores][numeroderondas];
        for (int i = 0; i < numerojugadores; i++) {
            System.out.println("Ingresa el nombre del jugador :3 " + (i + 1) + ":");
            nombres[i] = escaner.next();
            for (int j = 0; j < numeroderondas; j++) {
                int puntaje;
                do {
                    System.out.printf("Ingrese el puntaje de %s en ronda %d (%d-%d): ", nombres[i], (j + 1), MINIMOPUNTAJE, MAXIMOPUNTAJE);
                    puntaje = escaner.nextInt();
                    if (puntaje < MINIMOPUNTAJE || puntaje > MAXIMOPUNTAJE) {
                        System.out.println("Puntaje inválido D:. Debe ser entre " + MINIMOPUNTAJE + " y " + MAXIMOPUNTAJE + ".");
                    }
                } while (puntaje < MINIMOPUNTAJE || puntaje > MAXIMOPUNTAJE);
                puntajes[i][j] = puntaje;
            }
        }
        
        int[] totales = new int[numerojugadores];
        double[] promedios = new double[numerojugadores];
        double[] totalesDouble = new double[numerojugadores];
        for (int i = 0; i < numerojugadores; i++) {
            totales[i] = calcularSumaTotal(puntajes[i]);
            totalesDouble[i] = totales[i];
            promedios[i] = calcularPromedio(puntajes[i]);
        }
        double mayorTotal = encontrarMayor(totalesDouble);
        int indiceGanador = 0;
        for (int i = 0; i < numerojugadores; i++) {
            if (totales[i] == mayorTotal) {
                indiceGanador = i;
                break;
            }
        }
        System.out.println("\nResultados del Torneo:");
        for (int i = 0; i < numerojugadores; i++) {
            System.out.println(nombres[i] + " - Total: " + totales[i] + ", Promedio: " + String.format("%.2f", promedios[i]));
        }
        System.out.println("\nEl jugador con la mayor puntuación es: " + nombres[indiceGanador]);
    }
    
    public static void main(String[] args) {
        AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
        mainApp.run();
    }
    
    public int calcularSumaTotal(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }
    
    public double calcularPromedio(int[] numeros) {
        int suma = calcularSumaTotal(numeros);
        return (double) suma / numeros.length;
    }
    
    public double encontrarMayor(double[] numeros) {
        double mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }
}







