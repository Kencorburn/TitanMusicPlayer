/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TitanPlayer.BLL;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kendall
 */
public class Library {
    
    List<Song> songs;
    
    public Library(){
        songs = new ArrayList<>();
    }
    
    
    public boolean addSong(Song songToAdd){
        if(!songExists(songToAdd)){
           songs.add(songToAdd);
           return true;
        }
         return false;   
        
               
    }
    public void removeSong(Song songToRemove){
        songs.remove(songToRemove);
    }
    
    public int songCount(){
        return songs.size();
        
    }
    public boolean songExists(Song songToCheck){
        return songs.contains(songToCheck);
        
    }
            
}
