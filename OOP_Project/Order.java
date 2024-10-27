package OOP_Project;

public class Order {

    private User user;
    private Product product;
    private CreditCard creditCard;

    public Order(User user, Product product, CreditCard creditCard) {
        this.user = user;
        this.product = product;
        this.creditCard = creditCard;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public CreditCard getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    
    public Order() {

    }

    public void processOrder(Product product,User user,int quantity) {
      product.reduceStock(quantity);
      user.orderProduct(product, 0);
      
    }
}
