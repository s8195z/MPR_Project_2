import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import MPR_Project.Dzial;
import MPR_Project.Firma;
import MPR_Project.Pracownik;


public class FirmaTest {
	
	private static Pracownik p;
	private static Firma f;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

//	private Object pracownik;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFirmaStringListOfPracownikListOfDzial() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirmaString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNazwa() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNazwa() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPracownicy() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPacownicy() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDzialy() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDzialy() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddDzial() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPracownik() {
	//	fail("Not yet implemented");
	
	   // Dzial d = new Dzial(1, "ksiegowosc");
       // d.addPracownik(pracownik);
		
	// List<Pracownik> list = pracownicy.getAllPracownicy();

		
	}
	

	@Test
	public void testRemoveDzial() {
		fail("Not yet implemented");
		
	
		
	}

	@Test
	public void testSearchDzial() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemovePracownik() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchPracownik() {
	//	fail("Not yet implemented");
	
		Firma f=new Firma ("x");	
		
		f.addPracownik(new Pracownik("Adam", "Kowalski", 1, 3, 4));
		assertNotNull(f.pracownicy);
			
	}

	@Test
	public void testSearchPoImieniu() {
	//	fail("Not yet implemented");
		
	//Pracownik p = new Pracownik ("Poniedzialek");
	
	}

	@Test
	public void testEditDzial_Nazwa() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditPracownik_Wynagrodzenie() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintPracownicy() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintDzialy() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintAll() {
		fail("Not yet implemented");
	}

}
