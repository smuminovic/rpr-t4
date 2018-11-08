package ba.unsa.etf.rpr.tutorijal04;

public class PlanStudija {
    private int godina;
    private int ciklus;
    //konstruktor
    public PlanStudija(int ciklus, int godina) {
        this.godina = godina;
        this.ciklus = ciklus;
    }
    //set i get

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getCiklus() {
        return ciklus;
    }

    public void setCiklus(int ciklus) {
        this.ciklus = ciklus;
    }
}
