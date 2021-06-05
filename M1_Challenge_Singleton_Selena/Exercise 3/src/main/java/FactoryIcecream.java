public class FactoryIcecream {
    private int numberOfGallons;
    private String flavor;
    private float cost;
    private final float pricePerGallon = 5;


    public FactoryIcecream(int numberOfGallons, String flavor, float cost) {
        this.numberOfGallons = numberOfGallons;
        this.flavor = flavor;
        this.cost = cost;
    }

    public float costOfIcecream() {
        cost = numberOfGallons * pricePerGallon;
        return cost;
    }

    public void displayIcecream() {
        System.out.println("The total cost of your order is" + cost);
    }

    public float cashDue(float moneySpent) {
        return moneySpent - cost;
    }

    public int getNumberOfGallons() {
        return numberOfGallons;
    }

    public void setNumberOfGallons(int numberOfGallons) {
        this.numberOfGallons = numberOfGallons;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}

