/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author nc
 */
@DatabaseTable(tableName = "utilisateurs")
public class Personne {
    
    @DatabaseField(canBeNull = false)
    private String nom;
    @DatabaseField(canBeNull = false)
    private String prenom;
    @DatabaseField(canBeNull = true)
    private String mail;
    @DatabaseField(canBeNull = true)
    private String date_de_naissance;
    @DatabaseField(canBeNull = true)
    private String adresse_rue;
    @DatabaseField(canBeNull = true)
    private String adresse_cp;
    @DatabaseField(canBeNull = true)
    private String adresse_ville;
    @DatabaseField(canBeNull = true)
    private String tel_personnel;
    @DatabaseField(canBeNull = true)
    private String tel_professionnel;
    @DatabaseField(canBeNull = true)
    private String site_web;
    @DatabaseField(canBeNull = true)
    private String annee_entree_promotion;
    @DatabaseField(canBeNull = true)
    private String annee_sortie_promotion;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCourriel() {
        return mail;
    }

    public void setCourriel(String courriel) {
        this.mail = courriel;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getAdresse_rue() {
        return adresse_rue;
    }

    public void setAdresse_rue(String adresse) {
        this.adresse_rue = adresse;
    }

    public String getAdresse_cp() {
        return adresse_cp;
    }

    public void setAdresse_cp(String adresse_cp) {
        this.adresse_cp = adresse_cp;
    }

    public String getAdresse_ville() {
        return adresse_ville;
    }

    public void setAdresse_ville(String adresse_ville) {
        this.adresse_ville = adresse_ville;
    }

    public String getTel_personnel() {
        return tel_personnel;
    }

    public void setTel_personnel(String tel_personnel) {
        this.tel_personnel = tel_personnel;
    }

    public String getTel_professionnel() {
        return tel_professionnel;
    }

    public void setTel_professionnel(String tel_professionnel) {
        this.tel_professionnel = tel_professionnel;
    }

    public String getSite_web() {
        return site_web;
    }

    public void setSite_web(String site_web) {
        this.site_web = site_web;
    }

    public String getAnnee_entree_promo() {
        return annee_entree_promotion;
    }

    public void setAnnee_entree_promo(String annee_entree_promo) {
        this.annee_entree_promotion = annee_entree_promo;
    }

    public String getAnnee_sortie_promo() {
        return annee_sortie_promotion;
    }

    public void setAnnee_sortie_promo(String annee_sortie_promo) {
        this.annee_sortie_promotion = annee_sortie_promo;
    }
    
    

}
