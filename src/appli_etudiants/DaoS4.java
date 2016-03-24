/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import appli_etudiants.Personne;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verod_000
 */
public class DaoS4 {

    static private Dao<Personne, String> personneDao;
    static private Dao<Etudiants, String> etudiantsDao;
    static private ConnectionSource connectionSource;
    static private String databaseUrl;
    static DaoS4 monDaoS4;

    private DaoS4() {
        try {
            DaoS4.databaseUrl="jdbc:mysql://localhost:3306/applietudiants?user=applietudiants&password=sio";
            DaoS4.connectionSource = new JdbcConnectionSource(DaoS4.databaseUrl);
            DaoS4.personneDao = DaoManager.createDao(connectionSource, Personne.class);
            DaoS4.etudiantsDao = DaoManager.createDao(connectionSource, Etudiants.class);
        } catch (SQLException ex) {
            Logger.getLogger(DaoS4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Dao<Personne, String> personneDao() {
        if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.personneDao;
    }
    
     public static Dao<Etudiants, String> etudiantsDao() {
        if (DaoS4.monDaoS4 == null) {
            DaoS4.monDaoS4 = new DaoS4();
        }
        return DaoS4.etudiantsDao;
    }
}
