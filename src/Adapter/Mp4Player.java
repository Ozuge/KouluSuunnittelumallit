/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author ottoj_000
 */
public class Mp4Player implements AdvancedMediaplayer_IF{

    @Override
    public void playVlc(String fileName) {
        //luontaisesti ei tehdä mitään...
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
    
}
