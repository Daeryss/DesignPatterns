public class Main {
    public static void main(String[] args) {
        MessengerInterface messenger = new MessengerBase();

        messenger = new MessengerBase();
        output(messenger);
        
        messenger = new MessageCryptographer(messenger);
        output(messenger);

        messenger = new UserCryptographer(messenger);
        output(messenger);

    }

    private static void output(MessengerInterface messenger) {
        messenger.getMessage("Ilyas Miftakhov", "I-teco", "Message");
        messenger.sendMessage("Ilyas Miftakhov", "I-teco", "Message");
        System.out.println();
    }
}
