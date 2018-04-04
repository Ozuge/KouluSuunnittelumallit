/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statetehtävä;

/**
 *
 * @author ottoj_000
 */
public interface State {
    public void hyökkää(Context context);
    public void karju(Context context);
    public void hyppää(Context context);
}
