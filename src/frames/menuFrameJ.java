package frames;

import java.io.Serializable;
import enumPackage.help;
import enumPackage.status;
import menus.mainMenuControl;

/**
 *
 * @author Robert
 */
public class menuFrameJ extends javax.swing.JFrame implements Serializable  {
    
    private status status;
    private mainMenuControl mainMenuControl = new mainMenuControl();
   
    
    public menuFrameJ() {
        initComponents();
        this.jtWelcome.setText(help.WELCOME.getMessage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpInstructionsButton = new javax.swing.JButton();
        jExitButton = new javax.swing.JButton();
        jpStartButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtWelcome = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("jpBody"); // NOI18N

        jpBody.setBackground(new java.awt.Color(204, 204, 255));
        jpBody.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 66, 166), 2, true));
        jpBody.setFont(new java.awt.Font("Myriad Web Pro", 0, 11)); // NOI18N

        jpTitle.setFont(new java.awt.Font("Minion Pro SmBd", 0, 36)); // NOI18N
        jpTitle.setForeground(new java.awt.Color(61, 61, 155));
        jpTitle.setText("Hangman");
        jpTitle.setName("jpTitle"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jpInstructionsButton.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jpInstructionsButton.setText("Display Instructions");
        jpInstructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpInstructionsButtonActionPerformed(evt);
            }
        });

        jExitButton.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jExitButton.setText("Exit Game");
        jExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonActionPerformed(evt);
            }
        });

        jpStartButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpStartButton.setText("Start Game");
        jpStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpStartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jExitButton)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpStartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpInstructionsButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpStartButton)
                .addGap(18, 18, 18)
                .addComponent(jpInstructionsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtWelcome.setBackground(new java.awt.Color(255, 247, 222));
        jtWelcome.setColumns(20);
        jtWelcome.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jtWelcome.setLineWrap(true);
        jtWelcome.setRows(5);
        jtWelcome.setText("Welcome to the game of Hangman!\n\nYou will be playing against the computer. The object of the game is to correctly guess all the letters of the mystery word before you are hung.\n\nGood Luck!!!");
        jtWelcome.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtWelcome);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpTitle)
                .addGap(119, 119, 119))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jpTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpInstructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpInstructionsButtonActionPerformed
        this.setStatus(status.INSTRUCTIONS);
        mainMenuControl.activateControl(status);
    }//GEN-LAST:event_jpInstructionsButtonActionPerformed

    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed
        this.setStatus(status.EXIT);
        mainMenuControl.activateControl(status);
        this.dispose(); //exit the game
    }//GEN-LAST:event_jExitButtonActionPerformed

    private void jpStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpStartButtonActionPerformed
        this.setStatus(status.PLAYING);
        mainMenuControl.activateControl(status);
        this.dispose();
    }//GEN-LAST:event_jpStartButtonActionPerformed

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
            java.util.logging.Logger.getLogger(menuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new menuFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBody;
    private javax.swing.JButton jpInstructionsButton;
    private javax.swing.JButton jpStartButton;
    private javax.swing.JLabel jpTitle;
    private javax.swing.JTextArea jtWelcome;
    // End of variables declaration//GEN-END:variables

public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

}