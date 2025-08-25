import java.util.*;

public class LineNumbering {
  /**
   * Adds line numbers to a list of strings.
   *
   * @param lines The list of strings to be numbered.
   * @return A new list of strings with each line prepended by its number.
   * The numbering starts at 1. The format is "n: string".
   */
  public static List<String> number(List<String> lines) {
    // If the input list is null or empty, return an empty list.
    if (lines == null || lines.isEmpty()) {
      return new ArrayList<>();
    }

    // Create a new list to hold the numbered lines.
    List<String> numberedLines = new ArrayList<>();
    
    // Loop through the input list.
    // The line number (lineNumber) starts at 1, while the loop index (i) starts at 0.
    for (int i = 0; i < lines.size(); i++) {
      int lineNumber = i + 1;
      String originalLine = lines.get(i);
      
      // Format the new string with the line number, a colon, a space, and the original line.
      String numberedLine = lineNumber + ": " + originalLine;
      
      // Add the new numbered line to our list.
      numberedLines.add(numberedLine);
    }
    
    // Return the completed list.
    return numberedLines;
  }
}
