package shulek;

/**
 * Diese Klasse ist eine Exception, welche von der Stackklasse verwendet wird, wenn der Stack voll ist aber push ausgefuehrt wird
 * @author Sebastian Hulek
 * @version 2020-12-18
 */
public class StackFullException extends Exception{
    /**
     * Dieser Konstruktor setzt den Text, welcher im Stacktrace geschrieben wird
     */
    public StackFullException() {
        super("Der generische Stack ist voll!");
    }
}