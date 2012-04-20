/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;

import java.util.Map;
import javax.swing.ImageIcon;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;



/**
 *
 * @author abaddon
 */
public class MediaPlayer implements BasicPlayerListener
{
    Playlist activePlaylist;
    private int songIndexInPlaylist;
    private boolean isPlaying = false;
    private boolean isPaused = false;
    private ImageIcon playIcon = new javax.swing.ImageIcon(getClass().getResource("/us/abaddonsoftware/titanplayer/playbutton.png"));
    private ImageIcon pauseIcon = new javax.swing.ImageIcon(getClass().getResource("/us/abaddonsoftware/titanplayer/pause.png"));
    private ImageIcon dualIcon = playIcon;
    //   private boolean isFinished = false;
    private Song playingSong;   
    private WrappedPlayer wrappedPlayer = new WrappedPlayer();
    
    public MediaPlayer()
    {
     activePlaylist = new Playlist("Default");
    } 
 
    public ImageIcon getImageIcon()
    {
      return dualIcon;
    }

    public Playlist getActivePlaylist()
    {
        return activePlaylist;
    }
    
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
        
        wrappedPlayer.loadSong(getCurrentSong().getPath());
        wrappedPlayer.addBasicPlayerListener(this);
        wrappedPlayer.playSong();
        isPlaying = true;   //this seems to work but isAlive is not modified by stop
        }
    }
    
    public void pauseSong() 
    {
        wrappedPlayer.pauseSong();
        isPaused = true;
    }
    
    public void resumeSong()
    {
        
        wrappedPlayer.resumeSong();
        isPaused = false;
    }
    public boolean getIsPaused()
    {
        return isPaused;
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

        wrappedPlayer.stopSong();
        isPlaying = false; //playingThread.isAlive();
    
    }
    

 
  
    
    public Song getCurrentSong()
    {
       if(songIndexInPlaylist < 0 ) { songIndexInPlaylist = 0; }              
       if (songIndexInPlaylist >= activePlaylist.songCount())
       {
           songIndexInPlaylist = activePlaylist.songCount() - 1;
           return null;
       }
     //  Song temp = new Song("h","a","k");
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

    @Override
    public void opened(Object stream, Map properties) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) {
        
    }

    @Override
    public void stateUpdated(BasicPlayerEvent event) {
        System.out.println(event.getCode());
       if (event.getCode() == 8)
       {
         getNextSong();     
       }
     
   
      
       
    }

    @Override
    public void setController(BasicController controller) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    
}
