package com.TitanPlayer.BLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kendall
 */
public class Playlist{
    
    
    
    List<Song> songs;
    
     public Playlist(){
      songs = new ArrayList();
       
        
        
    }
    
    public void addSong(Song songToAdd){
        songs.add(songToAdd);
    }

    public int songCount(){
        return songs.size();
}

    public void removeSong(Song songToRemove) {
        songs.remove(songToRemove);
    }
    public Song getSongFromIndex(int songIndex){
        return songs.get(songIndex);
    }
  
    
}

