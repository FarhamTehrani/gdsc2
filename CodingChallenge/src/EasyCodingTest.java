//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EasyCodingTest {
    private EasyCodingImplementation testee = new EasyCodingImplementation();
    private static float DELTA = 1.0E-6F;
    private static float DELTACA = 0.5F;

    public EasyCodingTest() {
    }

    @Test(
            timeout = 1000L
    )
    public void test_01_durchschnitt_Ungefaehr() {
        Assert.assertEquals(2.0, this.testee.durchschnitt(new int[]{1, 2, 3}), (double)DELTACA);
        Assert.assertEquals(1.3333334, this.testee.durchschnitt(new int[]{1, 1, 2}), (double)DELTACA);
        Assert.assertEquals(13.333334, this.testee.durchschnitt(new int[]{10, 10, 20}), (double)DELTACA);
        Assert.assertEquals(0.0, this.testee.durchschnitt(new int[0]), (double)DELTACA);
        Assert.assertEquals(0.0, this.testee.durchschnitt(new int[]{-2, -1, 1, 2}), (double)DELTACA);
        Assert.assertEquals(1.5E9, this.testee.durchschnitt(new int[]{2000000000, 1000000000}), (double)DELTACA);
    }

    @Test(
            timeout = 1000L
    )
    public void test_02_durchschnittGenau() {
        Assert.assertEquals(2.0, this.testee.durchschnitt(new int[]{1, 2, 3}), (double)DELTA);
        Assert.assertEquals(1.3333334, this.testee.durchschnitt(new int[]{1, 1, 2}), (double)DELTA);
        Assert.assertEquals(13.333334, this.testee.durchschnitt(new int[]{10, 10, 20}), (double)DELTA);
        Assert.assertEquals(0.0, this.testee.durchschnitt(new int[0]), (double)DELTA);
        Assert.assertEquals(0.0, this.testee.durchschnitt(new int[]{-2, -1, 1, 2}), (double)DELTA);
        Assert.assertEquals(1.5E9, this.testee.durchschnitt(new int[]{2000000000, 1000000000}), (double)DELTA);
    }

    @Test(
            timeout = 1000L
    )
    public void test_03_gleichesEndzeichen_Positiv() {
        String END_POS = "Gleiche Endzeichen werden nicht korrekt erkannt.";
        Assert.assertTrue("Gleiche Endzeichen werden nicht korrekt erkannt.", this.testee.gleichesEndzeichen(Arrays.asList("Hamburg", "Berg", "Bug")));
        Assert.assertTrue("Gleiche Endzeichen werden nicht korrekt erkannt.", this.testee.gleichesEndzeichen(Arrays.asList("Wieso", "Klaro", "Soso")));
        Assert.assertTrue("Gleiche Endzeichen werden nicht korrekt erkannt.", this.testee.gleichesEndzeichen(new HashSet()));
        HashSet<String> set = new HashSet();
        set.add("Hallo");
        Assert.assertTrue("Nur ein einzelnes Wort sollte auch funktionieren.", this.testee.gleichesEndzeichen(set));
        set.add("So");
        Assert.assertTrue("Gleiche Endzeichen werden nicht korrekt erkannt.", this.testee.gleichesEndzeichen(set));
        Assert.assertTrue("Auch wenn die Endzeichen keine Buchstaben sind, sollte es funktionieren.", this.testee.gleichesEndzeichen(Arrays.asList("eins1", "one1", "uno1")));
        Assert.assertTrue("Eine Collections mit keinem Element sollte auch funtionieren.", this.testee.gleichesEndzeichen(Arrays.asList()));
        Assert.assertTrue("Eine Collections mit keinem Element sollte auch funtionieren.", this.testee.gleichesEndzeichen(Collections.emptyList()));
    }

    @Test(
            timeout = 1000L
    )
    public void test_04_gleichesEndzeichen_Negativ() {
        String END_NEG = "Es muss sich um exakt die gleichen Zeichen handeln!";
        Assert.assertFalse("Groß- und Kleinschreibung ist hier zu beachten", this.testee.gleichesEndzeichen(Arrays.asList("hallo", "HAW", "Hamburg")));
        Assert.assertFalse("Es muss sich um exakt die gleichen Zeichen handeln!", this.testee.gleichesEndzeichen(Arrays.asList("Wieso", "Soso", "Darum")));
        Assert.assertFalse("Es muss sich um exakt die gleichen Zeichen handeln!", this.testee.gleichesEndzeichen(Arrays.asList("ein1", "zwei2", "one1")));
        HashSet<String> set = new HashSet();
        set.add("Hallo");
        Assert.assertTrue("Die Funktion scheint immer false zurück zu geben.", this.testee.gleichesEndzeichen(set));
    }

    @Test(
            timeout = 1000L
    )
    public void test_05_umgedrehtRekursiv_Positiv() {
        Assert.assertEquals("Wenigstens das gegebene Beispiel sollte funktionieren.", "dracula", this.testee.umgedrehtRekursiv("alucard"));
        Assert.assertTrue("Ein anderer String als im Beispiel wird nicht korrekt umgedreht.", "hallowelt".equals(this.testee.umgedrehtRekursiv("tlewollah")));
        Assert.assertTrue("Ein anderer String als im Beispiel wird nicht korrekt umgedreht.", "hallowelt!".equals(this.testee.umgedrehtRekursiv("!tlewollah")));
        String s = "Hallo, das ist ein längerer Test. Mal sehen ob das geht";
        Assert.assertTrue("Ein anderer String als im Beispiel wird nicht korrekt umgedreht.", s.equals(this.testee.umgedrehtRekursiv(this.testee.umgedrehtRekursiv(s))));
    }

    @Test(
            timeout = 1000L
    )
    public void test_06_umgedrehtRekursiv_CornerCases() {
        try {
            this.testee.umgedrehtRekursiv((String)null);
            Assert.fail("Eine Exception wird erwartet wenn das Argument ungültig ist");
        } catch (NullPointerException var2) {
        } catch (IllegalArgumentException var3) {
            Assert.fail("IllegalArgumentException? Aufgabenstellung genau lesen!");
        }

        Assert.assertTrue("Ein anderer String als im Beispiel wird nicht korrekt umgedreht.", "x".equals(this.testee.umgedrehtRekursiv("x")));
        Assert.assertTrue("Ein anderer String als im Beispiel wird nicht korrekt umgedreht.", "".equals(this.testee.umgedrehtRekursiv("")));
    }

    @Test(
            timeout = 1000L
    )
    public void test_07_zaehleUmlaute_Positiv() {
        Assert.assertEquals("Es scheint nicht mit einfachen Umlauten wie ä, ö, ü etc. zu funktionieren.", 2L, (long)this.testee.zaehleUmlaute("ächt ätzend"));
        Assert.assertEquals("Groß- und Kleinschreibung sollen ignoriert werden.", 2L, (long)this.testee.zaehleUmlaute("Ächt ätzend"));
        Assert.assertEquals("Auch Schreibung mit nachgestelltem e, wie ae, oe, ue, sollte funktionieren.", 2L, (long)this.testee.zaehleUmlaute("aecht aetzend"));
        Assert.assertEquals("Groß- und Kleinschreibung sollen ignoriert werden.", 2L, (long)this.testee.zaehleUmlaute("Aecht aetzend"));
        Assert.assertEquals("Auch besonders kurze Worte sollten funktionieren", 1L, (long)this.testee.zaehleUmlaute("ä"));
        Assert.assertEquals("Auch besonders kurze Worte sollten funktionieren", 1L, (long)this.testee.zaehleUmlaute("ae"));
        Assert.assertEquals("Auch Text mit vielen Umlauten und gemischter Schreibung sollte funktionieren.", 12L, (long)this.testee.zaehleUmlaute("ae-oe-ue-äöü-ÄÖÜ-AEOEUE"));
    }

    @Test(
            timeout = 1000L
    )
    public void test_08_zaehleUmlaute_Negativ() {
        Assert.assertEquals("Ein Wort ohne Umlaute sollte 0 liefern.", 0L, (long)this.testee.zaehleUmlaute("Java"));
        Assert.assertEquals("Achtung, bei Schreibung mit angestelltem e muss das e direkt nach dem Vokal kommen", 0L, (long)this.testee.zaehleUmlaute("axe"));
        Assert.assertEquals("Achtung, bei Schreibung mit angestelltem e muss das e direkt nach dem Vokal kommen", 0L, (long)this.testee.zaehleUmlaute("a e"));
        Assert.assertEquals("Auch sehr kurze Worte sollten funktioniern.", 0L, (long)this.testee.zaehleUmlaute("x"));
        Assert.assertEquals("Auch sehr sehr kurze Worte sollten funktioniern.", 0L, (long)this.testee.zaehleUmlaute(""));

        try {
            this.testee.zaehleUmlaute((String)null);
            Assert.fail("Bei ungültigen Argumenten sollte eine Exception geworfen werden.");
        } catch (NullPointerException var2) {
        } catch (IllegalArgumentException var3) {
            Assert.fail("Bitte auf den korrekten Typ Exception achten!");
        }

    }

    @Test(
            timeout = 1000L
    )
    public void test_09_reverseSplit_Einfach() {
        this.assertReverseSplit("abc def", "def", "abc");
        this.assertReverseSplit("aaa bbb ccc", "ccc", "bbb", "aaa");
        this.assertReverseSplit("a b c", "c", "b", "a");
        this.assertReverseSplit("abc", "abc");
        this.assertReverseSplit("Hallo Welt, das ist ein echter Test!", "Test!", "echter", "ein", "ist", "das", "Welt,", "Hallo");
    }

    @Test(
            timeout = 1000L
    )
    public void test_10_reverseSplit_CornerCases() {
        this.assertReverseSplit((String)null);
        this.assertReverseSplit("");
        this.assertReverseSplit(" ");
        this.assertReverseSplit("     ");
        this.assertReverseSplit("abc   def", "def", "abc");
        this.assertReverseSplit("abc def ", "def", "abc");
        this.assertReverseSplit(" abc  def", "def", "abc");
    }

    private void assertReverseSplit(String text, String... expected) {
        List<String> list = this.testee.reverseSplit(text);
        if (list == null) {
            Assert.fail("reverseSplit sollte eine leere Liste zurückgeben");
        }

        Object[] actual;
        if ((actual = list.toArray()).length < expected.length) {
            Assert.fail("reverseSplit findet zu wenig Worte.");
        }

        if (actual.length > expected.length) {
            Assert.fail("reverseSplit findet zu viele Worte.");
        }

        for(int i = 0; i < expected.length; ++i) {
            String wort = (String)actual[i];
            if (wort == null || wort.isEmpty()) {
                Assert.fail("reverseSplit sollte nicht null oder leere Strings zurückgeben.");
            }

            if (wort.isBlank()) {
                Assert.fail("reverseSplit sollte keine Strings mit Leerzeichen zurückgeben.");
            }

            if (!wort.equals(expected[i])) {
                if (wort.equals(expected[expected.length - i - 1])) {
                    Assert.fail("reverseSplit scheint die Wörter in der falschen Reihenfolge zurückzugeben.");
                }

                Assert.fail("reverseSplit schneidet falsch aus, bspw. wird \"" + wort + "\" statt \"" + expected[i] + "\" zurückgegeben.");
            }
        }

    }
}
