package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Student {
    private String imeStudenta; //ok
    private int brojIndeksa; //ok
    int semestar;
    private ArrayList<Predmet> predmeti;
    //konstruktor
    public Student(String ime, int indeks, int semestar) {
        this.brojIndeksa = indeks;
        this.imeStudenta = ime;
        this.semestar = semestar;
    }
    //koje predmete sluša student
    public void spisakPredmeta() {}
    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public void setBrojIndeksa(int brojIneksa) {
        this.brojIndeksa = brojIneksa;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }
    public String getImeStudenta() {
        return imeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public int getSemestar() {
        return semestar;
    }

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }
}
