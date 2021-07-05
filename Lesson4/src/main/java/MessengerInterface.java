public interface MessengerInterface {

    void sendMessage(String sender, String recipient, String message);

    void getMessage(String sender, String recipient, String message);
}
