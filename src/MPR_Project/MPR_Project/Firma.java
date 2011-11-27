
    package MPR_Project;

    import java.util.ArrayList;
    import java.util.List;
    
    /*     public List<Pracownik> pracownicy= new ArrayList<Pracownik>();
     public List<Dzial> dzialy= new ArrayList<Dzial>();
     public List<Firma> zaliczenia = new ArrayList<Firma>();
    
    public Firma(String nazwa) {
    		super();
    		this.Nazwa = nazwa;
    		this.pracownicy = new ArrayList<Pracownik>();
    		this.dzialy = new ArrayList<Dzial>();
    	}*/

    public class Firma {

    	public String Nazwa;

         public List<Pracownik> pracownicy= new ArrayList<Pracownik>();
         public List<Dzial> dzialy= new ArrayList<Dzial>();
         public Firma(String nazwa, List<Pracownik> pracownicy , List<Dzial> dzialy)
          {
                   this.Nazwa=nazwa;
                   this.pracownicy=pracownicy;
                   this.dzialy=dzialy; 
          }
        
         public Firma(String nazwa) {
        		super();
        		this.Nazwa = nazwa;
        		this.pracownicy = new ArrayList<Pracownik>();
        		this.dzialy = new ArrayList<Dzial>();
        	}

        	public String getNazwa() {
        		return Nazwa;
        	}
        	public void setNazwa(String nazwa) {
        		Nazwa = nazwa;
        	}
        	
            public List<Pracownik> getPracownicy() {
        		return pracownicy;
        	}
        	public void setPacownicy(List<Pracownik> pracownicy) {
        		this.pracownicy = pracownicy;
        	}
        	
     	
        	public List<Dzial> getDzialy() {
        		return dzialy;
        	}
        	public void setDzialy(List<Dzial> dzialy) {
        		this.dzialy = dzialy;
        	}	

         
        	
        	public void addDzial(Dzial dzial){
        		dzialy.add(dzial);
        	}

        	public void addPracownik(Pracownik pracownik){
        		pracownicy.add(pracownik);
        	}
        	
        	
       	    public void removeDzial(String nazwa) {
         		int pozycja = 0;
        		for (Dzial dzial : dzialy) {
        			if (dzial.getNazwa().equals(nazwa)) {
        				dzialy.remove(pozycja);
        				break;
        			}
        			pozycja++;
        		}
        	}
    	    public void searchDzial(String nazwa){ 

    		  System.out.println("Szukaj dzialu:");
    		    for (Dzial dzial : dzialy) {
    			  if (dzial.getNazwa().equals(nazwa))
    			 	 dzial.printDzial();
    		 }
    	  }	

    	
    	   public void removePracownik(String nazwa) {
    		   int pozycja = 0;
    		     for (Pracownik pracownik : pracownicy) {
    			   if (pracownik.getNazwisko().equals(nazwa)) {
    				 pracownicy.remove(pozycja);
    				 break;
    			 }
    			 pozycja++;
    		}
    	}
        	
    	   
    	   
    	   
    	   
    	   
          public void searchPracownik(String nazwa) throws Exception{ 
        		System.out.println("Szukaj pracownika:");
        		for (Pracownik pracownik : pracownicy) {
        		
    			   if (pracownik.getNazwisko().equals(nazwa))
        				pracownik.printPracownik();
    			}
    			  throw new Exception ("Nie znaleziono pracownika o nazwisku= " +nazwa);
        			
    	/*	else //nazwisko = null;
          //System.out.println("Nie zaleziono pracownika" +nazwisko);
    		return null;
    	    
    	    pracownik.printPracownik();
        	*/
        	}	
        	
        
       /*   public void searchPoImieniu(String nazwa){ 
        		System.out.println("Szukaj pracownika:");
        		for (Pracownik pracownik : pracownicy) {
        			if (pracownik.getImie().equals(nazwa))
        				pracownik.printPracownik();
        		}
        	}	
        	
          */
         
          public ArrayList<Pracownik> searchPoImieniu (String nazwisko) {
        	  
        	  ArrayList<Pracownik> arr = new ArrayList<Pracownik>();
        	  
        	  for (Pracownik p : pracownicy) {
        		  if (p.getNazwisko() == nazwisko) arr.add(p);
        	  }
        	  return arr;
          }
          
          
          
          
          
        	
          public void editDzial_Nazwa(int id_dzial, String new_nazwa) {
        		int pozycja = 0;
        		for (Dzial dzial : dzialy) {
        			if (dzial.getID_dzial().equals(id_dzial)) {
        				dzialy.set(pozycja, new Dzial(id_dzial, new_nazwa));
        				break;
        			}
        			pozycja++;
        		}
        	}
        	  	
          public void editPracownik_Wynagrodzenie(String nazwisko, double new_wynagrodzenie) {
        		int pozycja = 0;
        		for (Pracownik pracownik : pracownicy) {
        			if (pracownik.getNazwisko().equals(nazwisko)) {
        				pracownicy.set(pozycja, new Pracownik(nazwisko, nazwisko, pozycja, new_wynagrodzenie, pozycja));
        				break;
        			}
        			pozycja++;
        		}
        	}

        	
          public void printPracownicy(){
        		
        		System.out.println("Pracownicy:");
        		for(Pracownik pracownik: pracownicy){
        			pracownik.printPracownik();
        		}
         	}
        	
          public void printDzialy(){
        		
        		System.out.println("Dzialy:");
        		for(Dzial dzial: dzialy){
        			dzial.printDzial();
        		}
        	}
        	

          public void printAll() {
     		  this.printDzialy();
     		  this.printPracownicy(); 		
      	 } 
    }

