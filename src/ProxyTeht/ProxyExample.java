/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyTeht;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ottoj_000
 */
public class ProxyExample {
    
    /**
    * Test method
    */
   public static void main(final String[] arguments) {
       
        /**
        final Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
        **/  
       
        
        //Luodaan lista, ja lisätään sinne 4 kuvaa
        
        List meemikansio = new ArrayList();
        
        final Image kuva1 = new ProxyImage("surunlinen_sanmakko.png");
        final Image kuva2 = new ProxyImage("spurdo_spora.png");
        final Image kuva3 = new ProxyImage("säätö_sale.jpg");
        final Image kuva4 = new ProxyImage("avaruuskulttuuri.gif");
        
        Image meemi = new ProxyImage("");
        
        meemikansio.add(kuva1);
        meemikansio.add(kuva2);
        meemikansio.add(kuva3);
        meemikansio.add(kuva4);
        
        
        //Näytetään ja ladataan kuvat. 
        //En keksi miten muuten koko kansion listauksessa kuvat eivät lataisi.
        
        kuva1.displayImage();
        kuva2.displayImage();
        kuva3.displayImage();
        kuva4.displayImage();
        
        //Käydään kuvakansio läpi.
        
        System.out.println("\n Käydään läpi meemikansio: \n");
        for (int i = 0; i < meemikansio.size(); i++) {
            meemi = (Image) meemikansio.get(i);
            meemi.showData();
        }
        
        
        //Käyttäjä voi valita minkä kuvan haluaa nähdä.
        //Kuvat on jo ladattu ylhäällä, joten niitä ei ladata uudestaan.
        
        try {
            while (true) {
                System.out.println("\n" + "Valitse näytettävä kuva kirjoittamalla lukuja väliltä 1-4 ");
                int valittu =  parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                meemi = (Image) meemikansio.get(valittu - 1);
                meemi.showData(); 
            }
        } catch(Exception e) {
            System.exit(1);
        }
        
    }
    
}
