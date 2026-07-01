class Coach {
    String coachName;
    Coach next;

    Coach(String coachName) {
        this.coachName = coachName;
    }
}

public class TrainCoaches {
    public static void main(String[] args) {

        Coach engine = new Coach("Engine");
        Coach c1 = new Coach("Coach 1");
        Coach c2 = new Coach("Coach 2");
        Coach c3 = new Coach("Coach 3");

        engine.next = c1;
        c1.next = c2;
        c2.next = c3;

        Coach temp = engine;

        while (temp != null) {
            System.out.print(temp.coachName + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}