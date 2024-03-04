/**
 * Main class to demonstrate the usage of the observer pattern with text messages.
 */
public class Main {
    /**
     * The main method.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        TableMessage tableMessage = new TableMessage();
        TriggerObserver triggerObserver = new TriggerObserver();
        // Attach observer to the subject
        tableMessage.addObserver(triggerObserver);
        tableMessage.setMessage("Hello, World!");
        tableMessage.setMessage("This is a new message.");
        // Detach observer from the subject
        tableMessage.removeObserver(triggerObserver);
        // Set another message (without triggering observer)
        tableMessage.setMessage("Observer is detached.");
    }
}