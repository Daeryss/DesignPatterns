/*
к сожалению уже выбился из сроков, но так и не смог победить метод build(),
который должен возвращать стрингу, возвращается экземплар класса
 */


public class Main {
    public static void main(String[] args) {
        runFluentEmailBuilder();
        runFormalEmailBuilder();
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
