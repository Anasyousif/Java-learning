import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
         return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
         return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
         boolean iHaveSomethingTheyDont = myCollection.stream()
        .anyMatch(card -> !theirCollection.contains(card));
    
    boolean theyHaveSomethingIDont = theirCollection.stream()
        .anyMatch(card -> !myCollection.contains(card));
    
    return iHaveSomethingTheyDont && theyHaveSomethingIDont;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
         if (collections.isEmpty()) {
        return Set.of(); // No collections → no common cards
    }

    Set<String> common = new HashSet<>(collections.get(0)); // Start with the first collection
    for (Set<String> collection : collections) {
        common.retainAll(collection); // Keep only cards also in the next collection
    }
    return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
    for (Set<String> collection : collections) {
        all.addAll(collection); // Add everything from each collection
    }
    return all;
    }
}
