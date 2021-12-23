/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.Object.Room;
import Model.Services.DisplayService;
import Model.Services.UpdateService;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author muhse
 */
public class UserFrame extends javax.swing.JFrame {
    private DisplayService ds;
    private UpdateService us;
    private ArrayList<Room> rooms;
    private Object[][] room_array;
    /**
     * Creates new form UserFrame
     */
    public UserFrame() throws SQLException {
        this.ds = new DisplayService();
        this.us = new UpdateService();
        this.rooms = this.ds.displayRoom();
        this.room_array = transformation();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitBookingButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        listOfRoomsListLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userIDInfo = new javax.swing.JLabel();
        cancelBookingButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 300));
        setResizable(false);

        submitBookingButton.setBackground(new java.awt.Color(153, 255, 153));
        submitBookingButton.setText("Submit My Booking");
        submitBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBookingButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 0, 0));
        logoutButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Room 1", null, null,  new Boolean(false), null, null, null, null, null, null, null},
                {"Room 2", null, null,  new Boolean(false), null, null, null, null, null, null, null},
                {"Room 3", null, null,  new Boolean(false), null, null, null, null, null, null, null},
                {"Room 4", null, null,  new Boolean(false),  new Boolean(false), null, null, null, null, null, null},
                {"Room 5", null, null, null, null, null, null, null, null, null, null},
                {"Room 6", null, null, null, null, null, null, null, null, null, null},
                {"Room 7", null,  new Boolean(false), null, null, null, null, null, null, null, null},
                {"Room 8", null, null, null, null, null, null, null, null, null, null},
                {"Room 9", null, null, null, null, null, null, null,  new Boolean(false), null, null},
                {"Room 10", null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Rooms", "8:00-9:00", "9:00-10:00", "10:00-11:00", "11:00-12:00", "12:00-13:00", "13:00-14:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "17:00-18:00"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setRowHeight(20);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
            jTable4.getColumnModel().getColumn(5).setResizable(false);
            jTable4.getColumnModel().getColumn(6).setResizable(false);
            jTable4.getColumnModel().getColumn(7).setResizable(false);
            jTable4.getColumnModel().getColumn(8).setResizable(false);
            jTable4.getColumnModel().getColumn(9).setResizable(false);
            jTable4.getColumnModel().getColumn(10).setResizable(false);
        }

        listOfRoomsListLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        listOfRoomsListLabel2.setText("List of Rooms");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("USER ID:");

        userIDInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userIDInfo.setText("USER ID");

        cancelBookingButton.setBackground(new java.awt.Color(255, 0, 0));
        cancelBookingButton.setText("Cancel Reservation");
        cancelBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(423, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userIDInfo)
                .addGap(287, 287, 287)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cancelBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(listOfRoomsListLabel2)
                    .addContainerGap(648, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(userIDInfo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(207, 207, 207)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(157, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(listOfRoomsListLabel2)
                    .addContainerGap(500, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBookingButtonActionPerformed
  
        java.awt.EventQueue.invokeLater(() -> {
            UserFrame frame = null;
            try {
                frame = new UserFrame();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            // this.userIDInfo.getText() for user id
            JOptionPane.showMessageDialog(frame, "Booking is submitted.");
            });
    }//GEN-LAST:event_submitBookingButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        
        java.awt.EventQueue.invokeLater(() -> {
        new LoginFrame().setVisible(true);
        });
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void cancelBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingButtonActionPerformed

        java.awt.EventQueue.invokeLater(() -> {
            UserFrame frame = null;
            try {
                frame = new UserFrame();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(frame, "Booking is cancelled.");
        });
    }//GEN-LAST:event_cancelBookingButtonActionPerformed

    private Object[][] transformation(){
        Object [][] room_array = new Object[this.rooms.size()][this.rooms.get(0).getSize()];
        for(int i = 0; i < this.rooms.size(); i++){
            room_array[i][0] = this.rooms.get(i).getRoom_id() + "(" + this.rooms.get(i).getRoom_location()  + ")";
            room_array[i][1] = this.rooms.get(i).isIs_available_at_08();
            room_array[i][2] = this.rooms.get(i).isIs_available_at_09();
            room_array[i][3] = this.rooms.get(i).isIs_available_at_10();
            room_array[i][4] = this.rooms.get(i).isIs_available_at_11();
            room_array[i][5] = this.rooms.get(i).isIs_available_at_12();
            room_array[i][6] = this.rooms.get(i).isIs_available_at_13();
            room_array[i][7] = this.rooms.get(i).isIs_available_at_14();
            room_array[i][8] = this.rooms.get(i).isIs_available_at_15();
            room_array[i][9] = this.rooms.get(i).isIs_available_at_16();
            room_array[i][10] = this.rooms.get(i).isIs_available_at_17();
        }
        return room_array;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserFrame().setVisible(true);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBookingButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel listOfRoomsListLabel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton submitBookingButton;
    private javax.swing.JLabel userIDInfo;
    // End of variables declaration//GEN-END:variables

    public void setUserIDInfo(String a){
        this.userIDInfo.setText(a);
    }
}