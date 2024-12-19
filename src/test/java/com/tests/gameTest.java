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
}
