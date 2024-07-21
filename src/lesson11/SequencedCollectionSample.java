package lesson11;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollectionSample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println(arrayList); // []

        // 最初の要素に 10 を追加
        arrayList.add(10);
        System.out.println(arrayList); // [10]

        // 最初の要素に 3 を追加し、以下順に後ろにずらす
        arrayList.addFirst(3);
        System.out.println(arrayList); // [3, 10]

        // 最初の要素に 50 を追加し、以下順に後ろにずらす
        arrayList.addFirst(50);
        System.out.println(arrayList); // [50, 3, 10]

        // 最後の要素に 20 を追加
        arrayList.addLast(20);
        System.out.println(arrayList); // [50, 3, 10, 20]

        // 最初の要素を取得
        System.out.println(arrayList.getFirst()); // 50

        // 再度の要素を取得
        System.out.println(arrayList.getLast()); // 20

        // 要素の順序を逆転
        List<Integer> arrayList2 = arrayList.reversed();
        System.out.println(arrayList2); // [20, 10, 3, 50]

        // 最初の要素を削除
        arrayList2.removeFirst();
        System.out.println(arrayList2); // [10, 3, 50]
    }
}