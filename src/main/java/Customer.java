import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Artwork> customerArtworks;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.customerArtworks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getCustomerArtworks() {
        return customerArtworks;
    }

    public void setCustomerArtworks(ArrayList<Artwork> customerArtworks) {
        this.customerArtworks = customerArtworks;
    }

    public void buyArtwork(Artwork artwork, Gallery gallery) {
        if (this.wallet >= artwork.getPrice()) {
            for (Artwork buyingArtwork : gallery.artworks) {
                if (buyingArtwork.equals(artwork)) {
                    this.customerArtworks.add(artwork);
                    gallery.removeArtwork(buyingArtwork);
                    this.wallet -= artwork.getPrice();
                    gallery.setTill(gallery.getTill() + artwork.getPrice());
                }
            }
        }
    }
}
