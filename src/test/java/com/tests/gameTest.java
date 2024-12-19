package com.tests;
import com.methods.personnage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class gameTest {
    @Test
    public void testTournerZero() {
        personnage personnage = new personnage();
        assertEquals("NORD", personnage.Tourner(0));
    }
    @Test
    public void testTourner1() {
        personnage personnage = new personnage();
        assertEquals("EST", personnage.Tourner(1));
    }
    @Test
    public void testTourner2() {
        personnage personnage = new personnage();
        assertEquals("SUD", personnage.Tourner(2));
    }
    @Test
    public void testTourner3() {
        personnage personnage = new personnage();
        assertEquals("OUEST", personnage.Tourner(3));
    }
}
