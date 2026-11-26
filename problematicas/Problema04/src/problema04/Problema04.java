/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int limite;
        int posicion = 1;
        int numerador = 1;
        int denominador = 1;
        String signo;
        String reporte = "";

        System.out.println("Ingrese el limite");
        limite = entrada.nextInt();

        if (limite > 0) {
            System.out.println("Limite correcto");
        } else {
            System.out.println("Limite incorrecto");
            limite = 8; 
        }

        while (posicion <= limite) {
            if (posicion % 2 == 0) {
                signo = "-";
            } else {
                signo = "+";
            }

            if (posicion == 1) {
                reporte = String.format("%s%d ", reporte, numerador);
            } else {
                reporte = String.format("%s%s %d/%d ", reporte, signo, numerador, denominador);
            }

            posicion = posicion + 1;
            denominador = denominador + 2;
        }

        System.out.printf("Serie: %s\n", reporte);

    }
}
    


