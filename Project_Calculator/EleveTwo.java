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
class EleveTwo {
    private float valor;
    private int expoent;
    private float pot=2;
    private String comand;
    Scanner s=new Scanner(System.in);
    void EleveTwo() {

           System.out.println("Insert a valor to elevate 2: ");
           valor=s.nextFloat();
           for(int x=1;x<expoent;x++){
               pot=pot*valor;
           }
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
    

