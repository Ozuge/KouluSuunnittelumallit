/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author ottoj_000
 */
public class Main {
    
    public static void main(String[] args) {
        KelloCache.loadCache();
        
        Kello klooniTun = (Kello) KelloCache.getKello("1");
        Kello klooniMin = (Kello) KelloCache.getKello("2");
        Kello klooniSek = (Kello) KelloCache.getKello("3");
        
        System.out.println  ("Kello on: " + klooniTun.getAika() + 
                            ":" + klooniMin.getAika() + ":" + klooniSek.getAika());
        
    }
}
