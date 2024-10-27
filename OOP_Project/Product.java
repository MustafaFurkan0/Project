package OOP_Project;

public class Product {

    private String productName;
    private String color;
    private String category;
    private int stockInformation;
    private double weight;
    private String descriptionInformation;

    public Product(String productName, String color, String category, int stockInformation, double weight, String descriptionInformation) {
        this.productName = productName;
        this.color = color;
        this.category = category;
        this.stockInformation = stockInformation;
        this.weight = weight;
        this.descriptionInformation = descriptionInformation;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStockInformation() {
        return stockInformation;
    }

    public void setStockInformation(int stockInformation) {
        this.stockInformation = stockInformation;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescriptionInformation() {
        return descriptionInformation;
    }

    public void setDescriptionInformation(String descriptionInformation) {
        this.descriptionInformation = descriptionInformation;
    }

    public Product() {

    }

    public void reduceStock(int amount) {
        if (amount > 0 && this.stockInformation >= amount) {
            this.stockInformation -= amount;

        } else {
            //Not enough stock available to reduce quantity
        }
    }
}
