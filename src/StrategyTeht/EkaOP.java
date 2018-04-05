/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyTeht;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ottoj_000
 */
public class EkaOP implements ListConverter{

    //Iteraattorilla, jokaisen alkion jälkeen rivivaihto
    @Override
    public void listToString(List list) {
        Iterator<String> crunchifyIterator = list.iterator();
            while (crunchifyIterator.hasNext()) {
                System.out.println(crunchifyIterator.next() + "\n");
            }
    }
    
}
