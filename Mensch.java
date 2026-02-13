import java.util.Scanner;
/**
 * Die Klasse {@code Mensch} repräsentiert einen menschlichen Spieler.
 * <p>
 * Die geratene Zahl soll durch eine Benutzereingabe bestimmt werden,
 * z. B. über die Konsole.
 *
 * @author ---
 */
class Mensch extends Spieler {

    /**
     * Fordert den menschlichen Spieler auf, eine Zahl zu raten.
     *
     * @return die vom Benutzer eingegebene Zahl
     * @author Ole
     */
    @Override
    public int raten() {
        System.out.print("Bitte gib eine Zahl ein: ");
        return new java.util.Scanner(System.in).nextInt();
    }
}
