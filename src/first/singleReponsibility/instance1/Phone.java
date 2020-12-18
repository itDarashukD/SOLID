package first.singleReponsibility.instance1;

public class Phone implements IconnectionManager,IsentMessage {

    private IconnectionManager iconnectionManager;
    private IsentMessage isentMessage;

    public Phone(IconnectionManager iconnectionManager, IsentMessage isentMessage) {
        this.iconnectionManager = iconnectionManager;
        this.isentMessage = isentMessage;
    }

    @Override
    public void calling(int number) {
        iconnectionManager.calling(number);

    }

    @Override
    public void diconnecting() {
        iconnectionManager.diconnecting();

    }

    @Override
    public void sendingMessage(String message) {
        isentMessage.sendingMessage(message);

    }

    @Override
    public int ressivedMessage() {
        isentMessage.ressivedMessage();
        return 0;
    }
}

