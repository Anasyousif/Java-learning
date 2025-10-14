public class haystack {

    public static String findNeedle(Object[] haystack) {
      
    for (int i = 0; i < haystack.length; i++) {
   
      if (haystack[i] != null && haystack[i].equals("needle")) {
  
        return "found the needle at position " + i;
      }
    }
    
    return "The needle was not found in the haystack.";
  }

}

