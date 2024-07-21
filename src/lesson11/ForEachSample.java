package lesson11;

import java.util.ArrayList;
import java.util.List;

public class ForEachSample {
    public static void main(String[] args) {
        List<String> arry = new ArrayList<>();
        arry.add("おはよう");
        arry.add("こんにちは");
        arry.add("こんばんは");

        for (String value : arry) {
            System.out.println(value);
        }
    }
}