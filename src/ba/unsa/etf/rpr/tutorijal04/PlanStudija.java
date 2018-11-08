package ba.unsa.etf.rpr.tutorijal04;

public class PlanStudija {
    private int godina;
    private Student student;
    private Semestar semestar;
    //konstruktor
    public PlanStudija(Student student, Semestar semestar, int godina) {
        this.student = student;
        this.semestar = semestar;
    }
    //set i get
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Semestar getSemestar() {
        return semestar;
    }

    public void setSemestar(Semestar semestar) {
        this.semestar = semestar;
    }
    public int getGodina() {
        return godina;
    }
    public void setGodina(int godina) {
        this.godina = godina;
    }
}
