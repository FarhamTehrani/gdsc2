import java.util.*;

/**
 * Einfache isolierte Methoden.
 * <p>
 * Details sind bei den jeweiligen Methoden angegebnen.
 * <p>
 * Für die Implementierung stehen 10 Tests bereits, jeweils 2 Tests pro Methode.
 * Der Quellcode der Tests wird nicht mitgeliefert.
 * Die Tests versuchen, Hinweise auf den Fehler zu geben, ohne
 * zuviel zu verraten. Es ist natürlich möglich, eigene Tests zu schreiben.
 * <p>
 * Bitte beachten: Die Implementierung muss {@code ServiceMixImpl} heißen.
 *
 * @author Jens von Pilgrim
 * @version BWI1-PTP SS20
 */
public interface EasyCoding
{
    /**
     * Gibt den Durchschnitt der gegebenen Zahlen zurück.
     * <p>
     * Beispiel:
     * <ol>
     * <li> 1, 2, 3 gibt 2.0 zurück,
     * <li> 1, 1, 2 gibt 1.3333334 zurück.
     * </ol>
     * <p>
     * Wenn das übergebene Array leer ist, soll 0 zurückgegeben werden.
     *
     * @return Der Durchschnitt als double.
     *
     * @throws NullPointerException wenn das übergebene Array null ist.
     */
    double durchschnitt(int[] zahlen);

    /**
     * Gibt wahr zurück, wenn alle übergebenen Worte in der Collection mit dem
     * gleichen Zeichen aufhören. Dabei ist Groß- und Kleinschreibung
     * zu beachten, ebenso wie Zeichen, die keine Buchstaben sind.
     * <p>
     * Beispiele: <br/>
     * {@code [ "Hamburg", "Berg", "Bug" ]} würde true ergeben<br/>
     * {@code [ "Weshalb", "Deshalb", "Darum" ]} würde falsch ergeben.
     * <p>
     * Wenn alle Wörter leer sind oder nur ein Wort übergeben wurde,
     * soll wahr zurück gegeben werden.
     * <p>
     * Hinweis: Sie können davon ausgehen, dass die Wörter nur druckbare Zeichen enthalten und niemals null sind.
     * Auch sind die übergebenen Wörter niemals leer.
     *
     * @return true, wenn alle Worte mit dem gleichen Zeichen aufhören.
     *
     * @throws NullPointerException Wenn eines der Wörter oder die ganze Collection null sind.
     *  (Sprich: Sie müssen sich im Grunde nicht darum kümmern)
     */
    boolean gleichesEndzeichen(Collection<String> woerter);

    /**
     * Liefert die umgedrehte Zeichenkette.
     * <p>
     * <b>Die Implementierung ist zwingend rekursiv vorzunehmen! Bei nicht-rekursiver Implementierung
     * werden keinerlei Punkte vergeben!</b>
     * <p>
     * Beispiel: "alucard" liefert "dracula".
     *
     * @param s ein beliebiger String ungleich null
     * @return den umgedrehten String, möglicherweise auch einen leeren String
     *
     * @throws NullPointerException wenn der übergebende Text null ist.
     *      (Sprich: Sie müssen sich im Grunde nicht darum kümmern)
     */
    public String umgedrehtRekursiv(String s);

    /**
     * Gibt die Anzahl der (deutschen) Umlaute in dem übergeben Text
     * zurück, Groß- und Kleinschreibung sollen ignoriert werden.
     * Dabei sollen sowohl Umlaute erkannt werden, die mit
     * Trema geschrieben werden verwenden (ä, ö, ü),
     * als auch mit nachgestelltem e (ae, oe, ue).
     * <p>
     * Beispiele: "Möhre" ergibt 1 zurück, "Aecht aetzend" 2 und "Hallo Welt" 0.
     * <p>
     * Auch gemischte Texte wie "Aecht ätzend" sind möglich.
     *
     * @return Anzahl der gefundenen Umlaute
     *
     * @throws NullPointerException wenn der übergebende Text null ist.
     *      (Sprich: Sie müssen sich im Grunde nicht darum kümmern)
     */
    int zaehleUmlaute(String text);

    /**
     * Zerlegt den übergebenen Text anhand von Leerzeichen und gibt die Wörter
     * in umgekehrter Reihenfolge zurück.
     * <p>
     * Beispiel:<br/>
     *      {@code reverseSplit("Hallo und guten Tag!")}<br/>
     *      liefert eine Liste mit <br/>
     *      {@code "Tag!", "guten", "und", "Hallo"}<br/>
     *      zurück.
     * <p>
     * Wenn der übergebende Text null oder leer ist oder nur aus Leerzeichen besteht, soll
     * eine leere Liste zurückgeliefert werden.
     * <p>
     * Die zurückgegebene Liste darf keine leeren Strings enthalten. Wenn zwei oder
     * mehr Leerzeichen gefunden werden, sind diese wie ein Leerzeichen zu behandeln.
     * D.h. {@code "Hallo Welt"} und {@code " Hallo    Welt "} geben beide eine Liste mit "Welt" und "Hallo"
     * zurück.
     *
     * <p><b>Achtung:</b> {@code String.split()} hat eine leicht andere Semantik. Falls diese Methode verwendet
     * wird, muss das angepasst werden. Oder man zerlegt den String manuell (was vermutlich die
     * Erstellung der umgekehrte Reihenfolge erleichtert).
     *
     * @param text der gesamte Text, kann null oder leer sein
     * @return Liste mit Wörtern, evtl. leere Liste
     */
    List<String> reverseSplit(String text);
}
