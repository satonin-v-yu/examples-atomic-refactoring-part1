package demo1_if_split;

public class Before {
    public void logMessage(String prefix, String name, int logLevel, Throwable exception) {
        if (prefix != null) {
            doLog(logLevel, prefix + ": " + name, exception.getMessage(), exception.getCause(), exception
                    .getStackTrace());
        } else {
            doLog(logLevel, name, exception.getMessage(), exception.getCause(), exception.getStackTrace());
        }
    }

    private void doLog(int logLevel, String name, String message, Throwable cause, StackTraceElement[] stackTrace) {
        // Do Logging
    }
}
