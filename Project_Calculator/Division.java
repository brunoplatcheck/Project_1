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
class Division {
    private float valor1;
    private float divisor;
    private float division;
    private String comand;
    Scanner s=new Scanner(System.in); 
    void Division() {
        System.out.println("Valor for the Dividend: ");
        valor1=s.nextFloat();
        System.out.println("Valor for the Divisor: ");
        divisor=s.nextFloat();
        do{
        if(divisor==0){
            System.out.println("Valor invalid, infor another valor");
            divisor=s.nextFloat();
        }
        }while(divisor==0);
        division=valor1/divisor;
            System.out.println("Result: "+division);
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
