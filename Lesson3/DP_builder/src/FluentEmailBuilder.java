import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FluentEmailBuilder {
    public SubjectBuilder subject(String subject){
        return new SubjectBuilder(subject);
    }

    public static class SubjectBuilder  {
        private String subject;

        public SubjectBuilder(String subject) {
            this.subject = subject;
        }

        public SenderBuilder sender(String sender) {
            return new SenderBuilder(subject, sender);
        }
    }

    public static class SenderBuilder {
        private String subject;
        private String sender;

        public SenderBuilder(String subject, String sender) {
            this.subject = subject;
            this.sender = sender;
        }


        public RecipientBuilder to(String recipient) {
            return new RecipientBuilder(subject, sender, recipient);
        }

        public RecipientBuilder toAll(ArrayList<String> recipients) {
            return new RecipientBuilder(subject, sender, recipients);
        }
    }

    public static class RecipientBuilder {
        private String subject;
        private String sender;
        private ArrayList<String> recipient = new ArrayList<>();


        public RecipientBuilder(String subject, String sender, ArrayList<String> recipient) {
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

        public RecipientBuilder toAll(ArrayList<String> recipients) {
            recipient.addAll(recipients);
            return new RecipientBuilder(subject, sender, recipient);
        }

        public CopyToBuilder copyTo(String copyTo) {
            return new CopyToBuilder(subject, sender, recipient, copyTo);
        }

        public CopyToBuilder copyToAll(ArrayList<String> copyToAll) {
            return new CopyToBuilder(subject, sender, recipient, copyToAll);
        }
    }

    public static class CopyToBuilder {
        private String subject;
        private String sender;
        private ArrayList<String>  recipient = new ArrayList<>();
        private ArrayList<String>  copyTo = new ArrayList<>();

        public CopyToBuilder(String subject, String sender, ArrayList<String>  recipient, String copyTo) {
            this.subject = subject;
            this.sender = sender;
            this.recipient = recipient;
            this.copyTo.add(copyTo);
        }

        public CopyToBuilder(String subject, String sender, ArrayList<String>  recipient, ArrayList<String>  copyTo) {
            this.subject = subject;
            this.sender = sender;
            this.recipient = recipient;
            this.copyTo = copyTo;
        }


        public CopyToBuilder copyTo(String copy) {
            copyTo.add(copy);
            return new CopyToBuilder(subject, sender, recipient, copyTo);
        }

        public CopyToBuilder copyToAll(ArrayList<String> copyToAll) {
            copyTo.addAll(copyToAll);
            return new CopyToBuilder(subject, sender, recipient, copyTo);
        }

        public ContentBuilder content(String content) {
            return new ContentBuilder(subject, sender, recipient, copyTo, content);
        }
    }

    public static class ContentBuilder {
        private String subject;
        private String sender;
        private ArrayList<String>  recipient = new ArrayList<>();
        private ArrayList<String> copyTo = new ArrayList<>();
        private String content;
        private String signature = "With best Regards, Sender";

        public ContentBuilder(String subject, String sender, ArrayList<String>  recipient, ArrayList<String>  copyTo, String content) {
            this.subject = subject;
            this.sender = sender;
            this.recipient = recipient;
            this.copyTo = copyTo;
            this.content = content;
        }

        public ContentBuilder(String subject, String sender, ArrayList<String> recipient, ArrayList<String> copyTo, String content, String signature) {
            this.subject = subject;
            this.sender = sender;
            this.recipient = recipient;
            this.copyTo = copyTo;
            this.content = content;
            this.signature = signature;
        }

        public ContentBuilder addSignature(String signature) {
            this.signature = signature;
            return new ContentBuilder(subject, sender, recipient, copyTo, content, signature);
        }


        public String build() {
            return "ContentBuilder{" +
                    "subject='" + subject + '\'' +
                    ", sender='" + sender + '\'' +
                    ", recipient=" + recipient +
                    ", copyTo=" + copyTo +
                    ", content='" + content + '\'' +
                    ", signature='" + signature + '\'' +
                    '}';
        }
    }

    public static class FinalBuilder  {
        private String subject;
        private String sender;
        private ArrayList<String> recipient = new ArrayList<>();
        private ArrayList<String> copyTo = new ArrayList<>();
        private String content;

        public FinalBuilder(String subject, String sender, ArrayList<String>  recipient, ArrayList<String>  copyTo, String content) {
            this.subject = subject;
            this.sender = sender;
            this.recipient.addAll(recipient);
            this.copyTo.addAll(copyTo);
            this.content = content;
        }


        public String build() {
            recipient = checkDouble(recipient);
            copyTo = checkDouble(copyTo);

            return "FinalBuilder{" +
                    "subject='" + subject + '\'' +
                    ", sender='" + sender + '\'' +
                    ", recipient=" + recipient +
                    ", copyTo=" + copyTo +
                    ", content='" + content + '\'' +
                    '}';
        }

        public ArrayList<String> checkDouble(ArrayList arrayList){
            Set<String> set = new TreeSet<>();
            set.addAll(arrayList);
            ArrayList<String> newArray = new ArrayList<>();
            newArray.addAll(set);

            return newArray;
        }

    }
}
