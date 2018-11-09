package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;
import java.util.Map;

public class Upis {
    Map<Integer,PlanStudija> planovi; //plan studija po semestrima

    public Upis() {}

    public PlanStudija dajPlanZaSemestar(int semestar) {return planovi.get(semestar);}
    public void napraviPlanZaSemestar(int semestar, PlanStudija plan) {}

}
