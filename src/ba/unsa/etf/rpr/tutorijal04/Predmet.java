package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Predmet {
    private String imePredmeta;
    private int brojEcts;
    private int sifraPredmeta;
    private ArrayList<Student> studenti;
    //konstruktor
    public Predmet(String ime, int ects, int sifra) {
        this.imePredmeta = ime;
        this.brojEcts = ects;
        this.sifraPredmeta = sifra;
    }
    //spisak studenta koji slušaju predmet
    public void spisakStudenata() {}
    //upisivanje studenta na predmet
    public void upisiStudentaNaPredmet(Student student1) {}
    //ispisivanje studenta sa predmeta
    public void ispisiStudentaSaPredmeta(Student student1) {}
    //get i set
    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getBrojEcts() {
        return brojEcts;
    }

    public void setBrojEcts(int brojEcts) {
        this.brojEcts = brojEcts;
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Student> studenti) {
        this.studenti = studenti;
    }
}
