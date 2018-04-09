/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ottoj_000
 */
public class Main {
    
    public static void main(String[] args) {
     
        Lähiesimies         lem = new Lähiesimies();
        YksikönPäällikkö    yp  = new YksikönPäällikkö();
        Toimari             toi = new Toimari();
        
        lem.setSeuraaja(yp);
        yp.setSeuraaja(toi);
        
        try {
            while (true) {
                System.out.println("Kokeile kenen pitää hyväksyä palkankorotuksesi. ");
                System.out.println(">");
                double d =  Double.parseDouble(new BufferedReader(new
                            InputStreamReader(System.in)).readLine());
                lem.processPyyntö(new Pyyntö(d));
            }
        } catch(Exception e) {
            System.exit(1);
        }
        
    }
}
