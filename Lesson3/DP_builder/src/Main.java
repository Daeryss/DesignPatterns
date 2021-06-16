/*
к сожалению уже выбился из сроков, но так и не смог победить метод build(),
который должен возвращать стрингу, возвращается экземплар класса
 */


public class Main {
    public static void main(String[] args) {
        var mail = new FluentEmailBuilder()
                .subject("Fluent builder")
                .sender("ilyas_miftakhov@mail.ru")
                .to("ilya_sukhachev@ya.ru")
                .to("ilya_sukhachev@ya.ru")
                .copyTo("dp_group@i-teco.ru")
                .content("important content")
                .build();

        System.out.println(mail);


        var formal = new FormalEmailBuilder()
                .subject("Formal builder")
                .sender("ilias@miftakhov.ya")
                .to("ilya@sukhachev.ru")
                .to("another@recipient.ru")
                //checking for repetition
                .to("another@recipient.ru")
                .copyTo("dp@i-teco.ru")
                .copyTo("dp@i-teco.ru")
                .content("implementing formal builder")
                .addSignature("With best regards Ilyas Miftakhov")
                .build();
    }

    private static void runFormalEmailBuilder(){
        var mail = new FormalEmailBuilder()
                .subject("subject")
                .sender("from me")
                .to("to you")
                .copyTo("wenonefwe")
                .content("important content")
                .build();
        System.out.println(mail);
    }

    private static void runFluentEmailBuilder(){
        var mail = new FluentEmailBuilder()
                .subject("subject")
                .sender("from me")
                .to("to you")
                .copyTo("wenonefwe")
                .content("important content")
                .build();

        System.out.println(mail);
    }
}
