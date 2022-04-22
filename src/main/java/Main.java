public class Main {
    public static void main(String[] args) {

        Gallery testGallery = new Gallery("Bright");
        Artist testArtist = new Artist("Katya");
        Artwork testArtwork = new Artwork("test", testArtist, 22, "gfsaliudfghsdlji");

        System.out.println(testGallery.artworks);

    }

}
