import java.util.ArrayList;
import java.util.List;

public class FilterList {
    public static List<Object> filterList(final List<Object> list) {
    List<Object> resultList = new ArrayList<>(); // Create a new list to store the results

    for (Object element : list) { // Loop through each element in the input list
      // Check if the element is an instance of an Integer.
      // Use the instanceof keyword to check the object's type.
      if (element instanceof Integer) {
        resultList.add(element); // If it's an Integer, add it to our new list.
      }
    }
    return resultList; // Return the new list containing only integers.
  }
}
