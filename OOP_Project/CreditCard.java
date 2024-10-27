package OOP_Project;

public class CreditCard {

    private String cardNumber;
    private String cardUser;
    private String securityCode;
    private String expiryDate;

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardUser() {
        return cardUser;
    }
    public void setCardUser(String cardUser) {
        this.cardUser = cardUser;
    }
    public String getSecurityCode() {
        return securityCode;
    }
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public CreditCard(String cardNumber, String cardUser, String securityCode, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardUser = cardUser;
        this.securityCode = securityCode;
        this.expiryDate = expiryDate;
    }

    public CreditCard() {

    }

}
