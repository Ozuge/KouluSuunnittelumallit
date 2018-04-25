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
public abstract class Kello implements Cloneable{
    
    int aika;
    Tunti tun;
    Minuutti min;
    Sekunti sek;
    
    private String ID;
    
    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return ID;
    }
    
    public int getAika(){
        return aika;
    }
    
    public Object clone() {
      Object clone = null;
      
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      
      return clone;
   }
    
}
