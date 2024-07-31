public class Logger {
    // Correct the variable name to instance
    private static Logger instance;
    
    // Private constructor to prevent instantiation
    private Logger() {
    }

    // Public method to provide access to the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        // Correct the typo in println
        System.out.println(message);
    }
}
