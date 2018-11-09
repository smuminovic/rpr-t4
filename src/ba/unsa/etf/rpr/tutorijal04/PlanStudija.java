package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class PlanStudija {
    ArrayList<Predmet> izborni;
    ArrayList<Predmet> obavezni;

    public PlanStudija(ArrayList<Predmet> izborni, ArrayList<Predmet> obavezni) {
        this.izborni = izborni;
        this.obavezni = obavezni;
    }

    public void dodajIzborniPredmet(Predmet predmet) {}
    public void dodajObavezniPredmet(Predmet predmet) {}
    public void izbrisiIzborniPredmet(Predmet predmet) {}
    public void izbrisiObavezniPredmet(Predmet predmet) {}
}
