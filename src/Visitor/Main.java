/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author ottoj_000
 */
public class Main {
    
    public static void main(String[] args) {
    
    Context         context = new Context();
    
    Talonpoika      jussi   = new Talonpoika();
    Palkkasoturi    olaf    = new Palkkasoturi();
    Ritari          ricardo = new Ritari();
    
    
    System.out.println( "Tänään on palkkapäivä." 
                        + "\n" + 
                        "Jokainen valtakunnan asukki kerääntyy linnan pihalle odottamaan palkanmaksua." 
                        + "\n" + 
                        "Ennen palkanmaksua pitää ilmoittaa palkanmaksajalle kuka olet."
                        + "\n" + 
                        "Palkanmaksun jälkeen kysellään fiiliksiä ja saldon tilannetta." 
                        + "\n");
    
    
    jussi.ilmoittaudu(context);
    jussi.accept(new Palkanmaksaja());
    jussi.asiakaskysely(context);
    
    System.out.println("\n");
    
    olaf.ilmoittaudu(context);
    olaf.accept(new Palkanmaksaja());
    olaf.asiakaskysely(context);
    
    System.out.println("\n");
    
    ricardo.ilmoittaudu(context);
    ricardo.accept(new Palkanmaksaja());
    ricardo.asiakaskysely(context);
   }
}
