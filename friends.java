import java.util.ArrayList;
import java.util.List;

public class friends {
    public static List<String> friend(List<String> x){
    List<String> friends = new ArrayList<>();
    for (String name : x) {
      if (name.length() == 4) {
        friends.add(name);
      }
    }
    return friends;
  }
    
}
