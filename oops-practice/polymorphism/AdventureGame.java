class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println(characterName + " attacks.");
    }
}

class Warrior extends GameCharacter {
    Warrior(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " attacks with a Sword.");
    }
}

class Mage extends GameCharacter {
    Mage(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " casts a Fireball.");
    }
}

class Archer extends GameCharacter {
    Archer(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName + " shoots an Arrow.");
    }
}

public class AdventureGame {
    public static void startBattle(GameCharacter[] characters) {
        int warriors = 0, mages = 0, archers = 0;

        for (GameCharacter c : characters) {
            c.performAttack();

            if (c instanceof Warrior)
                warriors++;
            else if (c instanceof Mage)
                mages++;
            else if (c instanceof Archer)
                archers++;
        }

        System.out.println("\nBattle Summary");
        System.out.println("Warriors: " + warriors);
        System.out.println("Mages: " + mages);
        System.out.println("Archers: " + archers);
    }

    public static void main(String[] args) {
        GameCharacter[] characters = {
            new Warrior("Arjun"),
            new Mage("Merlin"),
            new Archer("Robin"),
            new Warrior("Leon"),
            new Mage("Gandalf")
        };

        startBattle(characters);
    }
}