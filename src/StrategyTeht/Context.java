/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyTeht;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ottoj_000
 */
public class Context {
   
    private ListConverter muuntaja;

   public Context(ListConverter muuntaja){
      this.muuntaja = muuntaja;
   }

   public void executeStrategy(List list){
        muuntaja.listToString(list);
   }
}
