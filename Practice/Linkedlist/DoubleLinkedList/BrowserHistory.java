class Page {
    String url;
    Page prev;
    Page next;

    Page(String url) {
        this.url = url;
    }
}
public class BrowserHistory {
    public static void main(String[] args) {

        Page p1 = new Page("Google");
        Page p2 = new Page("YouTube");
        Page p3 = new Page("ChatGPT");

        p1.next = p2;
        p2.prev = p1;

        p2.next = p3;
        p3.prev = p2;

        Page temp = p1;

        while (temp != null) {
            System.out.print(temp.url + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}