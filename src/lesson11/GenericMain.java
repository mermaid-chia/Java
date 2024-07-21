package lesson11;

public class GenericMain {
    public static void main(String[] args) {
        String resultValue = SampleClass.methodSample("sample");
        System.out.println(resultValue);

        int resultInt = SampleClass.methodSample(10);
        System.out.println(resultInt);
    }
}