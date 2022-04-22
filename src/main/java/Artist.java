import java.util.ArrayList;

public class Artist {

    private String name;
    private ArrayList<Artwork> artworks;

    public Artist(String name){
        this.name = name;
        this.artworks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }

    public void addArtwork(Artwork artwork){
        artworks.add(artwork);
    }

    public int countArtworks(){
        return this.artworks.size();
    }
}
