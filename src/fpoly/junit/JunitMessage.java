package fpoly.junit;

public class JunitMessage {

    private String message;

    public JunitMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
        int divide = 1 / 0; // cố tình gây lỗi chia cho 0
    }

    public String printHiMessage() {
        message = "Hi! " + message;
        System.out.println(message);
        return message;
    }
}
