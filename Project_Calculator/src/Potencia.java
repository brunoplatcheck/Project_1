/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

/**
 *
 * @author 181700028
 */
class Potencia {
    private float valor;
    private int expoent;
    private float pot;
    private String comand;
    Scanner s=new Scanner(System.in);
     void Potencia(){
           System.out.println("Insert a valor: ");
           valor=s.nextFloat();
           System.out.println("Insert a valor to elevate the number:");
           expoent=s.nextInt();
           pot=valor;
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
