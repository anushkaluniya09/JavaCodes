package defaultconstructor.default11;

public class Message {
    String sender;
    String content;

    Message() {
        sender = "Unknown";
        content = "Empty Message";
    }

    void show() {
        System.out.println(sender + ": " + content);
    }
}
