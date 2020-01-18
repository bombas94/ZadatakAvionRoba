package model;

import com.j256.ormlite.field.DatabaseField;

public class Avion {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_OZNAKA, canBeNull = false)
    private String oznaka;
    @DatabaseField(columnName = POLJE_RASPONKRILA, canBeNull = false)
    private int rasponKrila;


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
    @Override
    public String toString(){
        return "id= " +id + "oznaka= " + oznaka + "rasponKrila= " + rasponKrila
    ;}
}

