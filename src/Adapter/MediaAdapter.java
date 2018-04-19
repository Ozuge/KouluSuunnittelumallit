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
public class MediaAdapter implements Mediaplayer_IF{

    AdvancedMediaplayer_IF advplayer;
    
    public MediaAdapter(String audioType){
        			
        if(audioType.equalsIgnoreCase("vlc") ){
            advplayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")) {
            advplayer = new Mp4Player();
        }
        
    }
    
    @Override
    public void play(String audioType, String fileName) {
        
        if(audioType.equalsIgnoreCase("vlc")){
            advplayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advplayer.playMp4(fileName);
        }
        
    }
    
}
