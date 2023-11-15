/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
class Executar {
    private String comand;
    private int controler;
    
    Scanner s=new Scanner(System.in);
    
    
    void Menu(){
        do{
        System.out.println("=========CALCULATOR=========================");
        System.out.println("CHOOSE YOUR ACTION:");
        System.out.println("|1=+||2=-||3=*||4=/|\n|5=^2||6=RAIZ||7=!n|\n"+
                "|8=x^y||9=10^x||10=LN|\n|11=Log||12=YraizX||13=2^X|"+
                "");//continuar a partir do 11
        
        controler=s.nextInt();
        switch(controler){
            case 1:
                  Adiction add=new Adiction();
                  add.Adiction();
                  break;
            case 2:
                  Substraction sub=new Substraction();
                  sub.Substraction();
                  break;
            case 3:
                Multiplication multi=new Multiplication();
                multi.Multiplication();
                break;
            case 4:
                Division div=new Division();
                div.Division();
                break;
            case 5:
                Potencia2 pot2=new Potencia2();
                pot2.Potencia2();
                break;
            case 6:
                RaizQuad rq=new RaizQuad();
                rq.RaizQuad();
                break;
            case 7:
                Fatorial fat=new Fatorial();
                fat.Fatorial();
                break;
            case 8:
                 Potencia pot=new Potencia();
                 pot.Potencia();
                 break;
            case 9:
                Dezelevado deze=new Dezelevado();
                deze.Dezelevado();
                break;
            case 10:
                LN ln=new LN();
                ln.LN();
                break;
            
        }

            
            System.out.println("\f");
           
            System.out.println("START NEW OPERATION?");
                comand=s.next();
            
        }while(comand.equalsIgnoreCase("OK"));
        System.out.println("Closing Program.");
    }
     public static void limparConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Para Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Para sistemas Unix-like (Linux, macOS)
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException ex) {
            // Lidar com exceções, se necessário
            ex.printStackTrace();
        }
    }
}
