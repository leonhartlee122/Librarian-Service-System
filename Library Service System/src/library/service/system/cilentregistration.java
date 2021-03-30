/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class cilentregistration extends javax.swing.JFrame {

    /**
     * Creates new form clientregistration
     */
    public cilentregistration() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SectionTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Role = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Uni = new javax.swing.JTextField();
        Personal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Borrow = new javax.swing.JMenuItem();
        Renew = new javax.swing.JMenuItem();
        Return = new javax.swing.JMenuItem();
        CilentRegistration = new javax.swing.JMenuItem();
        ClientEdit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AddBook = new javax.swing.JMenuItem();
        EditBook = new javax.swing.JMenuItem();
        Records = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SectionTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SectionTitle.setText("Client Registration");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Client ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Client Name");

        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Role.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lecturer"}));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Client Role");

        Gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female"}));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Client Gender");

        Uni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Personal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("University Email");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Personal Email");

        Save.setText("Register New Cilent");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("*No changes available for Client ID after registration");

        jMenu1.setText("Client Section");

        Borrow.setText("Borrow Book");
        Borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowActionPerformed(evt);
            }
        });
        jMenu1.add(Borrow);

        Renew.setText("Renew Book");
        Renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenewActionPerformed(evt);
            }
        });
        jMenu1.add(Renew);

        Return.setText("Return Book");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        jMenu1.add(Return);

        CilentRegistration.setText("Client Registration");
        CilentRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CilentRegistrationActionPerformed(evt);
            }
        });
        jMenu1.add(CilentRegistration);

        ClientEdit.setText("Client Edit");
        ClientEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientEditActionPerformed(evt);
            }
        });
        jMenu1.add(ClientEdit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Library Management");

        AddBook.setText("Add Book");
        AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookActionPerformed(evt);
            }
        });
        jMenu2.add(AddBook);

        EditBook.setText("Edit Book");
        EditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBookActionPerformed(evt);
            }
        });
        jMenu2.add(EditBook);

        Records.setText("Borrow Records");
        Records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordsActionPerformed(evt);
            }
        });
        jMenu2.add(Records);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Account");

        jMenuItem7.setText("Log Out");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ID)
                                .addComponent(Name)
                                .addComponent(Gender, 0, 190, Short.MAX_VALUE))
                            .addComponent(Role, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Personal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(SectionTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(Save))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel8)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(SectionTitle)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Uni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addComponent(Save)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        id = ID.getText();
        name = Name.getText();
        gender = Gender.getSelectedItem().toString();
        role = Role.getSelectedItem().toString();
        uni = Uni.getText();
        personal = Personal.getText();
        if (id.equals("") || name.equals("") || gender.equals("") || role.equals("") || uni.equals("") || personal.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Fill In All Valid Data!!");
        }
        else if (IDValidator()) {
        JOptionPane.showMessageDialog(null,"Oops, the ID has been used!");
       }
        else {result = JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Register This Client?", "Save To Library", JOptionPane.ERROR_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            FileWriter fw = new FileWriter("client.txt", true); // insert True is to insert new record instead of overwrite
            PrintWriter out = new PrintWriter(fw);
            out.write(id + ":" + name + ":" + gender + ":" + role + ":" + uni + ":" + personal);
            out.write(System.getProperty("line.separator"));
            out.close();
            fw.close();
            ID.setText("");
            Name.setText("");
            Uni.setText("");
            Personal.setText("");
        } catch (Exception ae){
            JOptionPane.showMessageDialog(null, ae);
        }
       }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void BorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        borrow page = new borrow();
    }//GEN-LAST:event_BorrowActionPerformed

    private void RenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenewActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        renew page = new renew();
    }//GEN-LAST:event_RenewActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        returned page = new returned();
    }//GEN-LAST:event_ReturnActionPerformed

    private void CilentRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CilentRegistrationActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        cilentregistration page = new cilentregistration();
    }//GEN-LAST:event_CilentRegistrationActionPerformed

    private void ClientEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientEditActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        clientedit page = new clientedit();
    }//GEN-LAST:event_ClientEditActionPerformed

    private void AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        addbook page = new addbook();
    }//GEN-LAST:event_AddBookActionPerformed

    private void EditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBookActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        bookedit page = new bookedit();
    }//GEN-LAST:event_EditBookActionPerformed

    private void RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        records page = new records();
    }//GEN-LAST:event_RecordsActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        login page = new login();
    }//GEN-LAST:event_jMenuItem7ActionPerformed
      private boolean IDValidator(){
         id = ID.getText();  // Get ID string
         boolean status = false;
        try {
            File file = new File("client.txt");
            Scanner inputFile = new Scanner(file); // Read all librarian information
            
            while (inputFile.hasNext()) // Read lines from the file until no more are left.
            {
              String line = inputFile.nextLine();// Read the next line
              String[] details = line.split(":");
                if (id.equals(details[0])) { // Compare with first row array
                     status = true;
                }
            }
            inputFile.close();
        } catch (Exception ex) {  
        }
        return status;
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
            java.util.logging.Logger.getLogger(cilentregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cilentregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cilentregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cilentregistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cilentregistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddBook;
    private javax.swing.JMenuItem Borrow;
    private javax.swing.JMenuItem CilentRegistration;
    private javax.swing.JMenuItem ClientEdit;
    private javax.swing.JMenuItem EditBook;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Personal;
    private javax.swing.JMenuItem Records;
    private javax.swing.JMenuItem Renew;
    private javax.swing.JMenuItem Return;
    private javax.swing.JComboBox<String> Role;
    private javax.swing.JButton Save;
    private javax.swing.JLabel SectionTitle;
    private javax.swing.JTextField Uni;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
    private String id, name, gender, role, uni, personal;
    private int result;
}