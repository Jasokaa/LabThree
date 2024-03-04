import java.util.ArrayList;
import java.util.List;
/**
 * Concrete subject class representing a table.
 */
public class Table implements Subject {
    private String table;
    private List<Observer> observers;

    /**
     * Constructs a new Table object.
     */
    public Table() {
        this.observers = new ArrayList<>();
    }
    /**
     * Set the table and notify observers.
     * @param table The new message to be set.
     */
    public void setTable(String table) {
        this.table = table;
        notifyObservers(table);
    }
    /**
     * Get the current table.
     * @return The current table.
     */
    public String getTable() {
        return table;
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
    public void notifyObservers(String table) {
        for (Observer observer : observers) {
            observer.update(table);
        }
    }
}