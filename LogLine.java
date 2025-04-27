public class LogLine {
    private String log;

    public LogLine(String logLine) {
 if (log == null || log.length() < 4) {
            throw new IllegalArgumentException("Log line is too short or null");
        }
        
        // Extract the log level from the square brackets (e.g., "[TRC]")
        String levelCode = log.substring(1, 4);

        // Map the extracted code to the appropriate enum
        switch (levelCode) {
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF": return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default: throw new IllegalArgumentException("Unknown log level: " + levelCode);
        }
    }
    public String getOutputForShortLog() {
        // Here we could just return the message after the log level (e.g., "File deleted")
        int colonIndex = log.indexOf(':');
        if (colonIndex != -1) {
            return log.substring(colonIndex + 2); // Skip the space after ":"
        }
        return log; // If no colon found, return the whole log
    }
}
