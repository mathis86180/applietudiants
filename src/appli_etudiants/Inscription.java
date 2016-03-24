/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author verod_000
 */
public class Inscription extends javax.swing.JDialog {

    /**
     * Creates new form Inscription
     */
    public Inscription(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldLogin = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jTextFieldDateDeNaissance = new javax.swing.JTextField();
        jTextFieldCodePostal = new javax.swing.JTextField();
        jTextFieldRue = new javax.swing.JTextField();
        jTextFieldMotDePasse = new javax.swing.JTextField();
        jTextFieldTelPerso = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldTelPro = new javax.swing.JTextField();
        jTextFieldAnneEntree = new javax.swing.JTextField();
        jTextFieldVille = new javax.swing.JTextField();
        jTextFieldAnneeSortie = new javax.swing.JTextField();
        jTextFieldSiteWeb = new javax.swing.JTextField();
        jButtonValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Inscription");

        jLabel3.setText("Nom");

        jLabel4.setText("Prénom");

        jLabel5.setText("Login");

        jLabel6.setText("Année sortie promotion");

        jLabel7.setText("Mot de passe");

        jLabel8.setText("Date de naissance");

        jLabel9.setText("Adresse rue");

        jLabel10.setText("Code postal");

        jLabel11.setText("Mail");

        jLabel12.setText("Site web");

        jLabel13.setText("Année entrée promotion");

        jLabel14.setText("Ville");

        jLabel15.setText("Téléphone personnel");

        jLabel16.setText("Téléphone professionnel");

        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });

        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });

        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNom)
                            .addComponent(jTextFieldPrenom)
                            .addComponent(jTextFieldLogin)
                            .addComponent(jTextFieldMotDePasse)
                            .addComponent(jTextFieldDateDeNaissance)
                            .addComponent(jTextFieldRue)
                            .addComponent(jTextFieldCodePostal)
                            .addComponent(jTextFieldVille)
                            .addComponent(jTextFieldTelPerso)
                            .addComponent(jTextFieldTelPro)
                            .addComponent(jTextFieldMail)
                            .addComponent(jTextFieldSiteWeb)
                            .addComponent(jTextFieldAnneEntree)
                            .addComponent(jTextFieldAnneeSortie, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButtonValider))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSiteWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnneEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnneeSortie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonValider)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        
            String nom = jTextFieldNom.getText();
            String prenom = jTextFieldPrenom.getText();
            String courriel = jTextFieldMail.getText();
            String telephone_perso = jTextFieldTelPerso.getText();
            String telephone_pro = jTextFieldTelPro.getText();
            String login = jTextFieldLogin.getText();
            String mot_de_passe = jTextFieldMotDePasse.getText();
            String dateDeNaissance = jTextFieldDateDeNaissance.getText();
            String anneeEntree = jTextFieldAnneEntree.getText();
            String anneeSortie = jTextFieldAnneeSortie.getText();
            String codePostal = jTextFieldCodePostal.getText();
            String rue = jTextFieldRue.getText();
            String ville = jTextFieldVille.getText();
            String SiteWeb = jTextFieldSiteWeb.getText();
            try {
            if (!login.trim().equals("") || !nom.trim().equals("") || !prenom.trim().equals("") 
                    || !mot_de_passe.trim().equals(""))
            {
            
            Etudiants etudiantTest = new Etudiants();
            
            etudiantTest.setAdresse_cp(codePostal);
            etudiantTest.setAdresse_rue(rue);
            etudiantTest.setAdresse_ville(ville);
            etudiantTest.setAnnee_entree_promo(anneeEntree);
            etudiantTest.setAnnee_sortie_promo(anneeSortie);
            etudiantTest.setCourriel(courriel);
            etudiantTest.setDate_de_naissance(dateDeNaissance);
            etudiantTest.setLogin(login);
            etudiantTest.setMot_de_passe(Outils.md5(mot_de_passe));
            etudiantTest.setNom(nom);
            etudiantTest.setPrenom(prenom);
            etudiantTest.setSite_web(SiteWeb);
            etudiantTest.setTel_personnel(telephone_perso);
            etudiantTest.setTel_professionnel(telephone_pro);
             DaoS4.etudiantsDao().createOrUpdate(etudiantTest);
             JOptionPane.showMessageDialog(null, "Enregistrement validé");
            }else
            {
                JOptionPane.showMessageDialog(null, "un champ n'est pas rempli");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrenomActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inscription dialog = new Inscription(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldAnneEntree;
    private javax.swing.JTextField jTextFieldAnneeSortie;
    private javax.swing.JTextField jTextFieldCodePostal;
    private javax.swing.JTextField jTextFieldDateDeNaissance;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldMotDePasse;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JTextField jTextFieldRue;
    private javax.swing.JTextField jTextFieldSiteWeb;
    private javax.swing.JTextField jTextFieldTelPerso;
    private javax.swing.JTextField jTextFieldTelPro;
    private javax.swing.JTextField jTextFieldVille;
    // End of variables declaration//GEN-END:variables
}
