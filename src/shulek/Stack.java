package shulek;

import java.util.ArrayList;

/**
 * Diese Klasse realisiert einen generischen Stack. Dazu wird ein Datentyp als Klassenparameter uebernommen, um den Datentyp des Stacks zu setzen.
 * @param <Array> Der Datentyp der Elemente welcher der Stack speichern soll
 * @author Sebastian Hulek
 * @version 2020-12-18
 */

public class Stack <Array> {
    private ArrayList<Array> stack;
    private int latestIndex;
    private int length;

    /**
     * Konstruktor, welcher die Attribute auf Startwerte setzt und die maximale groesse uebernimmt und setzt
     * @param length Die laenge, welche der Stack haben soll
     */
    public Stack(int length) {
        this.stack = new ArrayList<Array>();
        this.latestIndex = -1;
        this.length = length;
    }

    /**
     * Diese Methode loescht das zuletzt hinzugefuegte Element und gibt diese zuvor zurueck. Wenn der Stack leer ist wird eine Exception geworfen
     * @return Das Element, welches zuletzt gespeichert wurde
     * @throws StackEmptyException Wird geworden, wenn der Stack leer ist
     */
    public Array pop() throws StackEmptyException {
        if(latestIndex<0) {
            throw new StackEmptyException();
        } else {
            this.latestIndex--;
            return this.stack.remove(latestIndex + 1);
        }
    }

    /**
     * Diese Methode uebernimmt ein Element und fuegt dieses dem Stack hinzu. Wenn der Stack schon voll ist wird eine Exception geworfen
     * @param object Das Element welches hinzugefuegt werden soll
     * @throws StackFullException Wird geworfen, wenn der Stack voll ist aber noch ein Element hinzugefuegt werden soll
     */
    public void push (Array object) throws StackFullException{
        if(this.latestIndex == this.length-1) {
            throw new StackFullException();
        } else {
            this.latestIndex++;
            this.stack.add(this.latestIndex,object);
        }
    }

    /**
     * Diese Methode gibt das zuletzt hinzugefuegte Element zurueck. Es wird eine Exception geworden, wenn der Stack leer ist
     * @return Das zuletzt hinzugefuegte Element
     * @throws StackEmptyException Wird geworden, wenn der Stack leer ist
     */
    public Array peek() throws StackEmptyException{
        if(this.latestIndex<0) {
            throw new StackEmptyException();
        }
        return this.stack.get(this.latestIndex);
    }

    /**
     * Diese Methode gibt eine Liste der Elemente zurueck.
     * @return Die Liste in String-Form. Wenn die Liste leer ist, wird ein leerer String zurueckgegeben.
     */
    public String list() {
        String list = this.stack.toString();
        return list.substring(1, list.length()-1);
    }
}
