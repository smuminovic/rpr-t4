package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Fakultet {
    private String imeFakulteta;
    private PlanStudija vrstaStudija;
    private ArrayList<Student> studentiNaFakultetu;

    public Fakultet(String imeFakulteta) {
        this.imeFakulteta = imeFakulteta;
    }
    public String getImeFakulteta() {
        return imeFakulteta;
    }

    public void setImeFakulteta(String imeFakulteta) {
        this.imeFakulteta = imeFakulteta;
    }

    public PlanStudija getVrstaStudij() {
        return vrstaStudija;
    }

    public void setVrstaStudij(PlanStudija vrstaStudij) {
        this.vrstaStudija = vrstaStudij;
    }

    public ArrayList<Student> getStudentiNaFakultetu() {
        return studentiNaFakultetu;
    }

    public void setStudentiNaFakultetu(ArrayList<Student> studentiNaFakultetu) {
        this.studentiNaFakultetu = studentiNaFakultetu;
    }

    public void upisiStudentaNaFakultet() {};
    public void upisiStudentaNaPredmet() {};
    public void ispisiStudentaSaFakulteta() {};
    public void ispisiStudentaSaPredmeta() {};

}
