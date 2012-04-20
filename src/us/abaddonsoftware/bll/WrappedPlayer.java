/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;

import java.io.File;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.*;

/**
 *
 * @author abaddon
 */
class WrappedPlayer implements BasicPlayerListener
{
    private BasicController control;
    private BasicPlayer player;
    private boolean isFinished = false;
    private BasicPlayerEvent bpe2;
    public void loadSong(String path) 
    {
        try 
        {
            File file = new File(path);
            player = new BasicPlayer();
            control = (BasicController) player;
            //player.addBasicPlayerListener(this);
            control.open(file);
        }
        catch (BasicPlayerException ex)
        {
            Logger.getLogger(WrappedPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addBasicPlayerListener(BasicPlayerListener bpl)
    {
        player.addBasicPlayerListener(bpl);
    }
    public void playSong() 
    {
        try 
        {
            control.play();
            System.out.println(player.getStatus());
        }
        catch (BasicPlayerException ex) 
        {
            Logger.getLogger(WrappedPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void stopSong() 
    {
        try 
        {
            control.stop();
            System.out.println(player.getStatus());
        }
        catch (BasicPlayerException ex)
        {
            Logger.getLogger(WrappedPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void pauseSong() 
    {
        try 
        {
            control.pause();
        }
        catch (BasicPlayerException ex)
        {
            Logger.getLogger(WrappedPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void resumeSong()
    {
        try 
        {
            control.resume();
        }
        catch (BasicPlayerException ex) 
        {
            Logger.getLogger(WrappedPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void opened(Object o, Map map) {
        
    }

    @Override
    public void progress(int i, long l, byte[] bytes, Map map) {
        
    }
    
    @Override
    public void stateUpdated(BasicPlayerEvent bpe) 
{

  
 }

    @Override
    public void setController(BasicController bc) {
       
    }

}