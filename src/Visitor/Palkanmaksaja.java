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
public class Palkanmaksaja implements PalkanmaksajaIF{

    double palkka;
    
    @Override
    public void visit(Talonpoika talonpoika) {
        System.out.println("Talonpoika saa palkaksi lähinnä turpaansa.");
        talonpoika.massit = talonpoika.getMassit() + 1;
        
    }

    @Override
    public void visit(Palkkasoturi palkkasoturi) {
        System.out.println("Palkkasoturi saa palkakseen 100 kultarahaa.");
        palkkasoturi.massit = palkkasoturi.getMassit() + 100;
    }

    @Override
    public void visit(Ritari ritari) {
        System.out.println("Ritari saa palkakseen prinsessan ja puoli valtakuntaa");
        ritari.massit = ritari.getMassit() + 10000;
    }
    
}
