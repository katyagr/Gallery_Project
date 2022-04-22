import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ArtistTest5 {

    @Test
    void emptyArtworkList() {
        //given
        Artist artist = new Artist("Test name");
        //when
        //then
        assertEquals(0, artist.countArtworks());

    }
}
