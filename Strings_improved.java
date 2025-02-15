public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":") + 2).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        String level = logLevel(logLine);  // Reuse logLevel method
        String msg = message(logLine);  // Reuse message method
        return msg + " (" + level + ")";
    }
}
