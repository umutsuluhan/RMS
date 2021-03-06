/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.Services.LoginService;

import java.sql.SQLException;

/**
 *
 * @author muhse
 */
public class LoginFrame extends javax.swing.JFrame {

    private LoginService lg;
    /**
     * Creates new form MainFrame
     */
    public LoginFrame() {
        initComponents();
        lg = new LoginService();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        userID = new javax.swing.JTextField();
        userIDLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginInfo = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Room Management System");
        setAutoRequestFocus(false);
        setLocation(new java.awt.Point(800, 350));
        setName("loginFrame"); // NOI18N
        setResizable(false);

        loginButton.setBackground(new java.awt.Color(153, 255, 153));
        loginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                try {
                    loginButtonMousePressed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        userID.setBackground(new java.awt.Color(240, 240, 240));
        userID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDActionPerformed(evt);
            }
        });

        userIDLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userIDLabel.setForeground(new java.awt.Color(102, 102, 255));
        userIDLabel.setText("USER ID:");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(102, 102, 255));
        passwordLabel.setText("PASSWORD:");

        loginInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginInfo.setForeground(new java.awt.Color(206, 36, 36));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Room Management System");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(userIDLabel))
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userID)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDLabel))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(14, 14, 14)
                .addComponent(loginInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) throws SQLException {//GEN-FIRST:event_loginButtonMousePressed
        // TODO add your handling code here:
        String enteredID = userID.getText();
        String enteredPassword = password.getText();
        int user_type = lg.validate_user(enteredID, enteredPassword);
        if (user_type == 0) {
            loginInfo.setText("Hello Admin");
            this.dispose();
            java.awt.EventQueue.invokeLater(() -> {
                AdminFrame admin = null;
                try {
                    admin = new AdminFrame();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                admin.setVisible(true);
               admin.setUserIDInfo(enteredID);
            });
        }else if (user_type == 1) {
            loginInfo.setText("Hello User");
            this.dispose();
            java.awt.EventQueue.invokeLater(() -> {
                UserFrame user = null;
                try {
                    user = new UserFrame();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                user.setVisible(true);
                user.setUserIDInfo(enteredID);
            });
        }else{
            loginInfo.setText("Wrong Credientials");
        }
    }//GEN-LAST:event_loginButtonMousePressed

    private void userIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDActionPerformed

    /**
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginInfo;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField userID;
    private javax.swing.JLabel userIDLabel;
    // End of variables declaration//GEN-END:variables
}
