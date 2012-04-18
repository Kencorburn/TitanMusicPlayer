/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;



/**
 *
 * @author abaddon
 */
public class MediaPlayer
{
    private Playlist activePlaylist;
    private int songIndexInPlaylist;
    private boolean isPlaying = false;
    private Song playingSong;   //currently not used but will be passed when play is implemented

    public void loadPlaylist(Playlist nameOfPlaylist)
    {
      activePlaylist = nameOfPlaylist;
      songIndexInPlaylist = 0;
    }
    
    public boolean getIsPlaying()
    {
        return isPlaying;
    }
    public void playSong()
    {
    
        if(isPlaying) { stopSong(); }
        if(getCurrentSong() != null)
        { 
        isPlaying = true;//this seems to work but isAlive is not modified by stop
        }
    }
    
    public void pauseSong()
    {
    }
    
    public String getPlayingSongsTrackName()
    {
        if (isPlaying)
        {
        return playingSong.getArtist();
        }
        return "Not Playing";
       
    }
     
      
        




    

    
    public void stopSong()
    {
        if(isPlaying)
        {
        isPlaying = false; //playingThread.isAlive();
        }
    }
    

 
  
    
    public Song getCurrentSong()
    {
     if(songIndexInPlaylist < 0 ) { songIndexInPlaylist = 0; }              
       if (songIndexInPlaylist >= activePlaylist.songCount())
       {
           songIndexInPlaylist = activePlaylist.songCount() - 1;
           return null;
       }
       return activePlaylist.getSongFromIndex(songIndexInPlaylist);
    }
    
    public Song getNextSong()
    {
        songIndexInPlaylist++;
         if(isPlaying)
        {
          playSong();
          return getCurrentSong();  
        }
        return getCurrentSong();
    }
    
    public Song getPrevSong()
    {
        songIndexInPlaylist--;

        if(isPlaying)
        {
          playSong();
          return getCurrentSong();  
        }
          return getCurrentSong();
    }

    public void setIndex(int selectedIndex) {
        songIndexInPlaylist = selectedIndex;
    }
    
    public int getIndex()
    {
        return songIndexInPlaylist;
    }


    
}
