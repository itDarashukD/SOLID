package first.singleReponsibility.instance1;

public class App {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManager(),new MessageManager());

        phone.calling(27569);
        phone.diconnecting();
        phone.ressivedMessage();
        phone.sendingMessage("my message");



    }
}
