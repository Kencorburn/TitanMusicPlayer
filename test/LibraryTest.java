/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.TitanPlayer.BLL.Playlist;
import com.TitanPlayer.BLL.Song;
import com.TitanPlayer.BLL.Library;
import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Kendall
 */
public class LibraryTest {
    
    public LibraryTest() {
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
   public void emptyLibraryTest(){
       Library emptyLibrary = new Library();
       assertEquals(0, emptyLibrary.songCount());
       
   }
   @Test
   public void addSongTest(){
       Library myLibrary = new Library();
       myLibrary.addSong(new Song("My Posse's on Broadway.", "Sir Mix-a-Lot", "path"));
       myLibrary.addSong(new Song("Brass Monkey", "Beastie Boys","path"));
       assertEquals(2, myLibrary.songCount());
       
   }
   @Test
   public void removeSongTest(){
       Library myLibrary = new Library();
       myLibrary.removeSong(new Song("My Posse's on Broadway.", "Sir Mix-a-Lot,", "path"));
       myLibrary.removeSong(new Song("Brass Monkey", "Beastie Boys", "path"));
       assertEquals(0, myLibrary.songCount());
   }
 @Test
   public void songExistanceTest(){
     Library myLibrary = new Library();
     myLibrary.addSong(new Song("Whodini", "The Freaks Come Out at Night", "path"));
     assertTrue(myLibrary.songExists(new Song("Whodini", "The Freaks Come Out at Night", "path")));
    
 }
 @Test 
      public void noDuploTest(){
     Library myLibrary = new Library();
     Song newSong = new Song("A", "B", "path");
     myLibrary.addSong(newSong);
     myLibrary.addSong(newSong);
     assertEquals(1, myLibrary.songCount());
 }
}

