package zadatak;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.Roba;

import java.util.List;

public class Zadatak3IzmenaVrednosti {
    public static Dao<Roba, Integer>daoroba;
    public static void main(String[] args) {
        ConnectionSource cs = null;
        try {
            cs = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");
            DaoManager.createDao(cs, Roba.class);
            List<Roba>roba = daoroba.queryForEq(Roba.POLJE_OPIS, "Plasticna stolica");
            roba.get(0);




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
