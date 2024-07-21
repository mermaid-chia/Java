package lesson11;

public class VarargsMain {
    public static void main(String[] args) {
        Varargs.methodSample();
        Varargs.methodSample("おはよう");
        Varargs.methodSample("おはよう", "こんにちは");
        Varargs.methodSample("おはよう", "こんにちは", "こんばんは");
    }
}