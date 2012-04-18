package com.TitanPlayer.BLL;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kendall
 */
public class Song {
    
    private String artist;
    private String title;
    private String path;
    public Song(String trackArtist, String trackTitle, String trackPath){
       artist = trackArtist;
       title = trackTitle; 
       path = trackPath; //path
}
    public String getArtist(){
        return artist;
        
    }
   public String getTitle(){
      return title;
  }
   public String getPath(){
       return path;
   }
  @Override
  public String toString(){
      return artist + " : " + title;
      
  }
   
  @Override
  public boolean equals(Object song){
      Song newSong = (Song)song;
      if(this == newSong){
          return true;
      }
          
      return (newSong.getArtist().equals(this.getArtist()) && newSong.getTitle().equals(this.getTitle()));

      
  }
}
