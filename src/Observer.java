/**
 * Interface representing an observer.
 */
public interface Observer {
    /**
     * Update the observer with the given table.
     * @param table The table received from the subject.
     */
    void update(String table);
}
