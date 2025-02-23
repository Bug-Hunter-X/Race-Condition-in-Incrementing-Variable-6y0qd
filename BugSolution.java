public class MyClass {
    private int x = 0;
    private final Object lock = new Object(); // Added lock object

    public void incrementX() {
        synchronized (lock) { // Synchronized block
            x++;
        }
    }

    public int getX() {
        return x;
    }
} 