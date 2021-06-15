import java.util.Set;
import java.util.TreeSet;

public class FormalEmailBuilder {
    /*
    private String subject;
    private String sender;
    private Set<String> recipient = new TreeSet<>();
    private Set<String> copyTo = new TreeSet<>();
    private String content;
     */

    public EmailBuilder subject(String subject){
        return new SubjectBuilder(subject);
    }

    private class SubjectBuilder implements EmailBuilder {
        private String subject;

        public SubjectBuilder(String subject) {
            this.subject = subject;
        }

        @Override
        public Sender sender(String sender) {
            return new SenderBuilder(subject, sender);
        }
    }

    private class SenderBuilder implements Sender {
        private String subject;
        private String sender;

        public SenderBuilder(String subject, String sender) {
            this.subject = subject;
            this.sender = sender;
        }

        @Override
        public Recipient to(String recipient) {
            return new RecipientBuilder(subject, sender, recipient);
        }

        @Override
        public Recipient toAll(Set<String> recipients) {
            return new RecipientBuilder(subject, sender, recipients);
        }
    }

    private class RecipientBuilder implements Recipient {
        private String subject;
        private String sender;
        private Set<String> recipient;

        public RecipientBuilder(String subject, String sender, Set<String> recipient) {
            this.subject = subject;
            this.sender = sender;
            this.recipient = recipient;
        }

        public RecipientBuilder(String subject, String sender, String recipient) {
            this.subject = subject;
            this.sender = sender;
            this.recipient.add(recipient);
        }

        public RecipientBuilder to(String newRecipient) {
            recipient.add(newRecipient);
            return new RecipientBuilder(subject, sender, recipient);
        }

        public RecipientBuilder toAll(Set<String> recipients) {
            recipient.addAll(recipients);
            return new RecipientBuilder(subject, sender, recipient);
        }

        @Override
        public CopyTo copyTo(String copyTo) {
            return new CopyToBuilder(subject, sender, recipient, copyTo);
        }

        @Override
        public CopyTo copyToAll(Set<String> copyToAll) {
            return new CopyToBuilder(subject, sender, recipient, copyToAll);
        }
    }

    private class CopyToBuilder implements CopyTo {
        private String subject;
        private String sender;
        private Set<String> recipient = new TreeSet<>();
        private Set<String> copyTo = new TreeSet<>();

        public CopyToBuilder(String subject, String sender, Set<String> recipient, String copyTo) {
            this.subject = subject;
            this.sender = sender;
            this.recipient = recipient;
            this.copyTo.add(copyTo);
        }

        public CopyToBuilder(String subject, String sender, Set<String> recipient, Set<String> copyTo) {
            this.subject = subject;
            this.sender = sender;
            this.recipient = recipient;
            this.copyTo = copyTo;
        }

        @Override
        public void copyTo(String copyTo) {
            this.copyTo.add(copyTo);
        }

        @Override
        public void copyToAll(Set<String> copyToAll) {
            this.copyTo.addAll(copyToAll);
        }

        @Override
        public Content content(String content) {
            return new ContentBuilder(subject, sender, recipient, copyTo, content);
        }
    }

    private class ContentBuilder implements Content {
        private String subject;
        private String sender;
        private Set<String> recipient = new TreeSet<>();
        private Set<String> copyTo = new TreeSet<>();
        private String content;
        private String signature = "With best Regards, Sender";

        public ContentBuilder(String subject, String sender, Set<String> recipient, Set<String> copyTo, String content) {
            this.subject = subject;
            this.sender = sender;
            this.recipient = recipient;
            this.copyTo = copyTo;
            this.content = content;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        @Override
        public FinalBuilderInterface build() {
            content = content + signature;
            return new FinalBuilder(subject, sender, recipient, copyTo, content);
        }
    }

    private class FinalBuilder implements FinalBuilderInterface {
        private String subject;
        private String sender;
        private Set<String> recipient = new TreeSet<>();
        private Set<String> copyTo = new TreeSet<>();
        private String content;

        public FinalBuilder(String subject, String sender, Set<String> recipient, Set<String> copyTo, String content) {
            this.subject = subject;
            this.sender = sender;
            this.recipient = recipient;
            this.copyTo = copyTo;
            this.content = content;
        }

        @Override
        public String toString() {
            return "FinalBuilder{" +
                    "subject='" + subject + '\'' +
                    ", sender='" + sender + '\'' +
                    ", recipient=" + recipient.toString() +
                    ", copyTo=" + copyTo.toString() +
                    ", content='" + content + '\'' +
                    '}';
        }

        @Override
        public String build() {
            return "FinalBuilder{" +
                    "subject='" + subject + '\'' +
                    ", sender='" + sender + '\'' +
                    ", recipient=" + recipient +
                    ", copyTo=" + copyTo +
                    ", content='" + content + '\'' +
                    '}';
        }
    }

    public interface EmailBuilder {
        Sender sender(String sender);
    }

    public interface Sender {
        Recipient to(String recipient);

        Recipient toAll(Set<String> recipient);
    }

    public interface Recipient {
        CopyTo copyTo(String copyTo);

        CopyTo copyToAll(Set<String> copyToAll);
    }

    public interface CopyTo {
        void copyTo(String copyTo);

        void copyToAll(Set<String> copyToAll);

        Content content(String content);
    }

    public interface Content {
        FinalBuilderInterface build();
    }

    public interface FinalBuilderInterface {
        String build();
    }
}
