package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class Avion {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_OZNAKA, canBeNull = false)
    private String oznaka;
    @DatabaseField(columnName = POLJE_RASPONKRILA, canBeNull = false)
    private int rasponKrila;
    @ForeignCollectionField(foreignFieldName = "avion")
    private ForeignCollection<Roba> roba;


    public static final String POLJE_OZNAKA = "oznaka";
    public static final  String POLJE_RASPONKRILA = "rasponKrila";

    public Avion(){

    }
    public Avion ( int rasponKrila, String oznaka){
        this.oznaka = oznaka;
        this.rasponKrila = rasponKrila;
    }

    public int getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(int rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public ForeignCollection<Roba> getRoba() {
        return roba;
    }

    public void setRoba(ForeignCollection<Roba> roba) {
        this.roba = roba;
    }
    @Override
    public String toString(){
        return "id= " +id + "oznaka= " + oznaka + "rasponKrila= " + rasponKrila + "roba = " +roba
    ;}
}

