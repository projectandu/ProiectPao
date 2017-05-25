
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
           conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
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
        Login = new javax.swing.JButton();
        jTextFieldParola = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextUsernameLogin = new javax.swing.JTextField();
        jPasswordFieldParolaLogin = new javax.swing.JPasswordField();

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

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LoginActionPerformed(evt);
            }
        });

        jTextFieldParola.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldParolaActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setText("Username");

        jLabel10.setText("Parola");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrenume, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNume, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldParola))
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextUsernameLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldParolaLogin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Register)
                        .addGap(237, 237, 237)
                        .addComponent(Login)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jTextFieldParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextUsernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jPasswordFieldParolaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register)
                    .addComponent(Login))
                .addGap(58, 58, 58)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(30, 30, 30))
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
       String sql = "insert into persons(Nume, Prenume, Email, Username, Parola,  Victorii, Infrangeri, Online)"
               + "values(?,?,?,?,?,?,?,?)";
       try
       {
           jLabel8.setText("Username sau email deja folosit");
           prep = conexiune.prepareStatement(sql);
           prep.setString(1, nume);
           prep.setString(2, prenume);
           prep.setString(3, email);
           prep.setString(4, username);
           prep.setString(5, parola);
           prep.setInt(6, 0);
           prep.setInt(7, 0);
           prep.setBoolean(8, true);
           System.out.println(sql);
           prep.execute();
           jLabel8.setText("");
               
           
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

    private void LoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_LoginActionPerformed
    {//GEN-HEADEREND:event_LoginActionPerformed

        String username =  jTextUsernameLogin.getText() ;
        String parola =jPasswordFieldParolaLogin.getText() ;
        String sql = "select * from persons where username = ? and parola = ? and online = 0";
        String sql2 = "update Online = 1 WHERE username = ? and parola = ?";
       
        try
        {
            prep = conexiune.prepareStatement(sql);
            prep.setString(1, username);
            prep.setString(2, parola); 
            System.out.println(parola);
            System.out.println(sql);
            result = prep.executeQuery();
            if(!result.next())
                System.out.println("Totul e ok");
            else
                jLabel8.setText("Username sau parola incorecte");
            prep = conexiune.prepareStatement(sql2);
            prep.setString(1, username);
            prep.setString(2, parola);
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void jTextFieldParolaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldParolaActionPerformed
    {//GEN-HEADEREND:event_jTextFieldParolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParolaActionPerformed

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordFieldParolaLogin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNume;
    private javax.swing.JPasswordField jTextFieldParola;
    private javax.swing.JTextField jTextFieldPrenume;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField jTextUsernameLogin;
    // End of variables declaration//GEN-END:variables
}
