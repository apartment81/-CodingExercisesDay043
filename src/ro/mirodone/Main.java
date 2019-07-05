package ro.mirodone;

public class Main {

    public static void main(String[] args) {

    PlayPass playPass = new PlayPass();
        System.out.println(playPass.playPass("ABCD 1234", 1));

        PlayPass2 playPass2 = new PlayPass2();

        System.out.println(playPass2.playPass("ABCD 1234", 1));


    }
}
