/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import company.Tools;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author R-Walid Pro_Book
 */
public class formConsulterCat extends javax.swing.JFrame {

    /**
     * Creates new form formgestionp
     */
    public formConsulterCat() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtna = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMybutton1 = new controls.JMybutton();
        jMybutton2 = new controls.JMybutton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMybutton3 = new controls.JMybutton();
        jMybutton4 = new controls.JMybutton();
        jMybutton5 = new controls.JMybutton();
        jMybutton6 = new controls.JMybutton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(740, 700));
        setMinimumSize(new java.awt.Dimension(740, 700));
        setPreferredSize(new java.awt.Dimension(740, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable2.setBackground(new java.awt.Color(204, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Vile d'escale", "temp pour l'atteindre", "Durée"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(140, 448, 456, 183);

        txtna.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txtna);
        txtna.setBounds(381, 415, 80, 23);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("N° d'avion");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(283, 426, 80, 17);

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setText("Le catalogue");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(178, 0, 311, 44);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 255));
        jLabel3.setText("La liste des tout les vols du catalogue");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(178, 43, 311, 29);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 255));
        jLabel4.setText("Liste d'escale d'un vol");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(231, 380, 172, 29);

        jMybutton1.setText("Ok");
        jMybutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton1);
        jMybutton1.setBounds(471, 416, 76, 23);

        jMybutton2.setText("Retour");
        jMybutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton2);
        jMybutton2.setBounds(322, 637, 78, 23);

        jTable1.setBackground(new java.awt.Color(255, 153, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jour", "N° du vol", "Départ", "Déstination", "Heure départ", "Durée vol", "Type d'avion", "Avion affectée"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 70, 716, 270);

        jMybutton3.setText("Imprimer cette liste");
        jMybutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton3);
        jMybutton3.setBounds(575, 351, 151, 23);

        jMybutton4.setText(" cette semaine");
        jMybutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton4);
        jMybutton4.setBounds(263, 351, 140, 23);

        jMybutton5.setText("Tout");
        jMybutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton5);
        jMybutton5.setBounds(430, 351, 89, 23);

        jMybutton6.setText("Cette jour");
        jMybutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton6);
        jMybutton6.setBounds(10, 350, 100, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/back7.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(740, 676));
        jLabel5.setMinimumSize(new java.awt.Dimension(740, 676));
        jLabel5.setPreferredSize(new java.awt.Dimension(740, 676));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 740, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:///db.go.fillToJTable("select numvol,vildep,vilarr,projou,avionprog  from vol,r_prog where numvol in(select provol from r_prog)", jTable1, true);        
    }//GEN-LAST:event_formWindowOpened

    private void jMybutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton1ActionPerformed
        // TODO add your handling code here:
        if(txtna.getText().equals(""))
            Tools.msg("Il fait saisir le N° d'avion premièrement");
        else
                {
                   db.go.fillToJTable("select numesc , vilesc , harresc, duresc from escale,r_fournit where numesc = fouesc and numesc in (select fouesc from r_fournit where fouvol = "+Integer.parseInt(txtna.getText())+") order by harresc",jTable2, true);
                }
    }//GEN-LAST:event_jMybutton1ActionPerformed

    private void jMybutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton3ActionPerformed
        try {
            // TODO add your handling code here:
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(formConsulterCat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMybutton3ActionPerformed

    private void jMybutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton4ActionPerformed

        // TODO add your handling code here: db.go.fillToJTable("select numvol,vildep,vilarr,progjour,hdep,durvol,progavion where numvol = progvol and datediff(progjou,CURRENT_DATE())>=0 ",jTable1, true);
        db.go.fillToJTable("select progjour,numvol,vildep,vilarr,hdep,durvol,progtype,est_affecter from r_prog ,vol where numvol=progvol and  (progjour between CURDATE() and (adddate(curdate(),'07') ))", jTable1, true);
    }//GEN-LAST:event_jMybutton4ActionPerformed

    private void jMybutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton5ActionPerformed
        // TODO add your handling code here:
                db.go.fillToJTable("select progjour,numvol,vildep,vilarr,hdep,durvol,progtype,est_affecter from r_prog ,vol where numvol = progvol order by progjour",jTable1, true);

    }//GEN-LAST:event_jMybutton5ActionPerformed

    private void jMybutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton6ActionPerformed
        // TODO add your handling code here:
              db.go.fillToJTable("select progjour,numvol,vildep,vilarr,hdep,durvol,progtype,est_affecter from r_prog ,vol where numvol = progvol and datediff(current_date(),progjour)=0 order by progjour",jTable1, true);

    }//GEN-LAST:event_jMybutton6ActionPerformed

    private void jMybutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Tools.open_form(new formgestionVol());
    }//GEN-LAST:event_jMybutton2ActionPerformed

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
            java.util.logging.Logger.getLogger(formConsulterCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formConsulterCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formConsulterCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formConsulterCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formConsulterCat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private controls.JMybutton jMybutton1;
    private controls.JMybutton jMybutton2;
    private controls.JMybutton jMybutton3;
    private controls.JMybutton jMybutton4;
    private controls.JMybutton jMybutton5;
    private controls.JMybutton jMybutton6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtna;
    // End of variables declaration//GEN-END:variables
}
