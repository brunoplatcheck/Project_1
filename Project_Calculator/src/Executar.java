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
                "|14=e^x||15=RAIZ3||16=X^3|\n");
        
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
            case 11:
                Logaritmo logarit=new Logaritmo();
                logarit.Logaritmo();
                break;
            case 12:
                Raiz raiz=new Raiz();
                raiz.Raiz();
                break;
            case 13:
                EleveTwo ele2=new EleveTwo();
                ele2.EleveTwo();
                break;
            case 14:
                Exponential exp=new Exponential();
                exp.Exponential();
                break;
            case 15:
                RootCubic root3=new RootCubic();
                root3.RootCubic();
                break;
            case 16:
                ElevCubic elev3=new ElevCubic();
                elev3.ElevCubic();
                break;
            default:
                System.out.println("Value invalid, inform another comand:");
                Executar ex=new Executar();
                ex.Menu();
                break;
            
        }

            
            System.out.println("\f");
           
            System.out.println("START NEW OPERATION?");
                comand=s.next();
            
        }while(comand.equalsIgnoreCase("OK"));
        System.out.println("Closing Program.");
    }
     
}
