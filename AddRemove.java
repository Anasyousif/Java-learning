public class AddRemove {

     public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> listA = new ArrayList<>();
    for (int x : a) {
      listA.add(x);
    }

    List<Integer> listB = new ArrayList<>();
    for (int x : b) {
      listB.add(x);
    }

    listA.removeAll(listB);

    int[] result = new int[listA.size()];
    for (int i = 0; i < listA.size(); i++) {
      result[i] = listA.get(i);
    }

    return result;
  }
    
}
