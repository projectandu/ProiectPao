
package proiectpao;

import java.sql.*;

public class Interfata extends javax.swing.JFrame
{
    Connection conexiune;
    PreparedStatement prep = null;
    ResultSet result = null;
    
    
    public Interfata()
    {
        initComponents();
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "cactus121" );
           System.out.println("Connected");
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        jTextFieldNume = new javax.swing.JTextField();
        jTextFieldPrenume = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldParola = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nume");

        jLabel2.setText("Prenume");

        jLabel3.setText("Username");

        jLabel4.setText("Email");

        jLabel6.setText("Parola");

        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RegisterActionPerformed(evt);
            }
        });

        jTextFieldNume.setText(" ");
        jTextFieldNume.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldNumeActionPerformed(evt);
            }
        });

        jTextFieldPrenume.setText(" ");
        jTextFieldPrenume.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldPrenumeActionPerformed(evt);
            }
        });

        jTextFieldUsername.setText(" ");
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jTextFieldEmail.setText(" ");
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jTextFieldParola.setText(" ");
        jTextFieldParola.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldParolaActionPerformed(evt);
            }
        });

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LoginActionPerformed(evt);
            }
        });

        jLabel5.setText("*Daca vrei sa dai login, atunci nu e nevoie sa completezi decat username si parola");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNume, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrenume, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldParola, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(200, 200, 200))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Register)
                        .addGap(102, 102, 102)
                        .addComponent(Login)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register)
                    .addComponent(Login))
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RegisterActionPerformed
    {//GEN-HEADEREND:event_RegisterActionPerformed
       String nume = jTextFieldNume.getText();
       String prenume = jTextFieldPrenume.getText();
       String email = jTextFieldEmail.getText();
       String username = jTextFieldUsername.getText();
       String parola = jTextFieldParola.getText();
       String sql = "insert into persons(Nume, Prenume, Email, Username, Parola, Port, Victorii, Infrangeri)"
               + "values(?,?,?,?,?,?,?,?)";
       try
       {
           prep = conexiune.prepareStatement(sql);
           prep.setString(1, nume);
           prep.setString(2, prenume);
           prep.setString(3, email);
           prep.setString(4, username);
           prep.setString(5, parola);
           prep.setInt(6, 0); //trebuie sa ma prind cum sa ii aloc unui user un port
           prep.setInt(7, 0);
           prep.setInt(8, 0);
           System.out.println("Registered");
           prep.execute(); 
       
       }catch(Exception e)
       {
           e.printStackTrace();
       }
              
    }//GEN-LAST:event_RegisterActionPerformed

                                    

    private void jTextFieldNumeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldNumeActionPerformed
    {//GEN-HEADEREND:event_jTextFieldNumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeActionPerformed

    private void jTextFieldPrenumeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldPrenumeActionPerformed
    {//GEN-HEADEREND:event_jTextFieldPrenumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenumeActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldUsernameActionPerformed
    {//GEN-HEADEREND:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldEmailActionPerformed
    {//GEN-HEADEREND:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldParolaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldParolaActionPerformed
    {//GEN-HEADEREND:event_jTextFieldParolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParolaActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_LoginActionPerformed
    {//GEN-HEADEREND:event_LoginActionPerformed

        String username = jTextFieldUsername.getText();
        String parola = jTextFieldParola.getText();
    }//GEN-LAST:event_LoginActionPerformed

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Interfata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNume;
    private javax.swing.JTextField jTextFieldParola;
    private javax.swing.JTextField jTextFieldPrenume;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
