/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int limite;
        int posicion = 1;
        int resultado = 0;
        int incremento = 2;
        String reporte = "";

        System.out.println("Ingrese el limite");
        limite = entrada.nextInt();
        
        if (limite > 0 && limite <= 10){
            System.out.println("Limite correcto");
        }else {
            System.out.println("Limite incorrecto");
            limite = 10;
        }
        while (posicion <= limite) {
            resultado = posicion * (posicion + 1);
            
            reporte = String.format("%s%d\tIncremento: %d\n", reporte, resultado, incremento);

            
            posicion = posicion + 1;
            incremento = incremento + 2;
        }

        System.out.printf("%s", reporte);
        
        
    }
    
}
