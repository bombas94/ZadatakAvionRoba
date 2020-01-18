package zadatak;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import model.Avion;
import model.Roba;

import java.sql.Connection;
import java.sql.Statement;

public class Zadatak1KrejiranjeTabela {
    public static void main(String[] args) {
        ConnectionSource cs = null;
        try {
            cs = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");

            TableUtils.dropTable(cs, Roba.class, true);
            TableUtils.dropTable(cs, Avion.class, true);

            TableUtils.createTable(cs, Avion.class);
            TableUtils.createTable(cs, Roba.class);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
