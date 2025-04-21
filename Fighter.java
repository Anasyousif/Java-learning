public  class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

 class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false; // Warriors are not vulnerable
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10; // Deal 10 damage to vulnerable fighters
        }
        return 6; // Default damage when the target is not vulnerable
    }
}
 class Wizard extends Fighter {
    private boolean spellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared; // Vulnerable unless a spell is prepared
    }

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        // Wizards deal 10 damage to Warriors, 12 if the spell is prepared
        if (!spellPrepared) {
            return 3;
        }
        // If spell is prepared, deal 12 damage to a Fighter
        return 12;
    }
}
