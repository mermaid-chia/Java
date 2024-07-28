package lesson11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	// 2024-07-27
	// 2024/07/27
	// 2024 年 07 月 27 日
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10000);
		//foreachのあとの ->の意味は次の処理をしますということ
		stream.forEach(num -> System.out.println(currentTime() + " " + num));
		//[1, 2, 3, 4, 5]

		//		for (Integer num : [1, 2, 3, 4, 5, 6...]) {
		//			System.out.println(num);
		//		}
	}

	//  現在日付を返してくれている関数
	private static String currentTime() {
		return FORMATTER.format(LocalDateTime.now());
	}
}
