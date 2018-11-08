package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Student {
    private String imeStudenta;
    private int brojIndeksa;
    private int godinaStudija;
    private ArrayList<Predmet> predmeti;
    //konstruktor
    public Student(String ime, int indeks, int godina) {
        this.brojIndeksa = indeks;
        this.imeStudenta = ime;
        this.godinaStudija = godina;
    }
    //koje predmete sluša student, da ispiše (poziva se nad studentom)
    public void spisakPredmeta() {}
    //set i get
    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public void setBrojIndeksa(int brojIneksa) {
        this.brojIndeksa = brojIneksa;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
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

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }
}
