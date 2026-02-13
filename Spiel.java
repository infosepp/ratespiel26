/**
 * Die Klasse {@code Spiel} steuert den kompletten Ablauf des Spiels.
 * <p>
 * Sie verwaltet die beiden Spieler, deren Punktestände sowie den
 * aktuell aktiven Spieler. Außerdem koordiniert sie den Start
 * und den Ablauf einzelner Spielrunden.
 *
 * @author ---
 */
public class Spiel {

    /** Punktestand von Spieler 1 */
    private int punkteSpieler1;

    /** Punktestand von Spieler 2 */
    private int punkteSpieler2;

    /** Der Spieler, der aktuell an der Reihe ist */
    private Spieler aktSpieler;

    /** Referenz auf Spieler 1 */
    private Spieler spieler1;

    /** Referenz auf Spieler 2 */
    private Spieler spieler2;

    /**
     * Startet ein neues Spiel.
     * <p>
     * In dieser Methode sollen:
     * <ul>
     *   <li>die beiden Spieler initialisiert werden</li>
     *   <li>die Punktestände auf 0 gesetzt werden</li>
     *   <li>der Startspieler bestimmt werden</li>
     *   <li>mehrere Spielrunden durchgeführt werden</li>
     * </ul>
     *
     * @author Lennart
     */
    public void starteSpiel() {
        // zu implementieren
    }

    /**
     * Liefert den aktuellen Punktestand von Spieler 1.
     *
     * @return Punktestand von Spieler 1
     * @author Henning Ainödhofer
     */
    public int gibPunkteSpieler1() {
        return punkteSpieler1;
    }

    /**
     * Liefert den aktuellen Punktestand von Spieler 2.
     *
     * @return Punktestand von Spieler 2
     * @author Finia
     */
    public int gibPunkteSpieler2() {
        return punkteSpieler2;
    }

    /**
     * Führt eine einzelne Spielrunde durch.
     * <p>
     * Dabei soll:
     * <ul>
     *   <li>eine Zufallszahl erzeugt werden</li>
     *   <li>der aktuelle Spieler eine Zahl raten</li>
     *   <li>die geratenen und die Zufallszahl verglichen werden</li>
     *   <li>der Punktestand ggf. erhöht werden</li>
     * </ul>
     *
     * @author Emil
     */
    public void starteRunde() {
        // zu implementieren
    }

    /**
     * Wechselt den aktuell aktiven Spieler.
     * <p>
     * Ist momentan Spieler 1 aktiv, wird zu Spieler 2 gewechselt
     * und umgekehrt.
     *
     * @author Mika
     */
    public void wechsleSpieler() {
        // zu implementieren
    }

    /**
     * Erzeugt eine Zufallszahl für das Ratespiel.
     * <p>
     * Der genaue Zahlenbereich (z. B. 1 bis 10) soll im Rahmen
     * des Spiels festgelegt werden.
     *
     * @return zufällig erzeugte Zahl
     * @author Janne
     */
    public int gibZufallszahl() {
        return 0;
    }

    /**
     * Bestimmt zufällig, welcher Spieler das Spiel beginnt.
     * <p>
     * Der bestimmte Spieler wird als aktueller Spieler gespeichert.
     *
     * @author Elias
     */
    public void bestimmeStartspieler() {
        // zu implementieren
    }
}
