/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
class Logaritmo {
    private double valor;
    private double base;
    private double result;
    private String comand;
    Scanner s=new Scanner(System.in);
    void Logaritmo() {
        System.out.println("Inform a value: ");
        valor=s.nextDouble();
        System.out.println("Inform the base: ");
        base = s.nextDouble();

        result = calcularLog(valor, base);

        System.out.println("Result:  " + result);
        
        System.out.println("Wish realise another operation?");
        comand=s.next();
        if(comand.equalsIgnoreCase("Y")){
            Executar ex=new Executar();
            ex.Menu();
        }else{
            System.out.println("Closing Program.");
        }
    }
        public static double calcularLog(double valor, double base) {
        if (valor <= 0 || base <= 0) {
            return Double.NaN;
        }

        if (base == 10) {
            return Math.log10(valor);
        }

        return Math.log(valor) / Math.log(base);
    
    }

    
        
    
}
