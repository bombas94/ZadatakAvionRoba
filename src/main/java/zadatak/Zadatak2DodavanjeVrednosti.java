package zadatak;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.Avion;
import model.Roba;

import java.util.List;

public class Zadatak2DodavanjeVrednosti {
    static Dao<Avion,Integer> daoavion;
    static Dao<Roba,Integer> daoroba;
    public static void main(String[] args) {
        try{
            ConnectionSource cs = null;
            cs = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");
                    daoavion = DaoManager.createDao(cs, Avion.class);
                    daoroba = DaoManager.createDao(cs, Roba.class);

    Avion a1 =new Avion(34, "Avion1");
    daoavion.create(a1);
    Avion a2 = new Avion(21, "Avion2");
    daoavion.create(a2);

    Roba r1 = new Roba("Patike","Duboke patike",1 );
    r1.setAvion(a1);
    daoroba.create(r1);

    Roba r2 = new Roba("Kosulja", "Na duge rukave", 0.4);
    r2.setAvion(a1);
    daoroba.create(r2);

    Roba r3 = new Roba("Voda", "Voda za pice", 1.4);
    r3.setAvion(a1);
    daoroba.create(r3);

    Roba r4 = new Roba("Ploce", "Drvene ploce",3.4);
    r4.setAvion(a2);
    daoroba.create(r4);

    Roba r5 = new Roba("Stolica", "Plasticna stolica",2.4);
    r5.setAvion(a2);
    daoroba.create(r5);

            List<Roba> roba = daoroba.queryForAll();
            for (Roba r : roba)
                System.out.println(r);

            List<Avion> avion = daoavion.queryForAll();
            for (Avion a : avion)
                System.out.println(a);


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
