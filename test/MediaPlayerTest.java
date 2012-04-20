/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.*;
import us.abaddonsoftware.bll.MediaPlayer;
import us.abaddonsoftware.bll.Playlist;
import us.abaddonsoftware.bll.Song;

/**
 *
 * @author abaddon
 */
public class MediaPlayerTest {
    Song newSong1;
    Song newSong2;
    Song newSong3;
    Playlist testPlaylist;
    MediaPlayer newPlayer;
    
    public MediaPlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() 
    {
        newSong1 = new Song( "Zombie", "Cranberries", "/home/abaddon/test.mp3"); // will fix when path is included
        newSong2 = new Song("Nerdy Girl", "Esther", "c:/");
        newSong3 = new Song("Zydrate Anatomy", "Repo: The Genetic Opera", "c:/");
        testPlaylist = new Playlist("Player Test");
        testPlaylist.addSong(newSong1);
        testPlaylist.addSong(newSong2);
        testPlaylist.addSong(newSong3);
        newPlayer = new MediaPlayer();
        newPlayer.loadPlaylist(testPlaylist);
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testGetCurrentSong()
    {
        assertEquals(newSong1, newPlayer.getCurrentSong());
    }
    @Test
    public void testNoNextSong()
    {
        assertTrue(newPlayer.getNextSong().compareTo(newSong2) == 0x0 && newPlayer.getNextSong().compareTo(newSong3) == 0x0 && newPlayer.getNextSong() == null);
    }
    @Test
    public void testGetNextSong()
    {
        assertTrue(newPlayer.getNextSong().compareTo(newSong2) == 0x0 && newPlayer.getNextSong().compareTo(newSong3) == 0x0);
    }
    @Test
    public void testPlay()
    {
        newPlayer.playSong();
        assertTrue(newPlayer.getIsPlaying());
    }
    @Test
    public void testStop()
    {
        newPlayer.playSong();
        newPlayer.stopSong();
        // System.out.println(newPlayer.getIsPlaying());
        assertFalse( newPlayer.getIsPlaying() );
    }
    
    @Test
    public void testAddSongShowsInCurrentPlayer() //Test to see if adding a song to the playlist passed to player updates the currently playing playlist in player
    {
      newPlayer.getNextSong();
      newPlayer.getNextSong();
      testPlaylist.addSong(newSong2);
      newPlayer.getNextSong();
      assertTrue(newPlayer.getCurrentSong().compareTo(newSong2) == 0x0); // need to change this assertion 
    }
}
