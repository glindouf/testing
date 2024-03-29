/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myGUI;

/**
 *
 * @author Jacob
 */
public class ChangeRegister extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public ChangeRegister() {
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

        jPanel1 = new javax.swing.JPanel();
        addMemberButton = new javax.swing.JButton();
        deleteMemberButton = new javax.swing.JButton();
        updateMemberButton = new javax.swing.JButton();
        returnMainMenuButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        addMemberButton.setBackground(java.awt.Color.darkGray);
        addMemberButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addMemberButton.setForeground(java.awt.Color.white);
        addMemberButton.setText("Add member");
        addMemberButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(addMemberButton);
        addMemberButton.setBounds(110, 110, 220, 70);

        deleteMemberButton.setBackground(java.awt.Color.darkGray);
        deleteMemberButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteMemberButton.setForeground(java.awt.Color.white);
        deleteMemberButton.setText("Delete member");
        jPanel1.add(deleteMemberButton);
        deleteMemberButton.setBounds(110, 200, 220, 70);

        updateMemberButton.setBackground(java.awt.Color.darkGray);
        updateMemberButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateMemberButton.setForeground(java.awt.Color.white);
        updateMemberButton.setText("Update memberinfo");
        updateMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMemberButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateMemberButton);
        updateMemberButton.setBounds(110, 290, 220, 70);

        returnMainMenuButton.setBackground(java.awt.Color.darkGray);
        returnMainMenuButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        returnMainMenuButton.setForeground(java.awt.Color.white);
        returnMainMenuButton.setText("Return to Main Menu");
        returnMainMenuButton.setActionCommand("Return to \nMain Menu");
        returnMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMainMenuButtonActionPerformed(evt);
            }
        });
        jPanel1.add(returnMainMenuButton);
        returnMainMenuButton.setBounds(0, 470, 430, 70);

        jPanel2.setBackground(java.awt.Color.black);
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Change register");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(110, 70, 220, 290);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_Images/Drawing (2).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -30, 434, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMainMenuButtonActionPerformed
        dispose();
        MenyGUI w = new MenyGUI();
        w.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_returnMainMenuButtonActionPerformed

    private void updateMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMemberButtonActionPerformed
        dispose();
        UpdateMember w = new UpdateMember();
        w.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMemberButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberButton;
    private javax.swing.JButton deleteMemberButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton returnMainMenuButton;
    private javax.swing.JButton updateMemberButton;
    // End of variables declaration//GEN-END:variables
}
