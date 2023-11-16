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
class Raiz {
    private float valor;
    private int root;
    private float raiz;
    private String comand;
    Scanner s=new Scanner(System.in);
    void Raiz() {
        System.out.println("Insert a valor: ");
           valor=s.nextFloat();
           System.out.println("Insert a valor to do the root:");
           root=s.nextInt();
           raiz=(float) Math.pow(valor, root);
            System.out.println("Result= "+raiz);
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
