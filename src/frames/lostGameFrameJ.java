package frames;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robert
 */
public class lostGameFrameJ extends javax.swing.JFrame implements Serializable {

    /**
     * Creates new form LoseGameFrame
     */
    public lostGameFrameJ() {
        initComponents();
        this.jGallowsArea.setText(gameFrame.getGallowsString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLoserPanel = new javax.swing.JPanel();
        jPlayAgainButton = new javax.swing.JButton();
        jExitButton1 = new javax.swing.JButton();
        jWinnerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jGallowsArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLoserPanel.setBackground(new java.awt.Color(204, 204, 255));

        jPlayAgainButton.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jPlayAgainButton.setText("Play Again");
        jPlayAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlayAgainButtonActionPerformed(evt);
            }
        });

        jExitButton1.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jExitButton1.setText("Exit Game");
        jExitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButton1ActionPerformed(evt);
            }
        });

        jWinnerLabel.setBackground(new java.awt.Color(204, 204, 255));
        jWinnerLabel.setFont(new java.awt.Font("Minion Pro SmBd", 0, 36)); // NOI18N
        jWinnerLabel.setForeground(new java.awt.Color(61, 61, 155));
        jWinnerLabel.setText("Sorry, You Lose!");

        jGallowsArea.setEditable(false);
        jGallowsArea.setBackground(new java.awt.Color(255, 247, 222));
        jGallowsArea.setColumns(20);
        jGallowsArea.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jGallowsArea.setRows(5);
        jGallowsArea.setText("                       ______________\n                       |                              |\n                       |                              |\n                       |                              |\n                       |\n                       |\n                       |\n                       |\n                       |\n                       |\n                       |\n                       |\n                       |\n          ______|______________\n   ___|                                             |\n   |                                                    | ");
        jGallowsArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 66, 166), 3));
        jScrollPane1.setViewportView(jGallowsArea);

        javax.swing.GroupLayout jLoserPanelLayout = new javax.swing.GroupLayout(jLoserPanel);
        jLoserPanel.setLayout(jLoserPanelLayout);
        jLoserPanelLayout.setHorizontalGroup(
            jLoserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoserPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jLoserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jWinnerLabel)
                    .addGroup(jLoserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jLoserPanelLayout.createSequentialGroup()
                            .addComponent(jPlayAgainButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jExitButton1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jLoserPanelLayout.setVerticalGroup(
            jLoserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoserPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jWinnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jLoserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPlayAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLoserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLoserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jExitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jExitButton1ActionPerformed

    private void jPlayAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlayAgainButtonActionPerformed
        gameFrame gameFrame = null;
        try {
            gameFrame = new gameFrame();
        } catch (IOException ex) {
            Logger.getLogger(lostGameFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPlayAgainButtonActionPerformed

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
            java.util.logging.Logger.getLogger(lostGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lostGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lostGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lostGameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new lostGameFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitButton1;
    private javax.swing.JTextArea jGallowsArea;
    private javax.swing.JPanel jLoserPanel;
    private javax.swing.JButton jPlayAgainButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jWinnerLabel;
    // End of variables declaration//GEN-END:variables
}
