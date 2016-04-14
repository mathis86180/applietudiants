/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

/**
 *
 * @author verod_000
 */

import appli_etudiants.CV_element.Cv_titre;
import com.lowagie.text.BadElementException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CVetudiant extends javax.swing.JDialog {

    /**
     * Creates new form CVetudiant
     */
    private boolean connecte;
    private Etudiants EtudiantCv;
    
    public CVetudiant(java.awt.Frame parent, boolean modal, Etudiants etudiant, Cv_titre titre) throws SQLException {
        super(parent, modal);
        initComponents();
        this.connecte = true;
        EtudiantCv = etudiant;
        jLabelProfession.setText(DaoS4.getLibelleTitre());
        jLabelPrenom.setText(etudiant.getPrenom());
        jLabelNom.setText(etudiant.getNom());
        jLabelMail.setText(etudiant.getCourriel());
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPrenom = new javax.swing.JLabel();
        jLabelAdresseRue = new javax.swing.JLabel();
        jLabelVillePostal = new javax.swing.JLabel();
        jLabelMail = new javax.swing.JLabel();
        jLabelTelPerso = new javax.swing.JLabel();
        jLabelTelPro = new javax.swing.JLabel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelProfession = new javax.swing.JLabel();
        jLabelExpPro = new javax.swing.JLabel();
        jLabelFormation = new javax.swing.JLabel();
        jLabelInformatique = new javax.swing.JLabel();
        jLabelLangue = new javax.swing.JLabel();
        jLabelCentre = new javax.swing.JLabel();
        jPanelPhoto = new javax.swing.JPanel();
        jLabelNom = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelPrenom.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelPrenom.setForeground(new java.awt.Color(51, 204, 255));
        jLabelPrenom.setText("Prénom");

        jLabelAdresseRue.setText("adresse rue");

        jLabelVillePostal.setText("code postal + ville");

        jLabelMail.setForeground(new java.awt.Color(51, 204, 255));
        jLabelMail.setText("adresse mail");

        jLabelTelPerso.setText("tél perso");

        jLabelTelPro.setText("tél professionnel");

        jLabelWeb.setText("site web");

        jLabelProfession.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProfession.setText("Profession + année(s) d'expérience");

        jLabelExpPro.setText("EXPERIENCE PROFESSIONNELLE");

        jLabelFormation.setText("FORMATION");

        jLabelInformatique.setText("INFORMATIQUE");

        jLabelLangue.setText("LANGUES");

        jLabelCentre.setText("CENTRES D'INTERET");

        javax.swing.GroupLayout jPanelPhotoLayout = new javax.swing.GroupLayout(jPanelPhoto);
        jPanelPhoto.setLayout(jPanelPhotoLayout);
        jPanelPhotoLayout.setHorizontalGroup(
            jPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelPhotoLayout.setVerticalGroup(
            jPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabelNom.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelNom.setText("NOM");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("liste experience");

        jLabel2.setText("liste formation");

        jLabel3.setText("liste compétences info");

        jLabel4.setText("liste langues");

        jLabel5.setText("liste interets");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMail)
                            .addComponent(jLabelVillePostal)
                            .addComponent(jLabelAdresseRue)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPrenom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNom))
                            .addComponent(jLabelTelPerso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabelCentre)
                            .addComponent(jLabelLangue)
                            .addComponent(jLabelInformatique)
                            .addComponent(jLabelFormation)
                            .addComponent(jLabelWeb)
                            .addComponent(jLabelTelPro)
                            .addComponent(jLabelProfession)
                            .addComponent(jLabelExpPro))
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrenom)
                            .addComponent(jLabelNom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAdresseRue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelVillePostal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTelPerso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTelPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWeb)
                .addGap(36, 36, 36)
                .addComponent(jLabelProfession)
                .addGap(18, 18, 18)
                .addComponent(jLabelExpPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabelFormation)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelInformatique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addComponent(jLabelLangue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addComponent(jLabelCentre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             Etudiants etudiantEnvoi = null;
            try {
                etudiantEnvoi = DaoS4.etudiantsDao().queryForId(this.EtudiantCv.getLogin());
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            try {
                ExportPDF.main(etudiantEnvoi);
            } catch (BadElementException ex) {
                Logger.getLogger(CVetudiant.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CVetudiant.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CVetudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CVetudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CVetudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CVetudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CVetudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CVetudiant dialog = new CVetudiant(new javax.swing.JFrame(), true, new Etudiants(), new Cv_titre());
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CVetudiant.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAdresseRue;
    private javax.swing.JLabel jLabelCentre;
    private javax.swing.JLabel jLabelExpPro;
    private javax.swing.JLabel jLabelFormation;
    private javax.swing.JLabel jLabelInformatique;
    private javax.swing.JLabel jLabelLangue;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelProfession;
    private javax.swing.JLabel jLabelTelPerso;
    private javax.swing.JLabel jLabelTelPro;
    private javax.swing.JLabel jLabelVillePostal;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanelPhoto;
    // End of variables declaration//GEN-END:variables
}