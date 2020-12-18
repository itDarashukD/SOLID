package first.singleReponsibility.instance1;

public class MessageManager implements IsentMessage{


    @Override
    public void sendingMessage(String message) {
        System.out.println("message sending");
    }

    @Override
    public int ressivedMessage() {
        System.out.println("message was received");
        return 0;
    }
}
