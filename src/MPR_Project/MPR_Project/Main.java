package MPR_Project;

public class Main {

public static void main(String[] args) throws Exception {
  
	  Firma firma= new Firma("KRZAK");
	  //Pracownik p =new Pracownik ("")

      firma.addPracownik(new Pracownik("Adam","Poniedzia�ek", 1, 689, 54));
      firma.addPracownik(new Pracownik("Ewa","Nowak", 2, 2700, 39));
      firma.addPracownik(new Pracownik("Jacek","Jutro", 3, 928,  34));

     firma.addDzial(new Dzial(1,"Ksi�gowo��"));
     firma.addDzial(new Dzial(2, "Marketing"));
      firma.addDzial(new Dzial(3, "Sprzeda�"));
          
    //firma.printAll();
      firma.printPracownicy();
      firma.printDzialy();
      firma.searchDzial("Marketing");
      firma.removeDzial("Sprzedaz");

      firma.removePracownik("Jutro");
     firma.searchPoImieniu("Jacek");
    // firma.searchPoImieniu("Poniedzia�ek");
      firma.searchPracownik("Poniedziazek");

   }
 }
      