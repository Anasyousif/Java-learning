public class LogLine {
    private final String log;
    private final LogLevel level;
    private final String message;

    public LogLine(String logLine) {
        if (logLine == null || logLine.length() < 4) {
            throw new IllegalArgumentException("Log line is too short or null");
        }

        this.log = logLine;

        // Extract the level code from the brackets
        String levelCode = logLine.substring(1, 4);

        // Set level based on code
        switch (levelCode) {
            case "TRC":
                this.level = LogLevel.TRACE;
                break;
            case "DBG":
                this.level = LogLevel.DEBUG;
                break;
            case "INF":
                this.level = LogLevel.INFO;
                break;
            case "WRN":
                this.level = LogLevel.WARNING;
                break;
            case "ERR":
                this.level = LogLevel.ERROR;
                break;
            case "FTL":
                this.level = LogLevel.FATAL;
                break;
            default:
                this.level = LogLevel.UNKNOWN;
                break;
        }

        // Extract message after the colon
        int colonIndex = logLine.indexOf(':');
        if (colonIndex != -1) {
            this.message = logLine.substring(colonIndex + 1).trim();
        } else {
            this.message = "";
        }
    }

    public LogLevel getLogLevel() {
        return level;
    }

    public String getOutputForShortLog() {
        int encodedLevel = encodeLogLevel(this.level);
        return encodedLevel + ":" + this.message;
    }

    private int encodeLogLevel(LogLevel level) {
        switch (level) {
            case TRACE:
                return 1;
            case DEBUG:
                return 2;
            case INFO:
                return 4;
            case WARNING:
                return 5;
            case ERROR:
                return 6;
            case FATAL:
                return 42;
            default:
                return 0;
        }
    }
}
