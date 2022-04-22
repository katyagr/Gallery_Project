import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    public ArrayList<Artwork> artworks;

    public Gallery(String name){
        this.name = name;
        this.till = 1000;
        this.artworks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public void removeArtwork(Artwork artwork){
        this.artworks.remove(artwork);
    }

    public int countArtworks(){
        return this.artworks.size();
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "name='" + name + '\'' +
                ", artworks=" + artworks +
                '}';
    }
}
