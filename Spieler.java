/**
 * Die abstrakte Klasse {@code Spieler} stellt einen allgemeinen Spieler dar.
 * <p>
 * Sie dient als Oberklasse für konkrete Spielerarten wie
 * {@link Mensch} und {@link Computer}.
 *
 * @author Henning Ainödhofer
 */
abstract class Spieler {

    /**
     * Liefert eine Zahl, die der Spieler rät.
     * <p>
     * Die konkrete Implementierung hängt vom jeweiligen Spielertyp ab.
     *
     * @return die vom Spieler geratene Zahl
     * @author ---
     */
    public abstract int raten();
}
