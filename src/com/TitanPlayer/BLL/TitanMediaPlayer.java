package com.TitanPlayer.BLL;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kendall
 */
public class TitanMediaPlayer {
    
    
   private Playlist currentPlaylist;
   private int songIndexInPlaylist;
   private Song songToPlay;
    
    public TitanMediaPlayer(){
        
           
}
  
    
    
   
    
        
    

    public void loadPlaylist(Playlist playlistToAdd) {
        currentPlaylist = playlistToAdd;
        songIndexInPlaylist = 0;
        songToPlay = currentPlaylist.getSongFromIndex(songIndexInPlaylist);
        
    }
  
 public Song getCurrentSong(){
     return currentPlaylist.getSongFromIndex(songIndexInPlaylist);
     
 }
 public Song getNextSong(){
      if(songIndexInPlaylist < currentPlaylist.songCount())
           songIndexInPlaylist++ ;
      return currentPlaylist.getSongFromIndex(songIndexInPlaylist);
         
     }
  public Song getPreviousSong(){
      if((songIndexInPlaylist <= currentPlaylist.songCount()) && (songIndexInPlaylist > 0))
           songIndexInPlaylist-- ;
      return currentPlaylist.getSongFromIndex(songIndexInPlaylist);
         
     }

    public Song playCurrentSong(){
        return songToPlay;
       
       
                
    }

    public Song pauseCurrentSong() {
        return songToPlay;
    }
    
     public Song stopCurrentSong() {
        return songToPlay;    
         
     } 
         
    
            
        
        
        
    
 
}
