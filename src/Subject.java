/**
 * Interface representing a subject that can be observed.
 */
public interface Subject {
    /**
     * Add an observer to the subject.
     * @param observer The observer to be added.
     */
    void addObserver(Observer observer);

    /**
     * Remove an observer from the subject.
     * @param observer The observer to be removed.
     */
    void removeObserver(Observer observer);

    /**
     * Notify all observers with the given table.
     * @param table The table to be sent to observers.
     */
    void notifyObservers(String table);
}
