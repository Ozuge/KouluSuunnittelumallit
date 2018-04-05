/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyTeht;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ottoj_000
 */
public class Main {
    
    public static void main(String[] args) {
        
        //luodaan lista
        List<String> ostoslista = new ArrayList<String>();
        
        ostoslista.add("Maito");
        ostoslista.add("Voi");
        ostoslista.add("Pekoni");
        ostoslista.add("Kananmunat");
        ostoslista.add("Olut");
        ostoslista.add("Jauhot");
        ostoslista.add("Sipulit");
        ostoslista.add("Sokeri");
        
        
        //itse hommat
        Context context1 = new Context(new EkaOP());
        System.out.println("1. Iteraattorilla: \n");
        context1.executeStrategy(ostoslista);
        
        System.out.println("");
        
        Context context2 = new Context(new TokaOP());
        System.out.println("2. for-loopilla/get-metodilla: \n");
        context2.executeStrategy(ostoslista);
       
        System.out.println("");
        
        Context context3 = new Context(new KolmasOP());
        System.out.println("3. For-loop/get-metodi: \n");
        context3.executeStrategy(ostoslista);
        
    }
}
