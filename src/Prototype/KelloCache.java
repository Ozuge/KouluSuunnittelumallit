/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.Hashtable;

/**
 *
 * @author ottoj_000
 */
public class KelloCache {
    
    private static Hashtable<String, Kello> kelloMap  = new Hashtable<String, Kello>();
     
    public static Kello getKello(String kelloID) {
        Kello cachedKello = kelloMap.get(kelloID);
        return (Kello) cachedKello.clone();
    }

    public static void loadCache() {
        
        Tunti tun = new Tunti();
        Minuutti min = new Minuutti();
        Sekunti sek = new Sekunti();
        
        tun.setTunti(12);
        min.setMinuutti(30);
        sek.setSekunti(0);
        
        tun.setID("1");
        min.setID("2");
        sek.setID("3");
        
        kelloMap.put(tun.getID(), tun);
        kelloMap.put(min.getID(), min);
        kelloMap.put(sek.getID(), sek);
    }
}
