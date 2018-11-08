package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Semestar {
    int godina;
    private PlanStudija vrstaStudija;
    private ArrayList<Predmet> redovni;
    private ArrayList<Predmet> izborni;

    public Semestar(PlanStudija plan, ArrayList<Predmet> redovni) {
        this.redovni = redovni;
    }

    public void dodajIzborniPredmet() {}
    public void ukloniIzborniPredmet() {}

    public ArrayList<Predmet> getRedovni() {
        return redovni;
    }

    public void setRedovni(ArrayList<Predmet> redovni) {
        this.redovni = redovni;
    }

    public ArrayList<Predmet> getIzborni() {
        return izborni;
    }

    public void setIzborni(ArrayList<Predmet> izborni) {
        this.izborni = izborni;
    }
}
