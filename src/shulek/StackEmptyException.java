package shulek;

/**
 * Diese Klasse ist eine Exception, welche von der Stackklasse verwendet wird, wenn der Stack leer ist aber peek oder pop ausgefuehrt wird
 * @author Sebastian Hulek
 * @version 2020-12-18
 */
public class StackEmptyException extends Exception{
    /**
     * Dieser Konstruktor setzt den Text, welcher im Stacktrace geschrieben wird
     */
    public StackEmptyException() {
        super("Der generische Stack ist leer!");
    }
}
