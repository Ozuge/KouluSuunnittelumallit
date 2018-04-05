/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyTeht;

import java.util.List;

/**
 *
 * @author ottoj_000
 */
public class TokaOP implements ListConverter{

    @Override
    public void listToString(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0 ) {
                System.out.println("\n");
            }
            System.out.println(list.get(i));
        }
    }
    
}
