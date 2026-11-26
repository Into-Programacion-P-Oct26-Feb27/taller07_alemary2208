/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombreJ;
        String posicion;
        int edad;
        Double estatura;
        boolean medio = true;
        String reporte = "";
        double promEdad = 0;
        double promEsta = 0;
        double sumaEdad = 0;
        double sumaEsta = 0;
        int contador = 0;
        
        
        while (medio == true) {
            System.out.println("Ingrese el nombre del Jugador:");
            nombreJ = entrada.nextLine();
            System.out.println("Ingrese la posicion del Jugador:");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            sumaEdad = sumaEdad + edad;
            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            sumaEsta = sumaEsta + estatura;
            contador = contador + 1;
             
            reporte = String.format("%s%s\t%s\t%d\t%.2f\n", reporte, nombreJ, posicion, edad, estatura);

            
            String salir;
            System.out.println("Desea salir del ciclo. SI / NO.");
            salir = entrada.nextLine();
            if (salir.equals("SI")) {
                medio = false;
              
            }
            
    }
            promEdad = sumaEdad / contador;
            promEsta = sumaEsta / contador;
            reporte = String.format("%sPromedio Edad: %.2f\nPromedio Estatura: %.2f\n", reporte, promEdad, promEsta);
            System.out.printf("%s\n", reporte);
            
         
}
}
