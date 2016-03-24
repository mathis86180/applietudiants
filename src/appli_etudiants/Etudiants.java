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
public class Etudiants extends Personne{
    @DatabaseField(id=true)
    private String identifiant;
    @DatabaseField(canBeNull = false)
    private String mot_de_passe;
    
    //accesseurs
    public String getLogin() {
        return identifiant;
    }

    public void setLogin(String login) {
        this.identifiant = login;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }
     
}
