package shulek;

/**
 * Diese Klasse ist eine Test-Klasse fuer die Stack-Klasse. Es werden verschiedene Stacks erstellt und Tests durchgefuehrt
 * @author Sebastian Hulek
 * @version 2020-12-18
 */

public class Test {
    /**
     * Main-Methode in welcher alle Test durchgefuehrt werden.
     * @param args Kommandozeilenargumente
     * @throws StackFullException Exception
     * @throws StackEmptyException Exception
     */
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        //Es wird ein Zahlenstack mit 3 Stellen erzeugt
        System.out.println("Es wird ein Zahlenstack mit 3 Stellen erzeugt");
        Stack stack1 = new Stack<Integer>(3);
        System.out.println("");
        //Es wird mit 100, 200, 300 befuellt
        System.out.println("Es wird mit 100, 200, 300 befuellt");
        stack1.push(100);
        stack1.push(200);
        stack1.push(300);
        System.out.println("");
        //Es wir eine Liste ausgegeben
        System.out.println("Es wir eine Liste ausgegeben");
        System.out.println(stack1.list());
        System.out.println("");
        //Es wird das Oberste Element ausgegeben
        System.out.println("Es wird das Oberste Element ausgegeben");
        System.out.println(stack1.peek());
        System.out.println("");
        //Es werden alle Elemente aus dem Stack geloescht
        System.out.println("Es werden alle Elemente aus dem Stack geloescht");
        System.out.println("Element geloescht: "+stack1.pop());
        System.out.println("Element geloescht: "+stack1.pop());
        System.out.println("Element geloescht: "+stack1.pop());
        System.out.println("");
        //Es wird der Stack aufgelistet
        System.out.println("Es wird der Stack aufgelistet");
        System.out.println(stack1.list());
        System.out.println("");
        //Es wird noch ein Element geloescht, obwohl der Stack schon leer ist
        System.out.println("Es wird noch ein Element geloescht, obwohl der Stack schon leer ist");
        try{
            stack1.pop();
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }
        System.out.println("");
        //Es wird ein peek ausgefuehrt obwohl der Stack leer istw
        System.out.println("Es wird ein peek ausgefuehrt obwohl der Stack leer ist");
        try{
            stack1.peek();
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }



        System.out.println("");
        //Es wird ein Textstack mit 3 Stellen erzeugt
        System.out.println("Es wird ein Textstack mit 3 Stellen erzeugt");
        Stack stack2 = new Stack<String>(3);
        System.out.println("");
        //Der Stack wird mit "Hallo,", "Welt", "!" befuellt
        System.out.println("Der Stack wird mit \"Hallo,\", \"Welt\", \"!\" befuellt");
        stack2.push("Hallo");
        stack2.push("Welt");
        stack2.push("!");
        System.out.println("");
        //Es wir eine Liste ausgegeben
        System.out.println("Es wir eine Liste ausgegeben");
        System.out.println(stack2.list());
        System.out.println("");
        //Es wird das Oberste Element ausgegeben
        System.out.println("Es wird das Oberste Element ausgegeben");
        System.out.println(stack2.peek());
        System.out.println("");
        //Es wird ein Element hinzugefügt, obwohl der Stack schon voll ist damit wird eine StackFullException ausgeloest
        System.out.println("Es wird ein Element hinzugefügt, obwohl der Stack schon voll ist\n");

        try {
            stack2.push("Ueberfuellt");
        } catch (StackFullException e) {
            e.printStackTrace();
        }

    }


}
