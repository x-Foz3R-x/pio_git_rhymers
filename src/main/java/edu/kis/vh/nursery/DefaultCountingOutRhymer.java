package edu.kis.vh.nursery;


/**
 * Klasa implementująca domyślną wyliczankę opartą na tablicy.
 * Działa na zasadzie prostej struktury stosu, przechowując liczby całkowite.
 */
public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int EMPTY = -1;

    private final int[] numbers = new int[SIZE];

    private int total = EMPTY;

    /**
     * Zwraca aktualny wskaźnik na ostatnio dodany element.
     * @return wartość wskaźnika total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje nową liczbę do wyliczanki, jeśli nie jest ona pełna.
     * @param in wartość całkowita do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta.
     * @return true, jeśli pusta, w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza, czy wyliczanka jest pełna.
     * @return true, jeśli pełna, w przeciwnym razie false
     */
    public boolean isFull() {
        return total == SIZE - 1;
    }

    /**
     * Zwraca wartość ostatnio dodanego elementu bez jego usuwania.
     * @return ostatnio dodana liczba lub wartość domyślna w przypadku pustej wyliczanki
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    /**
     * Zwraca wartość ostatnio dodanego elementu i usuwa go z wyliczanki.
     * @return pobrana liczba lub wartość domyślna w przypadku pustej wyliczanki
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}