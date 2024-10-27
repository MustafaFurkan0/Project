package OOP_Project;

import java.util.*;

public class User {

    private String username;
    private String name;
    private String surname;
    private String birthdate;
    private String password;
    private String email;
    private String homeAddress;
    private String workAddress;
    private List<Product> orderedProducts;
    private List<Product> favoriteProducts;
    private CreditCard creditCard;
    public int orderedProductCount;
    public int favoriteProductCount;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    public String getWorkAddress() {
        return workAddress;
    }
    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }
    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }
    public void setOrderedProducts(List<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }
    public List<Product> getFavoriteProducts() {
        return favoriteProducts;
    }
    public void setFavoriteProducts(List<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }
    public CreditCard getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    public int getOrderedProductCount() {
        return orderedProductCount;
    }
    public void setOrderedProductCount(int orderedProductCount) {
        this.orderedProductCount = orderedProductCount;
    }
    public int getFavoriteProductCount() {
        return favoriteProductCount;
    }
    public void setFavoriteProductCount(int favoriteProductCount) {
        this.favoriteProductCount = favoriteProductCount;
    }

    public User() {

    }

    public User(String username, String name, String surname, String birthdate, String password, String email, String homeAddress, String workAddress) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.password = password;
        this.email = email;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.orderedProducts = new ArrayList<>();
        this.favoriteProducts = new ArrayList<>();
        this.orderedProductCount = 0;
        this.favoriteProductCount = 0;
    }

    public void orderProduct(Product product, int quantity) {
        if (product.getStockInformation() >= quantity) {
            this.orderedProducts.add(product);
            product.setStockInformation(product.getStockInformation() - quantity);
        } else {
            // No action if stock is insufficient.
        }

    }

    public void addFavoriteProduct(Product product) {
        this.favoriteProducts.add(product);
    }

}
