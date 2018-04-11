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
public interface PalkanmaksajaIF {
    public void visit(Talonpoika talonpoika);
    public void visit(Palkkasoturi palkkasoturi);
    public void visit(Ritari ritari);
}
