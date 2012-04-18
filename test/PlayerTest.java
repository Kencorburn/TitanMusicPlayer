

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.TitanPlayer.BLL.Playlist;
import com.TitanPlayer.BLL.Song;
import com.TitanPlayer.BLL.TitanMediaPlayer;
import static org.junit.Assert.assertTrue;
import org.junit.*;

/**
 *
 * @author Kendall
 */
public class PlayerTest {
    
    public PlayerTest() {
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
    public void getCurrentSongTest(){
        TitanMediaPlayer myPlayer = new TitanMediaPlayer();
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong(new Song ("Britney Spears", "Toxic","path"));
        myPlayer.loadPlaylist(myPlaylist);
        assertTrue(myPlayer.getCurrentSong().equals(new Song("Britney Spears", "Toxic", "path")));
    }
    
    @Test
    public void getNextSongTest(){
        TitanMediaPlayer myPlayer = new TitanMediaPlayer();
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong(new Song("Britney Spears", "Toxic", "path"));
        myPlaylist.addSong(new Song("Lionel Ritchie", "Hello", "path"));
        myPlayer.loadPlaylist(myPlaylist);
        assertTrue(myPlayer.getNextSong().equals(new Song("Lionel Ritchie", "Hello","path")));
    }
  @Test
    public void getPreviousSongTest(){
        TitanMediaPlayer myPlayer = new TitanMediaPlayer();
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong(new Song("Britney Spears", "Toxic", "path"));
        myPlaylist.addSong(new Song("Lionel Ritchie", "Hello","path"));
        myPlayer.loadPlaylist(myPlaylist);
        assertTrue(myPlayer.getPreviousSong().equals(new Song("Britney Spears", "Toxic","path")));
    }
  @Test
    public void playCurrentSongTest(){
      TitanMediaPlayer myPlayer = new TitanMediaPlayer();
      Playlist myPlaylist = new Playlist();
      myPlaylist.addSong(new Song("The Rolling Stones", "Gimme Shelter", "path"));
      myPlayer.loadPlaylist(myPlaylist);
      assertTrue(myPlayer.playCurrentSong().equals(new Song("The Rolling Stones", "Gimme Shelter", "path")));
      }
  @Test
    public void pauseCurrentSongTest(){
      TitanMediaPlayer myPlayer = new TitanMediaPlayer();
      Playlist myPlaylist = new Playlist();
      myPlaylist.addSong(new Song("The Flaming Lips", "One More Robot,Sympathy 3000-21", "path"));
      myPlayer.loadPlaylist(myPlaylist);
      assertTrue(myPlayer.pauseCurrentSong().equals(new Song("The Flaming Lips", "One More Robot,Sympathy 3000-21","path")));
  }
   @Test
    public void stopCurrentSongTest(){
      TitanMediaPlayer myPlayer = new TitanMediaPlayer();
      Playlist myPlaylist = new Playlist();
      myPlaylist.addSong(new Song("Kanye West", "Say You Will","path"));
      myPlayer.loadPlaylist(myPlaylist);
      assertTrue(new Song("Kanye West", "Say You Will","path").equals(myPlayer.stopCurrentSong()));
  }
}