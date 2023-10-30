public interface BeginnerCoding {

    /**
     * Erhält einen Rateversuch als Integer.
     * Gibt wahr + die Anzahl der Versuche zurück, wenn die richtige Zahl erraten wurde.
     * Falls der Versuch falsch war, gibt er zurück, ob die Zahl zu hoch oder zu niedrig war.
     * Nutze für diese Methode das Feld "zufallsZahl" zum Vergleichen.
     * @param Rateversuch
     * @return bei richtigem Ergebnis: "Die Zahl ist richtig. Du hast (anzahl versuche) Versuche gebraucht."
     * bei zu niedrigem Ergebnis: "Die Zahl ist zu niedrig."
     * bei zu hohem Ergebnis: "Die Zahl ist zu hoch."
     */
    String istEsDieseZahl(int Rateversuch);

    /**
     * Kontrolliert, ob eine Zahl gerade oder ungerade ist.
     * @param zahl
     * @return true bei ungeraden Zahlen, sonst false
     */
    boolean istUngerade(int zahl);

    /**
     * addiert zwei gegebene Integer Werte und quadriert diese anschließend.
     * @param num1
     * @param num2
     * @return das Ergebnis der Rechenoperation
     */
    int addAndSquareIntegers(int num1, int num2);

    /**
     * You are given a non-negative floating point number rounded to two decimal places celsius,
     * that denotes the temperature in Celsius.
     * You should convert Celsius into Fahrenheit and
     * return it as an double.
     * Fahrenheit = Celsius * 1.80 + 32.00
     * @param celsius
     * @return the double
     */
    double convertTemperatur(double celsius);
}
