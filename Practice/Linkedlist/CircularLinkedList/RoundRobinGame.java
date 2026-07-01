class Player {
    String name;
    Player next;

    Player(String name) {
        this.name = name;
    }
}

public class RoundRobinGame {
    public static void main(String[] args) {

        Player p1 = new Player("Player A");
        Player p2 = new Player("Player B");
        Player p3 = new Player("Player C");

        p1.next = p2;
        p2.next = p3;
        p3.next = p1;

        Player temp = p1;

        for (int i = 0; i < 6; i++) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
    }
}