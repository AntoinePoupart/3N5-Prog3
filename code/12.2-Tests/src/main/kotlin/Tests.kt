import junit.framework.TestCase.assertFalse
import org.junit.Assert.assertTrue
import kotlin.test.Test


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