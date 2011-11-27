package MPR_Project;

public class Main {

public static void main(String[] args) throws Exception {
  
	  Firma firma= new Firma("KRZAK");
	  //Pracownik p =new Pracownik ("")

      firma.addPracownik(new Pracownik("Adam","Poniedzialek", 1, 689, 54));
      firma.addPracownik(new Pracownik("Ewa","Nowak", 2, 2700, 39));
      firma.addPracownik(new Pracownik("Jacek","Jutro", 3, 928,  34));

     firma.addDzial(new Dzial(1,"Ksiegowosc"));
     firma.addDzial(new Dzial(2, "Marketing"));
      firma.addDzial(new Dzial(3, "Sprzedaz"));
          
    //firma.printAll();
      firma.printPracownicy();
      firma.printDzialy();
      firma.searchDzial("Marketing");
      firma.removeDzial("Sprzedaz");

      firma.removePracownik("Jutro");
     firma.searchPoImieniu("Jacek");
    // firma.searchPoImieniu("Poniedzialek");
      firma.searchPracownik("Poniedziazek");

   }
 }
      