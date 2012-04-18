/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;



/**
 *
 * @author abaddon
 */
public class Song implements Comparable<Song>
{
    private String title;
    private String artist;
    private String path;
    
   /* public Song(String songTitle, String songArtist)
    {
        title = songTitle;
        artist = songArtist;
    }*/
    
    public Song(String songTitle, String songArtist, String songPath)
    {
        title = songTitle;
        artist = songArtist;
        path = songPath; //C:/Documents and Settings/Music/Rihanna-Wicked.mp3
    }
    
    public String getPath()
    {
        return path;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    
  
    @Override
    public int compareTo(Song songToCompare) 
    {
    int result = this.getArtist().compareTo(songToCompare.getArtist());
     if(result == 0)
     {
         result = this.getTitle().compareTo(songToCompare.getTitle());
     }
    return result; 
    }
  @Override
  public boolean equals(Object song)
  {
      Song otherSong = (Song) song;
      if (this == otherSong)
      {
          return true;
      }
      
      return ( otherSong.getArtist().equals(this.getArtist()
              ) && (otherSong.getTitle().equals(this.getTitle())));
  }


    @Override
    public String toString()
    {
        return artist + " : " + title + "\n";
    }
}
