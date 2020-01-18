package zadatak;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class Zadatak4BrisanjeVrednosti {
    public static void main(String[] args) {
        ConnectionSource cs = null;
        try {
            cs = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    }

