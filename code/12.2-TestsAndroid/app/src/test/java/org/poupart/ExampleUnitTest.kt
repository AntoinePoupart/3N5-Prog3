package org.poupart

import org.junit.Test

import org.junit.Assert.*

//Tests pour les codes postal
class CodePostalTest{
    @Test
    fun testValideCodePostal(){
        assertTrue(isValidZipCode("H1Y1E1"))    // Format sans espace ni tiret
        assertTrue(isValidZipCode("H1Y 1E1"))   // Format avec un espace
        assertTrue(isValidZipCode("h3Y 1E8"))   // Format avec minuscule et espace
        assertTrue(isValidZipCode("H1Y-1E1"))   // Format avec un tiret
        assertTrue(isValidZipCode("h3Y-1E8"))
    }
    @Test
    fun testCodePostalInvalide(){
        assertFalse(isValidZipCode("H1Y  1E1")) // Trop d'espaces
        assertFalse(isValidZipCode("H1Y_1E1")) // Caractère invalide : underscore
        assertFalse(isValidZipCode("h3U 1TO")) // Code postal avec lettre non valides
    }
}

//Tests pour les courriels
class CourrielTest{

    @Test
    fun CourrielValide(){
        assertTrue(isValidEmail("bob@smith.org"))
        assertTrue(isValidEmail("a.b.c@pipo.com"))
        assertTrue(isValidEmail("Rodgere.Federer@tennis.info"))
    }
    @Test
    fun CourrielInvalide(){
        assertFalse(isValidZipCode("bob@smith"))
        assertFalse(isValidZipCode("a..b@popi.org"))
        assertFalse(isValidZipCode("john.doe@.com"))
        assertFalse(isValidZipCode("john.doe@plop.c"))
    }
}