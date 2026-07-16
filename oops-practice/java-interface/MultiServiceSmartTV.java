interface StreamingService {
    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    String[] movies = {"Avengers", "Inception", "Interstellar"};
    String[] games = {"FIFA", "Minecraft", "GTA V"};

    public void streamMovie() {
        System.out.println("Streaming movies...");
    }

    public void playGame() {
        System.out.println("Playing games...");
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public void displayContent() {
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nAvailable Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}

public class MultiServiceSmartTV {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();
        tv.streamMovie();
        tv.playGame();
        tv.displayContent();
    }
}
