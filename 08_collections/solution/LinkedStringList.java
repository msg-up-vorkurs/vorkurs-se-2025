package solution;

public class LinkedStringList {
    private LinkedStringElement first;

    public LinkedStringList(String firstValue) {
        this.first = new LinkedStringElement(firstValue);
    }

    // TODO Aufgabe 2: Füge ein neues LinkedListElement an den Beginn der Liste ein
    void add(String value) {
        LinkedStringElement element = new LinkedStringElement(value, this.first);
        this.first = element;
    }

    // TODO Aufgabe 3: Gebe alle Werte der LinkedList über die IO.println() aus
    void print() {
        LinkedStringElement current = first;
        IO.println(current.getValue());

        while (current.hasNext()) {
            current = current.getNext();
            IO.println(current.getValue());
        }
    }
}
