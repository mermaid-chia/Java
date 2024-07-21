package lesson11;

public class Varargs {
    static public void methodSample(String... args) {
        System.out.println("メソッド引数の数は" + args.length);
        for (String value : args) {
            System.out.println(value);
        }
    }
}