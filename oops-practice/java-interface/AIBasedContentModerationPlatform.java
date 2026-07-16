interface TextModeration {
    boolean checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"hate", "abuse", "badword"};
        for (String word : restrictedWords) {
            if (post.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}

interface SpamDetection {
    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam content is prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public boolean checkOffensiveContent(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean checkSpam(String post) {
        return post.toLowerCase().contains("buy now")
                || post.toLowerCase().contains("click here");
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class AIBasedContentModerationPlatform {
    public static void main(String[] args) {

        String[] posts = {
                "Buy now and get 50% discount",
                "I hate this product",
                "Welcome to our community",
                "Click here to earn money",
                "This is a badword message"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();
        System.out.println();

        for (String post : posts) {
            if (moderator.checkSpam(post)) {
                System.out.println("\"" + post + "\" -> Spam Post");
            } else if (moderator.checkOffensiveContent(post)) {
                System.out.println("\"" + post + "\" -> Offensive Post");
            } else {
                System.out.println("\"" + post + "\" -> Valid Post");
            }
        }
    }
}