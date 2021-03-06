package pub.frames;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class ClienteMenu extends javax.swing.JFrame {

  // public static void showPanel(JPanel pg) {
  //   pg.setSize(1200,720);
  //   pg.setLocation(0,0);
  //   Background.removeAll();
  //   Background.add(pg, BorderLayout.CENTER);
  //   Background.revalidate();
  //   Background.repaint();
  // }

  public ClienteMenu() {
    initComponents();
    setLocationRelativeTo(null);
    toggleMenu.setVisible(false);
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Background = new javax.swing.JPanel();
        Cabeza = new javax.swing.JPanel();
        pubIcon = new javax.swing.JLabel();
        toggleButton = new javax.swing.JToggleButton();
        toggleMenu = new javax.swing.JPanel();
        btnFood = new javax.swing.JButton();
        btnBeer = new javax.swing.JButton();
        btnWine = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Background.setBackground(new java.awt.Color(27, 31, 37));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cabeza.setBackground(new java.awt.Color(19, 119, 180));

        pubIcon.setFont(new java.awt.Font("JetBrainsMono Nerd Font Mono", 1, 48)); // NOI18N
        pubIcon.setForeground(new java.awt.Color(73, 168, 245));
        pubIcon.setText("NP");

        toggleButton.setFont(new java.awt.Font("JetBrainsMono Nerd Font Mono", 0, 48)); // NOI18N
        toggleButton.setForeground(new java.awt.Color(255, 255, 255));
        toggleButton.setText("");
        toggleButton.setActionCommand("x");
        toggleButton.setBorder(null);
        toggleButton.setBorderPainted(false);
        toggleButton.setContentAreaFilled(false);
        toggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CabezaLayout = new javax.swing.GroupLayout(Cabeza);
        Cabeza.setLayout(CabezaLayout);
        CabezaLayout.setHorizontalGroup(
            CabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 428, Short.MAX_VALUE)
                .addComponent(pubIcon)
                .addGap(14, 14, 14))
        );
        CabezaLayout.setVerticalGroup(
            CabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabezaLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(CabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pubIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(Cabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        toggleMenu.setBackground(new java.awt.Color(19, 119, 180));

        btnFood.setBackground(new java.awt.Color(27, 31, 37));
        btnFood.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        btnFood.setForeground(new java.awt.Color(204, 204, 204));
        btnFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/burger.png"))); // NOI18N
        btnFood.setText("  Comidas");
        btnFood.setBorderPainted(false);
        btnFood.setContentAreaFilled(false);
        btnFood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFood.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFood.setVerifyInputWhenFocusTarget(false);
        btnFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodActionPerformed(evt);
            }
        });

        btnBeer.setBackground(new java.awt.Color(27, 31, 37));
        btnBeer.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        btnBeer.setForeground(new java.awt.Color(204, 204, 204));
        btnBeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/beer.png"))); // NOI18N
        btnBeer.setText("   Cervezas");
        btnBeer.setContentAreaFilled(false);
        btnBeer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBeer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBeer.setVerifyInputWhenFocusTarget(false);
        btnBeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeerActionPerformed(evt);
            }
        });

        btnWine.setBackground(new java.awt.Color(27, 31, 37));
        btnWine.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        btnWine.setForeground(new java.awt.Color(204, 204, 204));
        btnWine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wine.png"))); // NOI18N
        btnWine.setText("  Vinos & Licores");
        btnWine.setBorderPainted(false);
        btnWine.setContentAreaFilled(false);
        btnWine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWine.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnWine.setVerifyInputWhenFocusTarget(false);
        btnWine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWineActionPerformed(evt);
            }
        });

        btnOut.setBackground(new java.awt.Color(27, 31, 37));
        btnOut.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        btnOut.setForeground(new java.awt.Color(204, 204, 204));
        btnOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/out.png"))); // NOI18N
        btnOut.setText("   Salir");
        btnOut.setBorderPainted(false);
        btnOut.setContentAreaFilled(false);
        btnOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOut.setVerifyInputWhenFocusTarget(false);
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toggleMenuLayout = new javax.swing.GroupLayout(toggleMenu);
        toggleMenu.setLayout(toggleMenuLayout);
        toggleMenuLayout.setHorizontalGroup(
            toggleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(toggleMenuLayout.createSequentialGroup()
                .addGroup(toggleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBeer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addGroup(toggleMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(toggleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWine, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(btnOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        toggleMenuLayout.setVerticalGroup(
            toggleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toggleMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnWine, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnFood, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(btnOut)
                .addGap(42, 42, 42))
        );

        Background.add(toggleMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFoodActionPerformed

    private void btnBeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBeerActionPerformed

    private void toggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonActionPerformed
        if (toggleButton.isSelected()) {
            toggleButton.setText("x");
            toggleMenu.setVisible(true);
        } else {
            toggleButton.setText("");
            toggleMenu.setVisible(false);
        }
    }//GEN-LAST:event_toggleButtonActionPerformed

    private void btnWineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWineActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
      Ingresar f = new Ingresar();
      f.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnOutActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Background;
    private javax.swing.JPanel Cabeza;
    private javax.swing.JButton btnBeer;
    private javax.swing.JButton btnFood;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnWine;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel pubIcon;
    private javax.swing.JToggleButton toggleButton;
    private javax.swing.JPanel toggleMenu;
    // End of variables declaration//GEN-END:variables
}
