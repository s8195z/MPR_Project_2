package MPR_Project;

public class Main {

public static void main(String[] args) throws Exception {
  
	  Firma firma= new Firma("KRZAK");

      firma.addPracownik(new Pracownik("Adam","Poniedziałek", 1, 689, 54));
      firma.addPracownik(new Pracownik("Ewa","Nowak", 2, 2700, 39));
      firma.addPracownik(new Pracownik("Jacek","Jutro", 3, 928,  34));

      firma.addDzial(new Dzial(1,"Księgowość"));
      firma.addDzial(new Dzial(2, "Marketing"));
      firma.addDzial(new Dzial(3, "Sprzedaż"));
          
    //firma.printAll();
      firma.printPracownicy();
      firma.printDzialy();
      firma.searchDzial("Marketing");
      firma.removeDzial("Sprzedaż");

      firma.removePracownik("Jutro");
      firma.searchPracownik1("Jacek");
      firma.searchPracownik("Poniedziałek");

   }
 }
      