public class Fighterattack {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    // Determine which fighter is which based on the firstAttacker's name
    Fighter a = fighter1.name.equals(firstAttacker) ? fighter1 : fighter2;
    Fighter b = a == fighter1 ? fighter2 : fighter1;

    // Calculate the number of hits each fighter needs to defeat the other.
    // Use Math.ceil to round up, as even a sliver of remaining health requires one more attack.
    // The number of attacks needed is (target_health + attacker_damage - 1) / attacker_damage
    // for integer division, or Math.ceil((double) target_health / attacker_damage)

    // Attacks 'a' needs to defeat 'b'
    int attacksNeededByA = (int) Math.ceil((double) b.health / a.damagePerAttack);
    
    // Attacks 'b' needs to defeat 'a'
    int attacksNeededByB = (int) Math.ceil((double) a.health / b.damagePerAttack);

    // The fight is a race to zero health.
    // Since 'a' attacks first, if 'a' can defeat 'b' in the same or fewer attacks
    // than 'b' needs to defeat 'a', then 'a' wins.
    // a wins if: attacksNeededByA <= attacksNeededByB
    
    if (attacksNeededByA <= attacksNeededByB) {
      return a.name;
    } else {
      return b.name;
    }
  }
}
