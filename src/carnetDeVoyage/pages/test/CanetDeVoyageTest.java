package carnetDeVoyage.pages.test;

import carnetDeVoyage.pages.CarnetDeVoyage;
import carnetDeVoyage.pages.Page;

import static org.junit.jupiter.api.Assertions.*;

class CanetDeVoyageTest {

    @org.junit.jupiter.api.Test
    void nbPagesDuCanet() {
        CarnetDeVoyage carnet = new CarnetDeVoyage();
        assertEquals(1,carnet.nbPagesDuCanet());
        carnet.ajouter(1);
        assertEquals(2,carnet.nbPagesDuCanet());
        carnet.ajouter(5);
        assertEquals(7,carnet.nbPagesDuCanet());
        carnet.ajouter(40);
        assertEquals(47,carnet.nbPagesDuCanet());
        carnet.ajouter(100);
        assertEquals(147,carnet.nbPagesDuCanet());

    }

    @org.junit.jupiter.api.Test
    void ajouter() {
        CarnetDeVoyage carnet = new CarnetDeVoyage();
        assertEquals(1,carnet.nbPagesDuCanet());
        carnet.getLaPageDePresenation().setDebutDuVoyage(2020,0,1);
        //System.out.println(carnet.getLaPageDePresenation().toString());
        carnet.ajouter(1);
        assertEquals(2,carnet.nbPagesDuCanet());
        assertEquals("02 janvier, 2020",carnet.getPagesDuCarnetIndex(1).getDateDuJour());
        carnet.ajouter(5);
        assertEquals(7,carnet.nbPagesDuCanet());
        assertEquals("02 janvier, 2020",carnet.getPagesDuCarnetIndex(1).getDateDuJour());
        assertEquals("03 janvier, 2020",carnet.getPagesDuCarnetIndex(2).getDateDuJour());
        assertEquals("04 janvier, 2020",carnet.getPagesDuCarnetIndex(3).getDateDuJour());
        assertEquals("05 janvier, 2020",carnet.getPagesDuCarnetIndex(4).getDateDuJour());
        assertEquals("06 janvier, 2020",carnet.getPagesDuCarnetIndex(5).getDateDuJour());
        assertEquals("07 janvier, 2020",carnet.getPagesDuCarnetIndex(6).getDateDuJour());
        carnet.ajouter(50);
        assertEquals("02 janvier, 2020",carnet.getPagesDuCarnetIndex(1).getDateDuJour());
        assertEquals("03 janvier, 2020",carnet.getPagesDuCarnetIndex(2).getDateDuJour());
        assertEquals("04 janvier, 2020",carnet.getPagesDuCarnetIndex(3).getDateDuJour());
        assertEquals("05 janvier, 2020",carnet.getPagesDuCarnetIndex(4).getDateDuJour());
        assertEquals("06 janvier, 2020",carnet.getPagesDuCarnetIndex(5).getDateDuJour());
        assertEquals("07 janvier, 2020",carnet.getPagesDuCarnetIndex(6).getDateDuJour());
        assertEquals("08 janvier, 2020",carnet.getPagesDuCarnetIndex(7).getDateDuJour());
        assertEquals("09 janvier, 2020",carnet.getPagesDuCarnetIndex(8).getDateDuJour());
        assertEquals("10 janvier, 2020",carnet.getPagesDuCarnetIndex(9).getDateDuJour());
        assertEquals("11 janvier, 2020",carnet.getPagesDuCarnetIndex(10).getDateDuJour());
        assertEquals("12 janvier, 2020",carnet.getPagesDuCarnetIndex(11).getDateDuJour());
        assertEquals("13 janvier, 2020",carnet.getPagesDuCarnetIndex(12).getDateDuJour());
        assertEquals("14 janvier, 2020",carnet.getPagesDuCarnetIndex(13).getDateDuJour());

        assertEquals(57,carnet.nbPagesDuCanet());
        carnet.ajouter(100);
        assertEquals(157,carnet.nbPagesDuCanet());
    }

    @org.junit.jupiter.api.Test
    void nbrJourDuVoyage(){
        CarnetDeVoyage carnet = new CarnetDeVoyage();
        Page page = carnet.getLaPageDePresenation();
        page.setDebutDuVoyage(2020,10,1);
        page.setFinDuVoyage(2020,10,10);
        assertEquals(10,carnet.nbrJourDuVoyage());
        page.setDebutDuVoyage(100,10,1);
        page.setFinDuVoyage(100,11,15);
        assertEquals(45,carnet.nbrJourDuVoyage());
        page.setDebutDuVoyage(100,10,1);
        page.setFinDuVoyage(100,10,1);
        assertEquals(1,carnet.nbrJourDuVoyage());
        page.setDebutDuVoyage(100,10,7);
        page.setFinDuVoyage(100,10,10);
        assertEquals(4,carnet.nbrJourDuVoyage());
    }

    @org.junit.jupiter.api.Test
    void getLaPageDePresenation() {

    }
}