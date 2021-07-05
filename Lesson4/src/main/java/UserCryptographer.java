public class UserCryptographer extends MessengerBase {


    public UserCryptographer(MessengerInterface messengerInterface) {
        super(messengerInterface);
    }


    public void sendMessage(String sender, String recipient, String message){
        sender = String.format("This sender was encrypted %s", sender);
        recipient = String.format("This recipient was encrypted %s", recipient);
        System.out.println(String.format("You have sent message to %s:\n" +
                "%s", recipient, message));
    }


    public void getMessage(String sender, String recipient, String message){
        sender = String.format("This sender was encrypted %s", sender);
        recipient = String.format("This recipient was encrypted %s", recipient);
        System.out.println(String.format("You have got a message from %s:\n" +
                "%s", recipient, message));
    }

}
