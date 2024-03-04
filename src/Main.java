/**
 * Main class to demonstrate the usage of the observer pattern with table.
 */
public class Main {
    /**
     * The main method.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Table tableMessage = new Table();
        TriggerObserver triggerObserver = new TriggerObserver();
        // Attach observer to the subject
        tableMessage.addObserver(triggerObserver);
        tableMessage.setTable("Table");
        tableMessage.setTable("This is a new table");
        // Detach observer from the subject
        tableMessage.removeObserver(triggerObserver);
        // Set another message (without triggering observer)
        tableMessage.setTable("Observer is detached.");
    }
}