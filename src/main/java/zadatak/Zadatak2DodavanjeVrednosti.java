package zadatak;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.Avion;
import model.Roba;

public class Zadatak2DodavanjeVrednosti {
    static Dao<Avion,Integer> daoavion;
    static Dao<Roba,Integer> daoroba;
    public static void main(String[] args) {
        try{
            ConnectionSource cs = null;
            cs = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");
                    daoavion = DaoManager.createDao(cs, Avion.class);
                    daoroba = DaoManager.createDao(cs, Roba.class);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
