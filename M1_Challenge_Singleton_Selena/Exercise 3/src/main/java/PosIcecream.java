public class PosIcecream {
    private float cost;
    private String flavor;
    private int numberOfScoops;
    private String topping;
    private final float costPerScoop = 2.5f;

    public PosIcecream(float cost, String flavor, int numberOfScoops, String topping) {
        this.cost = cost;
        this.flavor = flavor;
        this.numberOfScoops = numberOfScoops;
        this.topping = topping;
    }

    public float costOfIcecream() {
     cost = numberOfScoops * costPerScoop;
        return cost;
    }

    public void displayIcecream() {
        System.out.println("The total cost of your cone is" + cost);
    }

    public float changeDue(float moneySpent) {
        return moneySpent - cost;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public void setNumberOfScoops(int numberOfScoops) {
        this.numberOfScoops = numberOfScoops;
    }
}
