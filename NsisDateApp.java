

/* Le main du programme */
public class NsisDateApp {
   public static void main (String[] args){

/*Instanciation d'objet de la classe Espace*/
      
       NsisDate date = new NsisDate();
       NsisDate date2 = new NsisDate();
       NsisDate date3 = new NsisDate();
       date.init();
       date2.init(16);
       date3.init(7,3);
       System.out.println(date);
       System.out.println(date2);
       System.out.println(date3);
  }
}

