/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants.CV_element;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author verod_000
 */
@DatabaseTable(tableName = "cv_photo")
public class Cv_photo {

    @DatabaseField(id=true)
    private Integer id_photo;
    @DatabaseField
    private String id_utilisateur;
    @DatabaseField
    private String photo;

    public Integer getId_photo() {
        return id_photo;
    }

    public void setId_photo(Integer id_photo) {
        this.id_photo = id_photo;
    }

    public String getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(String id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
