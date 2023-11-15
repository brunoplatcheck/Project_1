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
class Dezelevado {
    private int valor;
    private int result=10;
    private String comand;
    Scanner s=new Scanner(System.in);
    void Dezelevado() {
        System.out.println("Insert a valor: ");
           valor=s.nextInt();
        for(int x=1;x<valor;x++){
            result=result*10;
        }
           System.out.println("Result= "+result);
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
