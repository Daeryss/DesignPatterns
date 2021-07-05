public class MessageCryptographer extends MessengerBase {


    public MessageCryptographer(MessengerInterface messenger) {
        super(messenger);
    }

    public MessageCryptographer() {
        super();
    }

    public void sendMessage(String sender, String recipient, String message){
        message = String.format("This message have been encrypted %s", message);
        System.out.println(String.format("You have sent message to %s:\n" +
                "%s", recipient, message));
    }

    public void getMessage(String sender, String recipient, String message){
        message = String.format("This message have been encrypted %s", message);
        System.out.println(String.format("You have got a message from %s:\n" +
                "%s", recipient, message));
    }
}
