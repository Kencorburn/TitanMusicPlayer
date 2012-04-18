/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.TitanPlayer.BLL.Playlist;
import com.TitanPlayer.BLL.Song;
import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Kendall
 */
public class PlaylistTest {
    
    public PlaylistTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   @Test
   public void emptyPlaylistTest(){
      
       Playlist emptyPlaylist = new Playlist();
       Scanner Playlist = new Scanner(System.in);
       assertEquals(0, emptyPlaylist.songCount());
   }
   @Test
   public void addSongTest(){
       Playlist myPlaylist = new Playlist();
       myPlaylist.addSong(new Song("Pavane.", "Gabriel Faure", "path"));
       myPlaylist.addSong(new Song("Once in a Lifetime", "The Talking Heads", "path"));
       assertEquals(2, myPlaylist.songCount());
       
   }
   @Test
   public void removeSongTest(){
       Playlist myPlaylist = new Playlist();
       myPlaylist.removeSong(new Song("Pavane.", "Gabriel Faure", "path"));
       myPlaylist.removeSong(new Song("Once in a Lifetime", "The Talking Heads", "path"));
       assertEquals(0, myPlaylist.songCount());
    }
}