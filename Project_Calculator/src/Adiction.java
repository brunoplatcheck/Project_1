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
class Adiction {
    private float valor;
    private float valor2;
    private float soma=0;
    private String comand;
    Scanner s=new Scanner(System.in);
    
    void Adiction(){
        System.out.println("Valor:");
            valor=s.nextFloat();
            soma=soma+valor;
        do{
            System.out.println("Another value: ");
            valor2=s.nextFloat();
            soma=soma+valor2;
            System.out.println("Add a new valor?");
            comand=s.next();
            }while(comand.equalsIgnoreCase("y"));
        System.out.println("Result= "+soma);
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
