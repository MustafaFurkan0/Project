package OOP_Project;

import javax.swing.*;

public class Test extends javax.swing.JFrame {

    public Test() {
        initComponents();
        Login.setVisible(true);
        menu.setVisible(false);
        infoUser.setVisible(false);
        infoCreditCard.setVisible(false);
        OrderMenu.setVisible(false);
        favMenu.setVisible(false);

    }
    User user = new User("emine", "Emine", "Cetin", "09/07/2003", "1234", "cetinemine843@gmail.com", "İnegöl / Bursa", "Muradiye / Manisa");

    CreditCard creditCard = new CreditCard("5516 5678 9012 3456", "Emine Cetin", "664", "12/24");

    Product product1 = new Product("iPhone 13", "Black", "Electronics", 10, 0.5, "Latest iPhone model");
    Product product2 = new Product("Samsung Galaxy S21", "Silver", "Electronics", 15, 0.4, "Flagship Samsung phone");
    Product product3 = new Product("Sony WH-1000XM4", "Black", "Audio", 20, 0.3, "Noise-canceling headphones");
    Product product4 = new Product("MacBook Pro", "Space Gray", "Computers", 5, 1.4, "Apple laptop with M1 chip");
    Product product5 = new Product("Dell XPS 13", "White", "Computers", 8, 1.2, "Compact and powerful laptop");

    public void updateFavoritePanels(User user) {
        JPanel[] favoritePanels = {FavPanel1, FavPanel2, FavPanel3, FavPanel4, FavPanel5};

        // Hide panels based on favorite product count
        for (int i = 0; i < favoritePanels.length; i++) {
            if (i < user.favoriteProductCount) {
                favoritePanels[i].setVisible(true);
            } else {
                favoritePanels[i].setVisible(false);
            }
        }
    }

    public void updateOrderedPanels(User user) {
        JPanel[] orderedPanels = {OrderPanel1, OrderPanel2, OrderPanel3, OrderPanel4, OrderPanel5};

        for (int i = 0; i < orderedPanels.length; i++) {
            if (i < user.orderedProductCount) {
                orderedPanels[i].setVisible(true);
            } else {
                orderedPanels[i].setVisible(false);
            }
        }
    }

    public void setOrderedProductInfo(int index, Product product) {
        switch (index) {
            case 1:
                orderproduct1name.setText(product.getProductName());
                orderproduct1category.setText(product.getCategory());
                orderproduct1colour.setText(product.getColor());
                orderproduct1stock.setText(Integer.toString(product.getStockInformation()));
                orderproduct1weight.setText(Double.toString(product.getWeight()));
                orderproduct1description.setText(product.getDescriptionInformation());
                break;
            case 2:
                orderproduct2name.setText(product.getProductName());
                orderproduct2category.setText(product.getCategory());
                orderproduct2colour.setText(product.getColor());
                orderproduct2stock.setText(Integer.toString(product.getStockInformation()));
                orderproduct2weight.setText(Double.toString(product.getWeight()));
                orderproduct2description.setText(product.getDescriptionInformation());
                break;
            case 3:
                orderproduct3name.setText(product.getProductName());
                orderproduct3category.setText(product.getCategory());
                orderproduct3colour.setText(product.getColor());
                orderproduct3stock.setText(Integer.toString(product.getStockInformation()));
                orderproduct3weight.setText(Double.toString(product.getWeight()));
                orderproduct3description.setText(product.getDescriptionInformation());
                break;
            case 4:
                orderproduct4name.setText(product.getProductName());
                orderproduct4category.setText(product.getCategory());
                orderproduct4colour.setText(product.getColor());
                orderproduct4stock.setText(Integer.toString(product.getStockInformation()));
                orderproduct4weight.setText(Double.toString(product.getWeight()));
                orderproduct4description.setText(product.getDescriptionInformation());
                break;
            case 5:
                orderproduct5name.setText(product.getProductName());
                orderproduct5category.setText(product.getCategory());
                orderproduct5colour.setText(product.getColor());
                orderproduct5stock.setText(Integer.toString(product.getStockInformation()));
                orderproduct5weight.setText(Double.toString(product.getWeight()));
                orderproduct5description.setText(product.getDescriptionInformation());
                break;
            default:
                break;
        }
    }

    public void setFavoriteProductInfo(int index, Product product) {
        switch (index) {
            case 1:
                favproduct1name.setText(product.getProductName());
                favproduct1category.setText(product.getCategory());
                favproduct1colour.setText(product.getColor());
                favproduct1stock.setText(Integer.toString(product.getStockInformation()));
                favproduct1weight.setText(Double.toString(product.getWeight()));
                favproduct1description.setText(product.getDescriptionInformation());
                break;
            case 2:
                favproduct2name.setText(product.getProductName());
                favproduct2category.setText(product.getCategory());
                favproduct2colour.setText(product.getColor());
                favproduct2stock.setText(Integer.toString(product.getStockInformation()));
                favproduct2weight.setText(Double.toString(product.getWeight()));
                favproduct2description.setText(product.getDescriptionInformation());
                break;
            case 3:
                favproduct3name.setText(product.getProductName());
                favproduct3category.setText(product.getCategory());
                favproduct3colour.setText(product.getColor());
                favproduct3stock.setText(Integer.toString(product.getStockInformation()));
                favproduct3weight.setText(Double.toString(product.getWeight()));
                favproduct3description.setText(product.getDescriptionInformation());
                break;
            case 4:
                favproduct4name.setText(product.getProductName());
                favproduct4category.setText(product.getCategory());
                favproduct4colour.setText(product.getColor());
                favproduct4stock.setText(Integer.toString(product.getStockInformation()));
                favproduct4weight.setText(Double.toString(product.getWeight()));
                favproduct4description.setText(product.getDescriptionInformation());
                break;
            case 5:
                favproduct5name.setText(product.getProductName());
                favproduct5category.setText(product.getCategory());
                favproduct5colour.setText(product.getColor());
                favproduct5stock.setText(Integer.toString(product.getStockInformation()));
                favproduct5weight.setText(Double.toString(product.getWeight()));
                favproduct5description.setText(product.getDescriptionInformation());
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        txtusername = new javax.swing.JTextField();
        uyarı = new javax.swing.JLabel();
        passwordCheck = new javax.swing.JCheckBox();
        infoCreditCard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cardUser = new javax.swing.JLabel();
        cardNumber = new javax.swing.JLabel();
        securityCode = new javax.swing.JLabel();
        expiryDate = new javax.swing.JLabel();
        backinfocart = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jProduct2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        product2name = new javax.swing.JLabel();
        product2category = new javax.swing.JLabel();
        product2colour = new javax.swing.JLabel();
        product2stock = new javax.swing.JLabel();
        product2weight = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        product2description = new javax.swing.JLabel();
        product2fav = new javax.swing.JButton();
        product2order = new javax.swing.JButton();
        jProduct3 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        product3name = new javax.swing.JLabel();
        product3category = new javax.swing.JLabel();
        product3colour = new javax.swing.JLabel();
        product3stock = new javax.swing.JLabel();
        product3weight = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        product3description = new javax.swing.JLabel();
        product3fav = new javax.swing.JButton();
        product3order = new javax.swing.JButton();
        jProduct5 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        product5name = new javax.swing.JLabel();
        product5category = new javax.swing.JLabel();
        product5colour = new javax.swing.JLabel();
        product5stock = new javax.swing.JLabel();
        product5weight = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        product5description = new javax.swing.JLabel();
        product5fav = new javax.swing.JButton();
        product5order = new javax.swing.JButton();
        jProduct4 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        product4name = new javax.swing.JLabel();
        product4category = new javax.swing.JLabel();
        product4colour = new javax.swing.JLabel();
        product4stock = new javax.swing.JLabel();
        product4weight = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        product4description = new javax.swing.JLabel();
        product4fav = new javax.swing.JButton();
        product4order = new javax.swing.JButton();
        jProduct1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        product1name = new javax.swing.JLabel();
        product1category = new javax.swing.JLabel();
        product1colour = new javax.swing.JLabel();
        product1stock = new javax.swing.JLabel();
        product1weight = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        product1description = new javax.swing.JLabel();
        product1fav = new javax.swing.JButton();
        product1order = new javax.swing.JButton();
        OrderMenu = new javax.swing.JPanel();
        OrderPanel3 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        orderproduct3name = new javax.swing.JLabel();
        orderproduct3category = new javax.swing.JLabel();
        orderproduct3colour = new javax.swing.JLabel();
        orderproduct3stock = new javax.swing.JLabel();
        orderproduct3weight = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        orderproduct3description = new javax.swing.JLabel();
        OrderPanel2 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        orderproduct2name = new javax.swing.JLabel();
        orderproduct2category = new javax.swing.JLabel();
        orderproduct2colour = new javax.swing.JLabel();
        orderproduct2stock = new javax.swing.JLabel();
        orderproduct2weight = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        orderproduct2description = new javax.swing.JLabel();
        OrderPanel1 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        orderproduct1name = new javax.swing.JLabel();
        orderproduct1category = new javax.swing.JLabel();
        orderproduct1colour = new javax.swing.JLabel();
        orderproduct1stock = new javax.swing.JLabel();
        orderproduct1weight = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        orderproduct1description = new javax.swing.JLabel();
        OrderPanel4 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        orderproduct4name = new javax.swing.JLabel();
        orderproduct4category = new javax.swing.JLabel();
        orderproduct4colour = new javax.swing.JLabel();
        orderproduct4stock = new javax.swing.JLabel();
        orderproduct4weight = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        orderproduct4description = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        OrderPanel5 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        orderproduct5name = new javax.swing.JLabel();
        orderproduct5category = new javax.swing.JLabel();
        orderproduct5colour = new javax.swing.JLabel();
        orderproduct5stock = new javax.swing.JLabel();
        orderproduct5weight = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        orderproduct5description = new javax.swing.JLabel();
        infoUser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Surname = new javax.swing.JLabel();
        birthdate = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        homeAddress = new javax.swing.JLabel();
        workAddress = new javax.swing.JLabel();
        backinfouser = new javax.swing.JButton();
        favMenu = new javax.swing.JPanel();
        FavPanel2 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        favproduct2name = new javax.swing.JLabel();
        favproduct2category = new javax.swing.JLabel();
        favproduct2colour = new javax.swing.JLabel();
        favproduct2stock = new javax.swing.JLabel();
        favproduct2weight = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        favproduct2description = new javax.swing.JLabel();
        FavPanel1 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        favproduct1name = new javax.swing.JLabel();
        favproduct1category = new javax.swing.JLabel();
        favproduct1colour = new javax.swing.JLabel();
        favproduct1stock = new javax.swing.JLabel();
        favproduct1weight = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        favproduct1description = new javax.swing.JLabel();
        FavPanel3 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        favproduct3name = new javax.swing.JLabel();
        favproduct3category = new javax.swing.JLabel();
        favproduct3colour = new javax.swing.JLabel();
        favproduct3stock = new javax.swing.JLabel();
        favproduct3weight = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        favproduct3description = new javax.swing.JLabel();
        FavPanel5 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        favproduct5name = new javax.swing.JLabel();
        favproduct5category = new javax.swing.JLabel();
        favproduct5colour = new javax.swing.JLabel();
        favproduct5stock = new javax.swing.JLabel();
        favproduct5weight = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        favproduct5description = new javax.swing.JLabel();
        FavPanel4 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        favproduct4name = new javax.swing.JLabel();
        favproduct4category = new javax.swing.JLabel();
        favproduct4colour = new javax.swing.JLabel();
        favproduct4stock = new javax.swing.JLabel();
        favproduct4weight = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        favproduct4description = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Login.setBackground(java.awt.Color.lightGray);
        Login.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 3, 24), javax.swing.UIManager.getDefaults().getColor("Actions.Green"))); // NOI18N

        lblusername.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(0, 0, 0));
        lblusername.setText("Username :");

        lblpassword.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(0, 0, 0));
        lblpassword.setText("Password :");

        login.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(0, 51, 153));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        txtpassword.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 0, 0));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        txtusername.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtusername.setForeground(new java.awt.Color(0, 0, 0));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        uyarı.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        uyarı.setText("....");

        passwordCheck.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passwordCheck.setForeground(new java.awt.Color(0, 0, 0));
        passwordCheck.setText("Show  password");
        passwordCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uyarı, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordCheck)))))
                .addGap(30, 30, 30))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtusername)
                    .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uyarı, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        infoCreditCard.setBackground(java.awt.Color.gray);
        infoCreditCard.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Card İnformation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Card User         :");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Card Number    :");

        jLabel16.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Security Code   :");

        jLabel17.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Expiry Date      :");

        cardUser.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        cardUser.setForeground(new java.awt.Color(0, 0, 0));

        cardNumber.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        cardNumber.setForeground(new java.awt.Color(0, 0, 0));

        securityCode.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        securityCode.setForeground(new java.awt.Color(0, 0, 0));

        expiryDate.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        expiryDate.setForeground(new java.awt.Color(0, 0, 0));

        backinfocart.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        backinfocart.setForeground(new java.awt.Color(0, 0, 0));
        backinfocart.setText("BACK");
        backinfocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backinfocartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoCreditCardLayout = new javax.swing.GroupLayout(infoCreditCard);
        infoCreditCard.setLayout(infoCreditCardLayout);
        infoCreditCardLayout.setHorizontalGroup(
            infoCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCreditCardLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(infoCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infoCreditCardLayout.createSequentialGroup()
                        .addGroup(infoCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(expiryDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(securityCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cardNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backinfocart, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        infoCreditCardLayout.setVerticalGroup(
            infoCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCreditCardLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(infoCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(infoCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(infoCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(infoCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoCreditCardLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(infoCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoCreditCardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backinfocart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );

        menu.setBackground(java.awt.Color.gray);
        menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 3, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        menu.setForeground(new java.awt.Color(0, 0, 102));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("User İnformation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jButton2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Favorites Products");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jButton3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Credi Card İnformation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jButton4.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Log Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jButton5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Ordered Products");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jProduct2.setBackground(new java.awt.Color(204, 204, 204));
        jProduct2.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green")));

        jLabel27.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Product Name         :");

        jLabel28.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Product Category    :");

        jLabel29.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Product Colour       :");

        jLabel30.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Product Stock         :");

        jLabel31.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Product Weight       :");

        product2name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product2name.setForeground(new java.awt.Color(0, 0, 0));

        product2category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product2category.setForeground(new java.awt.Color(0, 0, 0));

        product2colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product2colour.setForeground(new java.awt.Color(0, 0, 0));

        product2stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product2stock.setForeground(new java.awt.Color(0, 0, 0));

        product2weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product2weight.setForeground(new java.awt.Color(0, 0, 0));

        jLabel37.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Product Description :");

        product2description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product2description.setForeground(new java.awt.Color(0, 0, 0));

        product2fav.setBackground(java.awt.Color.lightGray);
        product2fav.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        product2fav.setForeground(java.awt.Color.red);
        product2fav.setText("Favorites");
        product2fav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product2favActionPerformed(evt);
            }
        });

        product2order.setBackground(java.awt.Color.lightGray);
        product2order.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        product2order.setForeground(new java.awt.Color(0, 0, 102));
        product2order.setText("Order");
        product2order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product2orderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jProduct2Layout = new javax.swing.GroupLayout(jProduct2);
        jProduct2.setLayout(jProduct2Layout);
        jProduct2Layout.setHorizontalGroup(
            jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProduct2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jProduct2Layout.createSequentialGroup()
                        .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jProduct2Layout.createSequentialGroup()
                                .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(product2stock, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(product2weight, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(product2description, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(product2fav, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(product2order, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(product2name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jProduct2Layout.createSequentialGroup()
                        .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product2category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product2colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jProduct2Layout.setVerticalGroup(
            jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProduct2Layout.createSequentialGroup()
                .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jProduct2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(product2fav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(product2order, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jProduct2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product2name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product2category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product2colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product2stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product2weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product2description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jProduct3.setBackground(new java.awt.Color(204, 204, 204));
        jProduct3.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green")));
        jProduct3.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jProduct3.setPreferredSize(new java.awt.Dimension(481, 273));

        jLabel39.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Product Name         :");

        jLabel40.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Product Category    :");

        jLabel41.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Product Colour       :");

        jLabel42.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Product Stock         :");

        jLabel43.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Product Weight       :");

        product3name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product3name.setForeground(new java.awt.Color(0, 0, 0));

        product3category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product3category.setForeground(new java.awt.Color(0, 0, 0));

        product3colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product3colour.setForeground(new java.awt.Color(0, 0, 0));

        product3stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product3stock.setForeground(new java.awt.Color(0, 0, 0));

        product3weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product3weight.setForeground(new java.awt.Color(0, 0, 0));

        jLabel49.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Product Description :");

        product3description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product3description.setForeground(new java.awt.Color(0, 0, 0));

        product3fav.setBackground(java.awt.Color.lightGray);
        product3fav.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        product3fav.setForeground(java.awt.Color.red);
        product3fav.setText("Favorites");
        product3fav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product3favActionPerformed(evt);
            }
        });

        product3order.setBackground(java.awt.Color.lightGray);
        product3order.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        product3order.setForeground(new java.awt.Color(0, 0, 102));
        product3order.setText("Order");
        product3order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product3orderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jProduct3Layout = new javax.swing.GroupLayout(jProduct3);
        jProduct3.setLayout(jProduct3Layout);
        jProduct3Layout.setHorizontalGroup(
            jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProduct3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jProduct3Layout.createSequentialGroup()
                        .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(product3stock, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product3weight, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product3description, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(product3name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jProduct3Layout.createSequentialGroup()
                            .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addGap(5, 5, 5)
                            .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(product3category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(product3colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product3fav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product3order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jProduct3Layout.setVerticalGroup(
            jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProduct3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jProduct3Layout.createSequentialGroup()
                        .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product3name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product3category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product3colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product3stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product3weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product3description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jProduct3Layout.createSequentialGroup()
                        .addComponent(product3fav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(product3order, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jProduct5.setBackground(new java.awt.Color(204, 204, 204));
        jProduct5.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green")));

        jLabel51.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Product Name         :");

        jLabel52.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Product Category    :");

        jLabel53.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Product Colour       :");

        jLabel54.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Product Stock         :");

        jLabel55.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Product Weight       :");

        product5name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product5name.setForeground(new java.awt.Color(0, 0, 0));

        product5category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product5category.setForeground(new java.awt.Color(0, 0, 0));

        product5colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product5colour.setForeground(new java.awt.Color(0, 0, 0));

        product5stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product5stock.setForeground(new java.awt.Color(0, 0, 0));

        product5weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product5weight.setForeground(new java.awt.Color(0, 0, 0));

        jLabel61.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("Product Description :");

        product5description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product5description.setForeground(new java.awt.Color(0, 0, 0));

        product5fav.setBackground(java.awt.Color.lightGray);
        product5fav.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        product5fav.setForeground(java.awt.Color.red);
        product5fav.setText("Favorites");
        product5fav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product5favActionPerformed(evt);
            }
        });

        product5order.setBackground(java.awt.Color.lightGray);
        product5order.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        product5order.setForeground(new java.awt.Color(0, 0, 102));
        product5order.setText("Order");
        product5order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product5orderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jProduct5Layout = new javax.swing.GroupLayout(jProduct5);
        jProduct5.setLayout(jProduct5Layout);
        jProduct5Layout.setHorizontalGroup(
            jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProduct5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jProduct5Layout.createSequentialGroup()
                        .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(product5name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product5stock, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product5weight, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product5description, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jProduct5Layout.createSequentialGroup()
                        .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product5category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product5colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product5fav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product5order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jProduct5Layout.setVerticalGroup(
            jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProduct5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product5name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product5category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product5colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jProduct5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product5stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product5weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jProduct5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(product5fav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(product5description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(product5order, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jProduct4.setBackground(new java.awt.Color(204, 204, 204));
        jProduct4.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green")));

        jLabel63.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Product Name         :");

        jLabel64.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Product Category    :");

        jLabel65.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Product Colour       :");

        jLabel66.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Product Stock         :");

        jLabel67.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("Product Weight       :");

        product4name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product4name.setForeground(new java.awt.Color(0, 0, 0));

        product4category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product4category.setForeground(new java.awt.Color(0, 0, 0));

        product4colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product4colour.setForeground(new java.awt.Color(0, 0, 0));

        product4stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product4stock.setForeground(new java.awt.Color(0, 0, 0));

        product4weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product4weight.setForeground(new java.awt.Color(0, 0, 0));

        jLabel73.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 0));
        jLabel73.setText("Product Description :");

        product4description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product4description.setForeground(new java.awt.Color(0, 0, 0));

        product4fav.setBackground(java.awt.Color.lightGray);
        product4fav.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        product4fav.setForeground(java.awt.Color.red);
        product4fav.setText("Favorites");
        product4fav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product4favActionPerformed(evt);
            }
        });

        product4order.setBackground(java.awt.Color.lightGray);
        product4order.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        product4order.setForeground(new java.awt.Color(0, 0, 102));
        product4order.setText("Order");
        product4order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product4orderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jProduct4Layout = new javax.swing.GroupLayout(jProduct4);
        jProduct4.setLayout(jProduct4Layout);
        jProduct4Layout.setHorizontalGroup(
            jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProduct4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jProduct4Layout.createSequentialGroup()
                        .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(product4name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product4stock, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product4weight, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product4description, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jProduct4Layout.createSequentialGroup()
                        .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product4category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product4colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product4fav, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product4order, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jProduct4Layout.setVerticalGroup(
            jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProduct4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product4name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product4category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product4colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jProduct4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product4stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product4weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(product4description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jProduct4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(product4fav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(product4order, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        jProduct1.setBackground(new java.awt.Color(204, 204, 204));
        jProduct1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green")));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Product Name         :");

        jLabel14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Product Category    :");

        jLabel15.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Product Colour        :");

        jLabel18.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Product Stock         :");

        jLabel19.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Product Weight       :");

        product1name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product1name.setForeground(new java.awt.Color(0, 0, 0));
        product1name.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                product1nameComponentAdded(evt);
            }
        });

        product1category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product1category.setForeground(new java.awt.Color(0, 0, 0));

        product1colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product1colour.setForeground(new java.awt.Color(0, 0, 0));

        product1stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product1stock.setForeground(new java.awt.Color(0, 0, 0));

        product1weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product1weight.setForeground(new java.awt.Color(0, 0, 0));
        product1weight.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                product1weightComponentAdded(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Product Description :");

        product1description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        product1description.setForeground(new java.awt.Color(0, 0, 0));

        product1fav.setBackground(java.awt.Color.lightGray);
        product1fav.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        product1fav.setForeground(java.awt.Color.red);
        product1fav.setText("Favorites");
        product1fav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product1favActionPerformed(evt);
            }
        });

        product1order.setBackground(java.awt.Color.lightGray);
        product1order.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        product1order.setForeground(new java.awt.Color(0, 0, 102));
        product1order.setText("Order");
        product1order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product1orderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jProduct1Layout = new javax.swing.GroupLayout(jProduct1);
        jProduct1.setLayout(jProduct1Layout);
        jProduct1Layout.setHorizontalGroup(
            jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProduct1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jProduct1Layout.createSequentialGroup()
                        .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(product1name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product1stock, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product1weight, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(product1description, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jProduct1Layout.createSequentialGroup()
                        .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product1category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product1colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product1fav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product1order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jProduct1Layout.setVerticalGroup(
            jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProduct1Layout.createSequentialGroup()
                .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jProduct1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product1name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product1category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product1colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product1stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product1weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product1description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jProduct1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(product1fav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(product1order, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(jProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(jProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(jProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        OrderMenu.setBackground(java.awt.Color.gray);
        OrderMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        OrderPanel3.setBackground(new java.awt.Color(204, 204, 204));
        OrderPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green")));

        jLabel99.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 0, 0));
        jLabel99.setText("Product Name         :");

        jLabel100.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setText("Product Category    :");

        jLabel101.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 0, 0));
        jLabel101.setText("Product Colour       :");

        jLabel102.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 0, 0));
        jLabel102.setText("Product Stock         :");

        jLabel103.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 0));
        jLabel103.setText("Product Weight       :");

        orderproduct3name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct3category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct3colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct3stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct3weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel104.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 0));
        jLabel104.setText("Product Description :");

        orderproduct3description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        javax.swing.GroupLayout OrderPanel3Layout = new javax.swing.GroupLayout(OrderPanel3);
        OrderPanel3.setLayout(OrderPanel3Layout);
        OrderPanel3Layout.setHorizontalGroup(
            OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderPanel3Layout.createSequentialGroup()
                        .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderproduct3name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(orderproduct3stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderproduct3weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderproduct3description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(OrderPanel3Layout.createSequentialGroup()
                        .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderproduct3category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderproduct3colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        OrderPanel3Layout.setVerticalGroup(
            OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct3name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct3category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct3colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct3stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderproduct3weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct3description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        OrderPanel2.setBackground(new java.awt.Color(204, 204, 204));
        OrderPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green")));

        jLabel68.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("Product Name         :");

        jLabel69.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("Product Category    :");

        jLabel70.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("Product Colour       :");

        jLabel71.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setText("Product Stock         :");

        jLabel72.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setText("Product Weight       :");

        orderproduct2name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct2category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct2colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct2stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct2weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel74.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("Product Description :");

        orderproduct2description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        javax.swing.GroupLayout OrderPanel2Layout = new javax.swing.GroupLayout(OrderPanel2);
        OrderPanel2.setLayout(OrderPanel2Layout);
        OrderPanel2Layout.setHorizontalGroup(
            OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderPanel2Layout.createSequentialGroup()
                        .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderproduct2name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(orderproduct2stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderproduct2weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderproduct2description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(OrderPanel2Layout.createSequentialGroup()
                        .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderproduct2category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderproduct2colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        OrderPanel2Layout.setVerticalGroup(
            OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct2name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct2category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct2colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct2stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderproduct2weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct2description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        OrderPanel1.setBackground(new java.awt.Color(204, 204, 204));
        OrderPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green")));

        jLabel105.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 0));
        jLabel105.setText("Product Name         :");

        jLabel106.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(0, 0, 0));
        jLabel106.setText("Product Category    :");

        jLabel107.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(0, 0, 0));
        jLabel107.setText("Product Colour       :");

        jLabel108.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 0));
        jLabel108.setText("Product Stock         :");

        jLabel109.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(0, 0, 0));
        jLabel109.setText("Product Weight       :");

        orderproduct1name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct1category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct1colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct1stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct1weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel110.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 0, 0));
        jLabel110.setText("Product Description :");

        orderproduct1description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        javax.swing.GroupLayout OrderPanel1Layout = new javax.swing.GroupLayout(OrderPanel1);
        OrderPanel1.setLayout(OrderPanel1Layout);
        OrderPanel1Layout.setHorizontalGroup(
            OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderPanel1Layout.createSequentialGroup()
                        .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderproduct1name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(orderproduct1stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderproduct1weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderproduct1description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(OrderPanel1Layout.createSequentialGroup()
                        .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderproduct1category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderproduct1colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        OrderPanel1Layout.setVerticalGroup(
            OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct1name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct1category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct1colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct1stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderproduct1weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct1description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        OrderPanel4.setBackground(new java.awt.Color(204, 204, 204));
        OrderPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green")));

        jLabel117.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 0));
        jLabel117.setText("Product Name         :");

        jLabel118.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(0, 0, 0));
        jLabel118.setText("Product Category    :");

        jLabel119.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 0));
        jLabel119.setText("Product Colour       :");

        jLabel120.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(0, 0, 0));
        jLabel120.setText("Product Stock         :");

        jLabel121.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(0, 0, 0));
        jLabel121.setText("Product Weight       :");

        orderproduct4name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct4category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct4colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct4stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct4weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel122.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(0, 0, 0));
        jLabel122.setText("Product Description :");

        orderproduct4description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        javax.swing.GroupLayout OrderPanel4Layout = new javax.swing.GroupLayout(OrderPanel4);
        OrderPanel4.setLayout(OrderPanel4Layout);
        OrderPanel4Layout.setHorizontalGroup(
            OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderPanel4Layout.createSequentialGroup()
                        .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderproduct4name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(orderproduct4stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderproduct4weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderproduct4description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(OrderPanel4Layout.createSequentialGroup()
                        .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel118, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderproduct4category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderproduct4colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        OrderPanel4Layout.setVerticalGroup(
            OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct4name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct4category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct4colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct4stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderproduct4weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct4description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton6.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        OrderPanel5.setBackground(new java.awt.Color(204, 204, 204));
        OrderPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Green")));

        jLabel111.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(0, 0, 0));
        jLabel111.setText("Product Name         :");

        jLabel112.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 0));
        jLabel112.setText("Product Category    :");

        jLabel113.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(0, 0, 0));
        jLabel113.setText("Product Colour       :");

        jLabel114.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(0, 0, 0));
        jLabel114.setText("Product Stock         :");

        jLabel115.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(0, 0, 0));
        jLabel115.setText("Product Weight       :");

        orderproduct5name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct5category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct5colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct5stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        orderproduct5weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        jLabel116.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 0));
        jLabel116.setText("Product Description :");

        orderproduct5description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        javax.swing.GroupLayout OrderPanel5Layout = new javax.swing.GroupLayout(OrderPanel5);
        OrderPanel5.setLayout(OrderPanel5Layout);
        OrderPanel5Layout.setHorizontalGroup(
            OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderPanel5Layout.createSequentialGroup()
                        .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderproduct5name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(orderproduct5stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderproduct5weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderproduct5description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(OrderPanel5Layout.createSequentialGroup()
                        .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderproduct5category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderproduct5colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        OrderPanel5Layout.setVerticalGroup(
            OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct5name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct5category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct5colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct5stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderproduct5weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderproduct5description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout OrderMenuLayout = new javax.swing.GroupLayout(OrderMenu);
        OrderMenu.setLayout(OrderMenuLayout);
        OrderMenuLayout.setHorizontalGroup(
            OrderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(OrderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OrderPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(OrderMenuLayout.createSequentialGroup()
                        .addGroup(OrderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OrderPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrderPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrderPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(OrderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrderMenuLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(OrderPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        OrderMenuLayout.setVerticalGroup(
            OrderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(OrderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrderPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(OrderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderMenuLayout.createSequentialGroup()
                        .addComponent(OrderPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OrderMenuLayout.createSequentialGroup()
                        .addComponent(OrderPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(OrderPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        infoUser.setBackground(java.awt.Color.gray);
        infoUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " User İnformation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Work address   :");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Name               :");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Surname           :");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Birth Of Date   :");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("E-Mail              :");

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Homa address  :");

        Name.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 0));

        Surname.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Surname.setForeground(new java.awt.Color(0, 0, 0));

        birthdate.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        birthdate.setForeground(new java.awt.Color(0, 0, 0));

        email.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));

        homeAddress.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        homeAddress.setForeground(new java.awt.Color(0, 0, 0));

        workAddress.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        workAddress.setForeground(new java.awt.Color(0, 0, 0));

        backinfouser.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        backinfouser.setForeground(new java.awt.Color(0, 0, 0));
        backinfouser.setText("BACK");
        backinfouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backinfouserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoUserLayout = new javax.swing.GroupLayout(infoUser);
        infoUser.setLayout(infoUserLayout);
        infoUserLayout.setHorizontalGroup(
            infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoUserLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoUserLayout.createSequentialGroup()
                        .addGroup(infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(infoUserLayout.createSequentialGroup()
                        .addComponent(workAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(backinfouser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        infoUserLayout.setVerticalGroup(
            infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoUserLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoUserLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(workAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoUserLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backinfouser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        favMenu.setBackground(java.awt.Color.gray);
        favMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Favorites", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        FavPanel2.setBackground(new java.awt.Color(204, 204, 204));
        FavPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));

        jLabel75.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("Product Name         :");

        jLabel76.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setText("Product Category    :");

        jLabel77.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setText("Product Colour       :");

        jLabel78.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setText("Product Stock         :");

        jLabel79.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("Product Weight       :");

        favproduct2name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct2name.setForeground(new java.awt.Color(0, 0, 0));

        favproduct2category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct2category.setForeground(new java.awt.Color(0, 0, 0));

        favproduct2colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct2colour.setForeground(new java.awt.Color(0, 0, 0));

        favproduct2stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct2stock.setForeground(new java.awt.Color(0, 0, 0));

        favproduct2weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct2weight.setForeground(new java.awt.Color(0, 0, 0));

        jLabel80.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 0, 0));
        jLabel80.setText("Product Description :");

        favproduct2description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct2description.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout FavPanel2Layout = new javax.swing.GroupLayout(FavPanel2);
        FavPanel2.setLayout(FavPanel2Layout);
        FavPanel2Layout.setHorizontalGroup(
            FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FavPanel2Layout.createSequentialGroup()
                        .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(favproduct2name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(favproduct2stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct2weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct2description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(FavPanel2Layout.createSequentialGroup()
                        .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(favproduct2category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(favproduct2colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        FavPanel2Layout.setVerticalGroup(
            FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct2name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct2category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct2colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct2stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favproduct2weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct2description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FavPanel1.setBackground(new java.awt.Color(204, 204, 204));
        FavPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));

        jLabel129.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(0, 0, 0));
        jLabel129.setText("Product Name         :");

        jLabel130.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(0, 0, 0));
        jLabel130.setText("Product Category    :");

        jLabel131.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(0, 0, 0));
        jLabel131.setText("Product Colour       :");

        jLabel132.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(0, 0, 0));
        jLabel132.setText("Product Stock         :");

        jLabel133.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(0, 0, 0));
        jLabel133.setText("Product Weight       :");

        favproduct1name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct1name.setForeground(new java.awt.Color(0, 0, 0));

        favproduct1category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct1category.setForeground(new java.awt.Color(0, 0, 0));

        favproduct1colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct1colour.setForeground(new java.awt.Color(0, 0, 0));

        favproduct1stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct1stock.setForeground(new java.awt.Color(0, 0, 0));

        favproduct1weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct1weight.setForeground(new java.awt.Color(0, 0, 0));

        jLabel134.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(0, 0, 0));
        jLabel134.setText("Product Description :");

        favproduct1description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct1description.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout FavPanel1Layout = new javax.swing.GroupLayout(FavPanel1);
        FavPanel1.setLayout(FavPanel1Layout);
        FavPanel1Layout.setHorizontalGroup(
            FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FavPanel1Layout.createSequentialGroup()
                        .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(favproduct1name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(favproduct1stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct1weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct1description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(FavPanel1Layout.createSequentialGroup()
                        .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel130, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel131, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(favproduct1category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(favproduct1colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        FavPanel1Layout.setVerticalGroup(
            FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct1name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct1category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct1colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct1stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favproduct1weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct1description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        FavPanel3.setBackground(new java.awt.Color(204, 204, 204));
        FavPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));

        jLabel123.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(0, 0, 0));
        jLabel123.setText("Product Name         :");

        jLabel124.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(0, 0, 0));
        jLabel124.setText("Product Category    :");

        jLabel125.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(0, 0, 0));
        jLabel125.setText("Product Colour       :");

        jLabel126.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 0, 0));
        jLabel126.setText("Product Stock         :");

        jLabel127.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(0, 0, 0));
        jLabel127.setText("Product Weight       :");

        favproduct3name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct3name.setForeground(new java.awt.Color(0, 0, 0));

        favproduct3category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct3category.setForeground(new java.awt.Color(0, 0, 0));

        favproduct3colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct3colour.setForeground(new java.awt.Color(0, 0, 0));

        favproduct3stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct3stock.setForeground(new java.awt.Color(0, 0, 0));

        favproduct3weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct3weight.setForeground(new java.awt.Color(0, 0, 0));

        jLabel128.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(0, 0, 0));
        jLabel128.setText("Product Description :");

        favproduct3description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct3description.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout FavPanel3Layout = new javax.swing.GroupLayout(FavPanel3);
        FavPanel3.setLayout(FavPanel3Layout);
        FavPanel3Layout.setHorizontalGroup(
            FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FavPanel3Layout.createSequentialGroup()
                        .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(favproduct3name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct3stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct3weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct3description, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(FavPanel3Layout.createSequentialGroup()
                        .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel124, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(favproduct3category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(favproduct3colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        FavPanel3Layout.setVerticalGroup(
            FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct3name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct3category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct3colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct3stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favproduct3weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel128, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(favproduct3description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        FavPanel5.setBackground(new java.awt.Color(204, 204, 204));
        FavPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));

        jLabel135.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(0, 0, 0));
        jLabel135.setText("Product Name         :");

        jLabel136.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(0, 0, 0));
        jLabel136.setText("Product Category    :");

        jLabel137.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(0, 0, 0));
        jLabel137.setText("Product Colour       :");

        jLabel138.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(0, 0, 0));
        jLabel138.setText("Product Stock         :");

        jLabel139.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(0, 0, 0));
        jLabel139.setText("Product Weight       :");

        favproduct5name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct5name.setForeground(new java.awt.Color(0, 0, 0));

        favproduct5category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct5category.setForeground(new java.awt.Color(0, 0, 0));

        favproduct5colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct5colour.setForeground(new java.awt.Color(0, 0, 0));

        favproduct5stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct5stock.setForeground(new java.awt.Color(0, 0, 0));

        favproduct5weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct5weight.setForeground(new java.awt.Color(0, 0, 0));

        jLabel140.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(0, 0, 0));
        jLabel140.setText("Product Description :");

        favproduct5description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct5description.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout FavPanel5Layout = new javax.swing.GroupLayout(FavPanel5);
        FavPanel5.setLayout(FavPanel5Layout);
        FavPanel5Layout.setHorizontalGroup(
            FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FavPanel5Layout.createSequentialGroup()
                        .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel135, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(favproduct5name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct5stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct5weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct5description, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(FavPanel5Layout.createSequentialGroup()
                        .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel136, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel137, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(favproduct5category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(favproduct5colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        FavPanel5Layout.setVerticalGroup(
            FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct5name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct5category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct5colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct5stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favproduct5weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct5description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        FavPanel4.setBackground(new java.awt.Color(204, 204, 204));
        FavPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));

        jLabel141.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(0, 0, 0));
        jLabel141.setText("Product Name         :");

        jLabel142.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(0, 0, 0));
        jLabel142.setText("Product Category    :");

        jLabel143.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(0, 0, 0));
        jLabel143.setText("Product Colour       :");

        jLabel144.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(0, 0, 0));
        jLabel144.setText("Product Stock         :");

        jLabel145.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(0, 0, 0));
        jLabel145.setText("Product Weight       :");

        favproduct4name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct4name.setForeground(new java.awt.Color(0, 0, 0));

        favproduct4category.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct4category.setForeground(new java.awt.Color(0, 0, 0));

        favproduct4colour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct4colour.setForeground(new java.awt.Color(0, 0, 0));

        favproduct4stock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct4stock.setForeground(new java.awt.Color(0, 0, 0));

        favproduct4weight.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct4weight.setForeground(new java.awt.Color(0, 0, 0));

        jLabel146.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(0, 0, 0));
        jLabel146.setText("Product Description :");

        favproduct4description.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        favproduct4description.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout FavPanel4Layout = new javax.swing.GroupLayout(FavPanel4);
        FavPanel4.setLayout(FavPanel4Layout);
        FavPanel4Layout.setHorizontalGroup(
            FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FavPanel4Layout.createSequentialGroup()
                        .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel145, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel141, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(favproduct4name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct4stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct4weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(favproduct4description, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(FavPanel4Layout.createSequentialGroup()
                        .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel142, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel143, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(favproduct4category, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(favproduct4colour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        FavPanel4Layout.setVerticalGroup(
            FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FavPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct4name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct4category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct4colour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct4stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favproduct4weight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FavPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favproduct4description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout favMenuLayout = new javax.swing.GroupLayout(favMenu);
        favMenu.setLayout(favMenuLayout);
        favMenuLayout.setHorizontalGroup(
            favMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(favMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(favMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(favMenuLayout.createSequentialGroup()
                        .addComponent(FavPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(favMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(favMenuLayout.createSequentialGroup()
                            .addComponent(FavPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(FavPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(favMenuLayout.createSequentialGroup()
                            .addComponent(FavPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(FavPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        favMenuLayout.setVerticalGroup(
            favMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(favMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(favMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FavPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, favMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FavPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(favMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FavPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FavPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(favMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(favMenuLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(favMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(FavPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(favMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(OrderMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(infoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(infoCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrderMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(favMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String username = txtusername.getText();
        String password = new String(txtpassword.getPassword());

        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            product1name.setText(product1.getProductName());
            product1category.setText(product1.getCategory());
            product1colour.setText(product1.getColor());
            product1stock.setText(Integer.toString(product1.getStockInformation()));
            product1weight.setText(Double.toString(product1.getWeight()));
            product1description.setText(product1.getDescriptionInformation());

            product2name.setText(product2.getProductName());
            product2category.setText(product2.getCategory());
            product2colour.setText(product2.getColor());
            product2stock.setText(Integer.toString(product2.getStockInformation()));
            product2weight.setText(Double.toString(product2.getWeight()));
            product2description.setText(product2.getDescriptionInformation());

            product3name.setText(product3.getProductName());
            product3category.setText(product3.getCategory());
            product3colour.setText(product3.getColor());
            product3stock.setText(Integer.toString(product3.getStockInformation()));
            product3weight.setText(Double.toString(product3.getWeight()));
            product3description.setText(product3.getDescriptionInformation());

            product4name.setText(product4.getProductName());
            product4category.setText(product4.getCategory());
            product4colour.setText(product4.getColor());
            product4stock.setText(Integer.toString(product4.getStockInformation()));
            product4weight.setText(Double.toString(product4.getWeight()));
            product4description.setText(product4.getDescriptionInformation());

            product5name.setText(product5.getProductName());
            product5category.setText(product5.getCategory());
            product5colour.setText(product5.getColor());
            product5stock.setText(Integer.toString(product5.getStockInformation()));
            product5weight.setText(Double.toString(product5.getWeight()));
            product5description.setText(product5.getDescriptionInformation());
            Login.setVisible(false);
            menu.setVisible(true);
            infoUser.setVisible(false);
            infoCreditCard.setVisible(false);

        } else {
            uyarı.setText("Login Failed");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Name.setText(user.getName());
        Surname.setText(user.getSurname());
        birthdate.setText(user.getBirthdate());
        email.setText(user.getEmail());
        homeAddress.setText(user.getHomeAddress());
        workAddress.setText(user.getWorkAddress());
        menu.setVisible(false);
        infoUser.setVisible(true);
        Login.setVisible(false);
        infoCreditCard.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Login.setVisible(true);
        menu.setVisible(false);
        infoUser.setVisible(false);
        infoCreditCard.setVisible(false);
        txtusername.setText("");
        txtpassword.setText("");
        uyarı.setText("");
        user.favoriteProductCount = 0;
        user.orderedProductCount = 0;

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        updateFavoritePanels(user);
        if (user.favoriteProductCount == 0) {
            JOptionPane.showMessageDialog(null, "There are no favorite products");
            favMenu.setVisible(false);
            Login.setVisible(false);
            menu.setVisible(true);
            infoUser.setVisible(false);
            infoCreditCard.setVisible(false);
            OrderMenu.setVisible(false);
        } else {
            favMenu.setVisible(true);
            Login.setVisible(false);
            menu.setVisible(false);
            infoUser.setVisible(false);
            infoCreditCard.setVisible(false);
            OrderMenu.setVisible(false);
            for (int i = 0; i < user.favoriteProductCount; i++) {
                setFavoriteProductInfo(i + 1, user.getFavoriteProducts().get(i));
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cardUser.setText(creditCard.getCardUser());
        cardNumber.setText(creditCard.getCardNumber());
        securityCode.setText(creditCard.getSecurityCode());
        expiryDate.setText(creditCard.getExpiryDate());
        infoCreditCard.setVisible(true);
        Login.setVisible(false);
        menu.setVisible(false);
        infoUser.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void product1favActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product1favActionPerformed
        user.addFavoriteProduct(product1);
        user.favoriteProductCount++;
    }//GEN-LAST:event_product1favActionPerformed

    private void product2favActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product2favActionPerformed
        user.addFavoriteProduct(product2);
        user.favoriteProductCount++;
    }//GEN-LAST:event_product2favActionPerformed

    private void product3favActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product3favActionPerformed
        user.addFavoriteProduct(product3);
        user.favoriteProductCount++;
    }//GEN-LAST:event_product3favActionPerformed

    private void product5favActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product5favActionPerformed
        user.addFavoriteProduct(product5);
        user.favoriteProductCount++;
    }//GEN-LAST:event_product5favActionPerformed

    private void product4favActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product4favActionPerformed
        user.addFavoriteProduct(product4);
        user.favoriteProductCount++;
    }//GEN-LAST:event_product4favActionPerformed

    private void product1weightComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_product1weightComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_product1weightComponentAdded

    private void product1nameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_product1nameComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_product1nameComponentAdded

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void product1orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product1orderActionPerformed
        user.orderProduct(product1, 1);
        user.orderedProductCount++;
    }//GEN-LAST:event_product1orderActionPerformed

    private void product2orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product2orderActionPerformed
        user.orderProduct(product2, 1);
        user.orderedProductCount++;
    }//GEN-LAST:event_product2orderActionPerformed

    private void product3orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product3orderActionPerformed
        user.orderProduct(product3, 1);
        user.orderedProductCount++;
    }//GEN-LAST:event_product3orderActionPerformed

    private void product4orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product4orderActionPerformed
        user.orderProduct(product4, 1);
        user.orderedProductCount++;
    }//GEN-LAST:event_product4orderActionPerformed

    private void product5orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product5orderActionPerformed
        user.orderProduct(product5, 1);
        user.orderedProductCount++;
    }//GEN-LAST:event_product5orderActionPerformed

    private void backinfouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backinfouserActionPerformed
        infoUser.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_backinfouserActionPerformed

    private void backinfocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backinfocartActionPerformed
        infoCreditCard.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_backinfocartActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        OrderMenu.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        updateOrderedPanels(user);
        if (user.orderedProductCount == 0) {
            JOptionPane.showMessageDialog(null, "There are no products ordered");
            favMenu.setVisible(false);
            Login.setVisible(false);
            menu.setVisible(true);
            infoUser.setVisible(false);
            infoCreditCard.setVisible(false);
            OrderMenu.setVisible(false);
        } else {
            favMenu.setVisible(false);
            Login.setVisible(false);
            menu.setVisible(false);
            infoUser.setVisible(false);
            infoCreditCard.setVisible(false);
            OrderMenu.setVisible(true);
            for (int i = 0; i < user.orderedProductCount; i++) {
                setOrderedProductInfo(i + 1, user.getOrderedProducts().get(i));
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        favMenu.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void passwordCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordCheckActionPerformed
        if (passwordCheck.isSelected()) {
            txtpassword.setEchoChar((char) 0);
        } else {
            txtpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_passwordCheckActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FavPanel1;
    private javax.swing.JPanel FavPanel2;
    private javax.swing.JPanel FavPanel3;
    private javax.swing.JPanel FavPanel4;
    private javax.swing.JPanel FavPanel5;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel OrderMenu;
    private javax.swing.JPanel OrderPanel1;
    private javax.swing.JPanel OrderPanel2;
    private javax.swing.JPanel OrderPanel3;
    private javax.swing.JPanel OrderPanel4;
    private javax.swing.JPanel OrderPanel5;
    private javax.swing.JLabel Surname;
    private javax.swing.JButton backinfocart;
    private javax.swing.JButton backinfouser;
    private javax.swing.JLabel birthdate;
    private javax.swing.JLabel cardNumber;
    private javax.swing.JLabel cardUser;
    private javax.swing.JLabel email;
    private javax.swing.JLabel expiryDate;
    private javax.swing.JPanel favMenu;
    private javax.swing.JLabel favproduct1category;
    private javax.swing.JLabel favproduct1colour;
    private javax.swing.JLabel favproduct1description;
    private javax.swing.JLabel favproduct1name;
    private javax.swing.JLabel favproduct1stock;
    private javax.swing.JLabel favproduct1weight;
    private javax.swing.JLabel favproduct2category;
    private javax.swing.JLabel favproduct2colour;
    private javax.swing.JLabel favproduct2description;
    private javax.swing.JLabel favproduct2name;
    private javax.swing.JLabel favproduct2stock;
    private javax.swing.JLabel favproduct2weight;
    private javax.swing.JLabel favproduct3category;
    private javax.swing.JLabel favproduct3colour;
    private javax.swing.JLabel favproduct3description;
    private javax.swing.JLabel favproduct3name;
    private javax.swing.JLabel favproduct3stock;
    private javax.swing.JLabel favproduct3weight;
    private javax.swing.JLabel favproduct4category;
    private javax.swing.JLabel favproduct4colour;
    private javax.swing.JLabel favproduct4description;
    private javax.swing.JLabel favproduct4name;
    private javax.swing.JLabel favproduct4stock;
    private javax.swing.JLabel favproduct4weight;
    private javax.swing.JLabel favproduct5category;
    private javax.swing.JLabel favproduct5colour;
    private javax.swing.JLabel favproduct5description;
    private javax.swing.JLabel favproduct5name;
    private javax.swing.JLabel favproduct5stock;
    private javax.swing.JLabel favproduct5weight;
    private javax.swing.JLabel homeAddress;
    private javax.swing.JPanel infoCreditCard;
    private javax.swing.JPanel infoUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jProduct1;
    private javax.swing.JPanel jProduct2;
    private javax.swing.JPanel jProduct3;
    private javax.swing.JPanel jProduct4;
    private javax.swing.JPanel jProduct5;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JButton login;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel orderproduct1category;
    private javax.swing.JLabel orderproduct1colour;
    private javax.swing.JLabel orderproduct1description;
    private javax.swing.JLabel orderproduct1name;
    private javax.swing.JLabel orderproduct1stock;
    private javax.swing.JLabel orderproduct1weight;
    private javax.swing.JLabel orderproduct2category;
    private javax.swing.JLabel orderproduct2colour;
    private javax.swing.JLabel orderproduct2description;
    private javax.swing.JLabel orderproduct2name;
    private javax.swing.JLabel orderproduct2stock;
    private javax.swing.JLabel orderproduct2weight;
    private javax.swing.JLabel orderproduct3category;
    private javax.swing.JLabel orderproduct3colour;
    private javax.swing.JLabel orderproduct3description;
    private javax.swing.JLabel orderproduct3name;
    private javax.swing.JLabel orderproduct3stock;
    private javax.swing.JLabel orderproduct3weight;
    private javax.swing.JLabel orderproduct4category;
    private javax.swing.JLabel orderproduct4colour;
    private javax.swing.JLabel orderproduct4description;
    private javax.swing.JLabel orderproduct4name;
    private javax.swing.JLabel orderproduct4stock;
    private javax.swing.JLabel orderproduct4weight;
    private javax.swing.JLabel orderproduct5category;
    private javax.swing.JLabel orderproduct5colour;
    private javax.swing.JLabel orderproduct5description;
    private javax.swing.JLabel orderproduct5name;
    private javax.swing.JLabel orderproduct5stock;
    private javax.swing.JLabel orderproduct5weight;
    private javax.swing.JCheckBox passwordCheck;
    private javax.swing.JLabel product1category;
    private javax.swing.JLabel product1colour;
    private javax.swing.JLabel product1description;
    private javax.swing.JButton product1fav;
    private javax.swing.JLabel product1name;
    private javax.swing.JButton product1order;
    private javax.swing.JLabel product1stock;
    private javax.swing.JLabel product1weight;
    private javax.swing.JLabel product2category;
    private javax.swing.JLabel product2colour;
    private javax.swing.JLabel product2description;
    private javax.swing.JButton product2fav;
    private javax.swing.JLabel product2name;
    private javax.swing.JButton product2order;
    private javax.swing.JLabel product2stock;
    private javax.swing.JLabel product2weight;
    private javax.swing.JLabel product3category;
    private javax.swing.JLabel product3colour;
    private javax.swing.JLabel product3description;
    private javax.swing.JButton product3fav;
    private javax.swing.JLabel product3name;
    private javax.swing.JButton product3order;
    private javax.swing.JLabel product3stock;
    private javax.swing.JLabel product3weight;
    private javax.swing.JLabel product4category;
    private javax.swing.JLabel product4colour;
    private javax.swing.JLabel product4description;
    private javax.swing.JButton product4fav;
    private javax.swing.JLabel product4name;
    private javax.swing.JButton product4order;
    private javax.swing.JLabel product4stock;
    private javax.swing.JLabel product4weight;
    private javax.swing.JLabel product5category;
    private javax.swing.JLabel product5colour;
    private javax.swing.JLabel product5description;
    private javax.swing.JButton product5fav;
    private javax.swing.JLabel product5name;
    private javax.swing.JButton product5order;
    private javax.swing.JLabel product5stock;
    private javax.swing.JLabel product5weight;
    private javax.swing.JLabel securityCode;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel uyarı;
    private javax.swing.JLabel workAddress;
    // End of variables declaration//GEN-END:variables
}
