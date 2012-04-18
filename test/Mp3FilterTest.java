/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;
import us.abaddonsoftware.bll.MediaFilter;

/**
 *
 * @author abaddon
 */
public class Mp3FilterTest {
    
    public Mp3FilterTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAccept()
    {
        File file = new File("test.mp3");
        File file2 = new File("test.Mp3");
        File file3 = new File("test.MP3");
        File file4 = new File("test.mP3");
        MediaFilter mp3filter = new MediaFilter();
        assertTrue(mp3filter.accept(file) && mp3filter.accept(file2) && mp3filter.accept(file3) && mp3filter.accept(file4));
    }
    
    @Test
    public void testAcceptDoesNotAcceptNonMp3()
    {
        File file = new File("wish.jpg");
        File file2 = new File("mp3.doc");
        MediaFilter mp3filter = new MediaFilter();
        assertFalse(mp3filter.accept(file) && mp3filter.accept(file2));
    }
}
