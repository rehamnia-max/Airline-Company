/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entity.jvol;
import Entity.r_prog;
import Entity.vol;
import company.Tools;

/**
 *
 * @author R-Walid Pro_Book
 */
public class formgestionVol extends javax.swing.JFrame {

    /**
     * Creates new form formgestionVol
     */
    public formgestionVol() {
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

        canvas1 = new java.awt.Canvas();
        jMybutton11 = new controls.JMybutton();
        jMybutton3 = new controls.JMybutton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtchercher4 = new controls.JTextBox(20);
        btnchercher = new controls.JMybutton();
        jLabel3 = new javax.swing.JLabel();
        txtd = new controls.JTextBox(15);
        jLabel11 = new javax.swing.JLabel();
        txta = new controls.JTextBox(15);
        jLabel12 = new javax.swing.JLabel();
        txtnvol = new controls.JTextBox(15);
        txtduree = new controls.JTextBox(15);
        txthdep = new controls.JTextBox(15);
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMybutton1 = new controls.JMybutton();
        jLabel5 = new javax.swing.JLabel();
        jMybutton2 = new controls.JMybutton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtjour = new controls.JTextBox(15);
        jLabel14 = new javax.swing.JLabel();
        txttype = new controls.JTextBox(15);
        jLabel15 = new javax.swing.JLabel();
        txtnvol1 = new controls.JTextBox(15);
        jMybutton4 = new controls.JMybutton();
        jMybutton5 = new controls.JMybutton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 470));
        setMinimumSize(new java.awt.Dimension(900, 470));
        setPreferredSize(new java.awt.Dimension(900, 470));
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                windowo(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(canvas1);
        canvas1.setBounds(0, 0, 0, 0);

        jMybutton11.setText("Retour");
        jMybutton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton11);
        jMybutton11.setBounds(418, 420, 65, 23);

        jMybutton3.setText("Fournir escales au avions");
        jMybutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton3);
        jMybutton3.setBounds(148, 357, 197, 52);

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Programmée Catalogue");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(248, 0, 413, 32);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Vol", "Départ", "Arrivée", "Durée"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(248, 74, 406, 230);

        txtchercher4.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        txtchercher4.setForeground(new java.awt.Color(102, 255, 255));
        txtchercher4.setText("Saisir le N° du vol");
        txtchercher4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchercher4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtchercher4);
        txtchercher4.setBounds(295, 38, 183, 29);

        btnchercher.setText("Chercher vol");
        btnchercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchercherActionPerformed(evt);
            }
        });
        getContentPane().add(btnchercher);
        btnchercher.setBounds(507, 38, 114, 30);

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Ajouter vol");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(41, 74, 167, 44);

        txtd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtd.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(txtd);
        txtd.setBounds(114, 163, 124, 23);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Vile de départ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 166, 100, 17);

        txta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txta.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(txta);
        txta.setBounds(114, 196, 124, 23);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Vile d'arrivée");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 196, 100, 17);

        txtnvol.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtnvol.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(txtnvol);
        txtnvol.setBounds(114, 130, 124, 23);

        txtduree.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtduree.setForeground(new java.awt.Color(51, 255, 51));
        txtduree.setText("hh:mm");
        getContentPane().add(txtduree);
        txtduree.setBounds(114, 230, 124, 23);

        txthdep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txthdep.setForeground(new java.awt.Color(51, 255, 51));
        txthdep.setText("hh:mm");
        txthdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthdepActionPerformed(evt);
            }
        });
        getContentPane().add(txthdep);
        txthdep.setBounds(775, 196, 122, 23);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Heure départ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(664, 199, 101, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Durée ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 229, 84, 17);

        jMybutton1.setText("Enregistrer");
        jMybutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton1);
        jMybutton1.setBounds(64, 282, 120, 33);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("N° du vol");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 134, 90, 17);

        jMybutton2.setText("Enregistrer");
        jMybutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton2);
        jMybutton2.setBounds(718, 288, 120, 33);

        jLabel4.setFont(new java.awt.Font("Castellar", 1, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Programmer vol");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(668, 74, 229, 44);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("N° du vol");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(664, 133, 83, 17);

        txtjour.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtjour.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(txtjour);
        txtjour.setBounds(775, 163, 122, 23);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Date du vol");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(664, 166, 83, 17);

        txttype.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txttype.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(txttype);
        txttype.setBounds(775, 229, 122, 23);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Type d'avion");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(664, 235, 88, 17);

        txtnvol1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtnvol1.setForeground(new java.awt.Color(51, 255, 51));
        txtnvol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnvol1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnvol1);
        txtnvol1.setBounds(775, 130, 122, 23);

        jMybutton4.setText("Tout les vols");
        jMybutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton4);
        jMybutton4.setBounds(382, 327, 139, 30);

        jMybutton5.setText("Consulter le catalogue");
        jMybutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMybutton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jMybutton5);
        jMybutton5.setBounds(557, 357, 197, 52);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/back7.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMybutton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton11ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Tools.open_form(new fmain());
    }//GEN-LAST:event_jMybutton11ActionPerformed

    private void jMybutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton3ActionPerformed

        formEscale f = new formEscale();
        Tools.open_form(f);
        f.setDefaultCloseOperation(2);
    }//GEN-LAST:event_jMybutton3ActionPerformed

    private void txtchercher4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchercher4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchercher4ActionPerformed

    private void btnchercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchercherActionPerformed
        if (btnchercher.getText().equals("")) {
            Tools.msg("Saisis d'abord le N° du vol");
        } else {
            try {
                db.go.fillToJTable("select * from vol where numvol= " + Integer.parseInt(txtchercher4.getText()), jTable1, true);
            } catch (Exception ex) {
                Tools.msg("Erreur dans la saisir : " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnchercherActionPerformed

    private void txthdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthdepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthdepActionPerformed

    private void jMybutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton1ActionPerformed
        // TODO add your handling code here:
        if (txtnvol.getText().equals("") || txtd.getText().equals("") || txta.getText().equals("") || txthdep.getText().equals("") || txtduree.getText().equals("")) {
            Tools.msg("Il faut remplir tout les champs");
        } else {
            try {
                int num_vol = Integer.parseInt(txtnvol.getText());
                String day = txtjour.getText();

                if (new r_prog().is_used_day(num_vol, day)) {
                    Tools.msg("Le même numéro de vol ne peut pas être programmé plus d'une fois par jour");
                } else {
                    vol v = new vol(num_vol, txtd.getText(), txta.getText(), txtduree.getText());
                    v.add();
                    txtnvol.setText(db.go.getAutoNumber("vol", "numvol"));
                }
            } catch (Exception ex) {
                Tools.msg(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jMybutton1ActionPerformed

    private void jMybutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton2ActionPerformed
        // TODO add your handling code here:
        if (txtnvol1.getText().equals("") || txttype.getText().equals("") || txtjour.getText().equals("") || txthdep.getText().equals("")) {
            Tools.msg("Il faut remplir tout les champs");
        } else {
            try {
                int numVol = Integer.parseInt(txtnvol1.getText());
                if (new r_prog().is_used_day(numVol, txtjour.getText())) {
                    Tools.msg("le N° du vol est déjas programmer pour cette jour[choisir autre]");
                } else {
                    if (!db.go.checkExistenceOf("avion", "typav", txttype.getText())) {
                        Tools.msg("Choisissez un type d'avion qui est dans le parc");
                    } else {
                        if (!db.go.checkExistenceOf("jvol", "jour", txtjour.getText())) {
                            jvol day = new jvol(txtjour.getText());
                            day.add();
                        }
                        r_prog p = new r_prog(numVol, txtjour.getText(), txthdep.getText(), txttype.getText());
                        p.add();
                    }
                }
            } catch (Exception ex) {
                Tools.msg(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jMybutton2ActionPerformed

    private void txtnvol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnvol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnvol1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtnvol.setEnabled(false);
        txtnvol.setText(db.go.getAutoNumber("vol", "numvol"));
    }//GEN-LAST:event_formWindowOpened

    private void windowo(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_windowo
        // TODO add your handling code here:
    }//GEN-LAST:event_windowo

    private void jMybutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton4ActionPerformed
        // TODO add your handling code here:
        db.go.fillToJTable("select * from vol", jTable1, true);
    }//GEN-LAST:event_jMybutton4ActionPerformed

    private void jMybutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMybutton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        formConsulterCat form = new formConsulterCat();
        Tools.open_form(form);
        form.setDefaultCloseOperation(2);
    }//GEN-LAST:event_jMybutton5ActionPerformed

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
            java.util.logging.Logger.getLogger(formgestionVol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formgestionVol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formgestionVol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formgestionVol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formgestionVol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controls.JMybutton btnchercher;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private controls.JMybutton jMybutton1;
    private controls.JMybutton jMybutton11;
    private controls.JMybutton jMybutton2;
    private controls.JMybutton jMybutton3;
    private controls.JMybutton jMybutton4;
    private controls.JMybutton jMybutton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtchercher4;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txtduree;
    private javax.swing.JTextField txthdep;
    private javax.swing.JTextField txtjour;
    private javax.swing.JTextField txtnvol;
    private javax.swing.JTextField txtnvol1;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}
