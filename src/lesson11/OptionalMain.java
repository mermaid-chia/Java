package lesson11;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        OptionalSample sample = new OptionalSample(null);
        Optional<String> name = sample.getName();
        System.out.println("名前の文字数は" + name.orElse("").length() + "です");
    }

}