public class MessageDecoratorBuilder {
    private MessengerInterface messenger;

    public MessageDecoratorBuilder(MessengerInterface messenger) {
        this.messenger = messenger;
    }

    public MessageDecoratorBuilder userEncrypt() {
        messenger = new UserCryptographer(messenger);
        return this;
    }

    public MessageDecoratorBuilder messageEncrypt() {
        messenger = new MessageCryptographer(messenger);
        return this;
    }

    public MessengerInterface build() {
        return messenger;
    }
}
