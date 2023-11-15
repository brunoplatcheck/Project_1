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
class Potencia2 {
    private float valor;
    private float pot;
    private String comand;
    Scanner s=new Scanner(System.in);
   void Potencia2() {
            System.out.println("Valor:");
            valor=s.nextFloat();
            pot=valor*valor;
        System.out.println("Result= "+pot);
        System.out.println("Wish realise another operation?");
        comand=s.next();
        if(comand.equalsIgnoreCase("Y")){
            Executar ex=new Executar();
            ex.Menu();
        }else{
            System.out.println("Closing Program.");
        }
    }
    
}
