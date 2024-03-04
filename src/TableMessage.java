import java.util.ArrayList;
import java.util.List;
/**
 * Concrete subject class representing a text message.
 */
public class TableMessage implements Subject {
    private String message;
    private List<Observer> observers;

    /**
     * Constructs a new TextMessage object.
     */
    public TableMessage() {
        this.observers = new ArrayList<>();
    }
    /**
     * Set the text message and notify observers.
     * @param message The new message to be set.
     */
    public void setMessage(String message) {
        this.message = message;
        notifyObservers(message);
    }
    /**
     * Get the current text message.
     * @return The current message.
     */
    public String getMessage() {
        return message;
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}