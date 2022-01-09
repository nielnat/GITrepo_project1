import java.util.Calendar;

public class NsisDate {
private int jour, mois, annee;

private NsisDate() {

}

private void init() {
  Calendar cal = Calendar.getInstance();

jour = cal.get(Calendar.DAY_OF_MONTH);
mois = cal.get(Calendar.MONTH)+1;
annee = cal.get(Calendar.YEAR);
}

private void init(int j) {
         Calendar cal = Calendar.getInstance();
                jour = j;
mois = cal.get(Calendar.MONTH)+1;
annee = cal.get(Calendar.YEAR);
}

private void init(int j, int m) {
                Calendar cal = Calendar.getInstance();
                jour = j;
                mois = m;
                annee = cal.get(Calendar.YEAR);
}

private void init(int j, int m, int a) {
  jour = j;
  mois = m;
  annee = a;
}
 @Override
public String toString() {
 return jour + "/" + mois + "/" + annee;
}
}
