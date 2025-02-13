public class LogLevels {
    
    public static String message(String logLine) {
     return logLine.substring(logLine.indexOf(":") + 2).trim();
    }

    public static String logLevel(String logLine) {
      return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
    String level = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    String message = logLine.substring(logLine.indexOf(":") + 1).trim();
    return message + " (" + level + ")";
}
}
