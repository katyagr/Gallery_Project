import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class GalleryTest {

    private Gallery gallery;
    private Artist artist;
    private Artwork artwork;

    @BeforeEach
    void setUp(){
        gallery = new Gallery("Test Gallery");
        artist = new Artist("Test Artist");
        artwork = new Artwork("Test Artwork", artist, 100, "sdfhs");
    }

    @Test
    void emptyArtworkList() {
        //given
        //when
        //then
        assertEquals(0, gallery.countArtworks());
    }

    @Test
    void addArtwork(){
        //given
        //when
        gallery.addArtwork(artwork);
        //then
        assertEquals(1, gallery.countArtworks());
    }

    @Test
    void removeArtwork(){
        //given
        //when
        gallery.addArtwork(artwork);
        gallery.removeArtwork(artwork);
        //then
        assertEquals(0, gallery.countArtworks());
    }
}
