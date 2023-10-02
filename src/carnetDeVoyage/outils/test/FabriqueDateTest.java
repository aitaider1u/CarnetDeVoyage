package carnetDeVoyage.outils.test;

import carnetDeVoyage.outils.FabriqueDate;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FabriqueDateTest {

    @Test
    void getInstance() {
    }

    @Test
    void dateSuivante(){
        Calendar calendar = Calendar.getInstance();
        FabriqueDate date = FabriqueDate.getInstance();
        date.setDate(2020,3,21);
        System.out.println(date.toString());
        date.dateSuivante();
        assertEquals("22 avril, 2020",date.toString());
        date.dateSuivante();
        System.out.println(date.toString());
        assertEquals("23 avril, 2020",date.toString());
        date.dateSuivante();
        System.out.println(date.toString());
        assertEquals("24 avril, 2020",date.toString());
        date.dateSuivante();
        System.out.println(date.getDate());
        assertEquals("25 avril, 2020",date.toString());
        date.dateSuivante();
        assertEquals("26 avril, 2020",date.toString());
        System.out.println(date.getDate());
        date.dateSuivante();
        assertEquals("27 avril, 2020",date.toString());
        System.out.println(date.getDate());
        date.dateSuivante();
        assertEquals("28 avril, 2020",date.toString());
        System.out.println(date.getDate());
        date.dateSuivante();
        assertEquals("29 avril, 2020",date.toString());
        System.out.println(date.getDate());
        date.dateSuivante();
        assertEquals("30 avril, 2020",date.toString());
        System.out.println(date.getDate());
        date.dateSuivante();
        assertEquals("01 mai, 2020",date.toString());
        date.dateSuivante();
        System.out.println(date.getDate());
        assertEquals("02 mai, 2020",date.toString());
    }

}