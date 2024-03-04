/**
 * Interface representing an observer.
 */
public interface Observer {
    /**
     * Update the observer with the given message.
     * @param message The message received from the subject.
     */
    void update(String message);
}
