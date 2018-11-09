package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Fakultet {
    private String imeFakulteta;
    private ArrayList<Predmet> sviPredmetiNaFakultetu;
    private ArrayList<Student> sviStudentiNaFakultetu;

    public Fakultet(String imeFakulteta) {
        this.imeFakulteta = imeFakulteta;
    }

    public String getImeFakulteta() {
        return imeFakulteta;
    }

    public void setImeFakulteta(String imeFakulteta) {
        this.imeFakulteta = imeFakulteta;
    }

    public ArrayList<Student> geSviStudentiNafakultetu() {
        return sviStudentiNaFakultetu;
    }

    public ArrayList<Predmet> getSviPredmetiNaFakultetu() {
        return sviPredmetiNaFakultetu;
    }

    public void setSviPredmetiNaFakultetu(ArrayList<Predmet> predmeti) {
        this.sviPredmetiNaFakultetu = predmeti;
    }

    public void setSviStudentiNaFakultetu(ArrayList<Student> studenti) {
        this.sviStudentiNaFakultetu = studenti;
    }
    public void upisiStudentaNaFakultet() {};
    public void upisiStudentaNaPredmet() {};
    public void ispisiStudentaSaFakulteta() {};
    public void ispisiStudentaSaPredmeta() {};

}
