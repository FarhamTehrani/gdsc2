import org.junit.Assert;
import org.junit.Test;

public class BeginnerCodingTest {

    private BeginnerCodingImplementation testee = new BeginnerCodingImplementation();

    @Test
    public void istEsDieseZahlTest(){
        testee.setZZahl(10);
        Assert.assertEquals("Die Zahl ist zu niedrig.", testee.istEsDieseZahl(9));
        Assert.assertEquals("Die Zahl ist zu hoch.", testee.istEsDieseZahl(11));
        Assert.assertEquals("Die Zahl ist richtig. Du hast 3 Versuche gebraucht.", testee.istEsDieseZahl(10));
    }

    @Test
    public void istUngerade(){
        Assert.assertFalse(testee.istUngerade(2));
        Assert.assertTrue(testee.istUngerade(31));
    }

    @Test
    public void addAndSquareIntegers(){
        Assert.assertEquals(36, testee.addAndSquareIntegers(3,3));
        Assert.assertEquals(81, testee.addAndSquareIntegers(5,4));
    }

    @Test
    public void convertTemperatur() {
        Assert.assertEquals(50, testee.convertTemperatur(10));
        Assert.assertEquals(41.9, testee.convertTemperatur(5.5));
    }
}
