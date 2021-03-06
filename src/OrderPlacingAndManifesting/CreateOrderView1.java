/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderPlacingAndManifesting;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Arrays;

/**
 *
 * @author anujc
 */
public class CreateOrderView1 extends javax.swing.JFrame {

    /**
     * Creates new form CreateOrderView1
     */
    public CreateOrderView1() {
        setVisible(true);
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

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Lbl1 = new javax.swing.JLabel();
        Lbl2 = new javax.swing.JLabel();
        UserIDTF = new javax.swing.JTextField();
        Lbl3 = new javax.swing.JLabel();
        FNameTF = new javax.swing.JTextField();
        LNameTF = new javax.swing.JTextField();
        MobNoTF = new javax.swing.JTextField();
        Lbl4 = new javax.swing.JLabel();
        Lbl5 = new javax.swing.JLabel();
        GOBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OCM");
        setLocation(new java.awt.Point(300, 100));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        Lbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl1.setText("Create Order");

        Lbl2.setText("Enter User Details");

        UserIDTF.setText("User ID");
        UserIDTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserIDTFMouseClicked(evt);
            }
        });
        UserIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDTFActionPerformed(evt);
            }
        });

        Lbl3.setText("OR");

        FNameTF.setText("First Name");
        FNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FNameTFMouseClicked(evt);
            }
        });
        FNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTFActionPerformed(evt);
            }
        });

        LNameTF.setText("Last Name");
        LNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LNameTFMouseClicked(evt);
            }
        });
        LNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameTFActionPerformed(evt);
            }
        });

        MobNoTF.setText("Mobile Number");
        MobNoTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MobNoTFMouseClicked(evt);
            }
        });
        MobNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobNoTFActionPerformed(evt);
            }
        });

        Lbl4.setText("AND");

        Lbl5.setText("AND");

        GOBtn.setText("GO");
        GOBtn.setToolTipText("");
        GOBtn.setMaximumSize(new java.awt.Dimension(75, 75));
        GOBtn.setMinimumSize(new java.awt.Dimension(75, 75));
        GOBtn.setPreferredSize(new java.awt.Dimension(75, 75));
        GOBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Hint:");

        jLabel3.setText("Enter User ID of Customer. If you don't know the User ID, Enter the Name and Mobile Number to Search");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MobNoTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNameTF, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(Lbl5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lbl1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Lbl2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Lbl3)
                                            .addComponent(UserIDTF)))
                                    .addComponent(FNameTF))
                                .addGap(18, 18, 18)))
                        .addComponent(Lbl4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GOBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl2)
                    .addComponent(UserIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MobNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GOBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GOBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOBtnActionPerformed
        String s1, s2, s3, s4, ser1 = "ERROR : User Not Found. Please Create User.", ser2 = "ERROR : Fields cannot be left Empty.";
        s1 = UserIDTF.getText();
        s2 = FNameTF.getText();
        s3 = LNameTF.getText();
        s4 = MobNoTF.getText();
        if (s1.isEmpty() == false) {
            try {
                InsertUSERID(s1);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else if (s2.isEmpty() == false && s3.isEmpty() == false && s4.isEmpty() == false) {
            try {
                InsertUSERID(s2, s3, s4);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, ser2);
        }
    }//GEN-LAST:event_GOBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        new MainView();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MobNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobNoTFActionPerformed
        MobNoTF.setText(null);
    }//GEN-LAST:event_MobNoTFActionPerformed

    private void MobNoTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MobNoTFMouseClicked
        MobNoTF.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_MobNoTFMouseClicked

    private void LNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LNameTFMouseClicked
        LNameTF.setText(null);
    }//GEN-LAST:event_LNameTFMouseClicked

    private void FNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FNameTFMouseClicked
        FNameTF.setText(null);
    }//GEN-LAST:event_FNameTFMouseClicked

    private void UserIDTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserIDTFMouseClicked
        UserIDTF.setText(null);// TODO add your handling code here:
    }//GEN-LAST:event_UserIDTFMouseClicked

    private void UserIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDTFActionPerformed
        UserIDTF.setText(null);
    }//GEN-LAST:event_UserIDTFActionPerformed

    private void FNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameTFActionPerformed
        FNameTF.setText(null);
    }//GEN-LAST:event_FNameTFActionPerformed

    private void LNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameTFActionPerformed
        LNameTF.setText(null);
    }//GEN-LAST:event_LNameTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MainView();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FNameTF;
    private javax.swing.JButton GOBtn;
    private javax.swing.JTextField LNameTF;
    private javax.swing.JLabel Lbl1;
    private javax.swing.JLabel Lbl2;
    private javax.swing.JLabel Lbl3;
    private javax.swing.JLabel Lbl4;
    private javax.swing.JLabel Lbl5;
    private javax.swing.JTextField MobNoTF;
    private javax.swing.JTextField UserIDTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_USER = "is020";
    private static final String DB_PASSWORD = "is020";
    public static String USERIDStr;

    private void InsertUSERID(String s1) throws SQLException {
        Connection dbConnection = null;
        Statement statement = null;
        String selectTableSQL = "select * from customer where username='" + s1 + "'";

        try {
            dbConnection = getDBConnection();
            System.out.println("Connection Successful");
            statement = dbConnection.createStatement();
            System.out.println(selectTableSQL);
            ResultSet rs = statement.executeQuery(selectTableSQL);
            if (rs.next() == false) {
                String er_notexist = "ERROR : User ID does not match. Please Re-Enter User ID.";
                JOptionPane.showMessageDialog(rootPane, er_notexist);
                return;
            }
            rs = statement.executeQuery(selectTableSQL);
            if (rs.next()) {
                USERIDStr = s1;
                new CreateOrderViewProduct();
                dispose();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }

    private void InsertUSERID(String s2, String s3, String s4) throws SQLException {
        Connection dbConnection = null;
        Statement statement = null;
        String selectTableSQL = "select username from customer where first_name = '"
                + s2 + "' and last_name = '"
                + s3 + "' and mobile_number = "
                + s4 + ")";

        try {
            dbConnection = getDBConnection();
            System.out.println("Connection Successful");
            statement = dbConnection.createStatement();
            System.out.println(selectTableSQL);
            ResultSet rs = statement.executeQuery(selectTableSQL);
            if (rs.next() == false) {
                String er_notexist = "ERROR : User Not Found. Please Re-Enter User Details.";
                JOptionPane.showMessageDialog(rootPane, er_notexist);
                FNameTF.setText(null);
                LNameTF.setText(null);
                MobNoTF.setText(null);
                return;
            }
            rs = statement.executeQuery(selectTableSQL);
            if (rs.next()) {
                String uid = rs.getString("username");
                USERIDStr = uid;
                new CreateOrderViewProduct();
                dispose();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }

    private static Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
                    DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }
}
