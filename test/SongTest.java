/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.TitanPlayer.BLL.Song;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Kendall
 */
public class SongTest {
    
    public SongTest() {
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
    public void getArtistTest(){
       Song newSong = new Song("Prince", "Batdance", "path");
       assertTrue("song.getArtist should return artist", newSong.getArtist().equals("Prince"));
    }
    @Test
    public void getTitleTest(){
        Song newSong = new Song("Prince", "Batdance", "path");
        assertTrue("song.getTitle should return title", newSong.getTitle().equals("Batdance"));
    }
     @Test
    public void getPathTest(){
        Song newSong = new Song("Prince", "Batdance", "path");
        assertTrue("song.getPath should return title", newSong.getPath().equals("Path"));
    }
    @Test
    public void equalsTest(){
        Song newSong1 = new Song("Brass in Pocket", "The Pretenders", "path");
        Song newSong2 = new Song("Brass in Pocket", "The Pretenders", "path");
        assertTrue(newSong1.equals(newSong2));
        
    }
}
