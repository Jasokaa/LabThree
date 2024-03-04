/**
 * Concrete observer class representing a trigger mechanism for text messages.
 */
public class TriggerObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Trigger mechanism activated for message: " + message);
    }
}
