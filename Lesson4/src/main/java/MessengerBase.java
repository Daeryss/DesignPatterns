public class MessengerBase implements MessengerInterface {

    protected MessengerInterface messenger;

    public MessengerBase(MessengerInterface messenger) {
        this.messenger = messenger;
    }

    public MessengerBase() {
    }

    @Override
    public void sendMessage(String sender, String recipient, String message) {
        System.out.println(String.format("You have sent message to %s:\n" +
                "%s", recipient, message));
    }

    @Override
    public void getMessage(String sender, String recipient, String message) {
        System.out.println(String.format("You have got a message from %s:\n" +
                "%s", recipient, message));
    }
}
