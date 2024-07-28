package lesson11;

//mainはbufferdReader?そもそもつくってない？→Javaでよく使われる機能として用意されているものなので自分で用意しなくても使用できる
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import com.example.Child;

public class TextReader {
	private String path;

	private Child buzz;

	private static Logger logger = Logger.getLogger(TextReader.class.getName());

	//publicのあとはあってる
	//	public enum Mark {
	//		START, END
	//	};

	private TextReader(String path) {
		this.path = path;
	}

	//Listのあとの＜＞の中？→Listに入れたい値の型,今回は数字が入ったファイルなのでIntegerと③
	private void execute() {
		List<Integer> valueList = new ObjectList<>();
		//GenericSample<String> sample = new GenericSample<>();
		//tryのあとの（）は何をいれる？→finalyで.closeをしているインスタンスを作成している処理を入れる
		try (FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr)) {
			String line = null;
			while ((line = br.readLine()) != null) {
				valueList.add(Integer.parseInt(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		//		int size = valueList.size();
		//		// [2, 3, 4, 1, 6, 8, 9, 8]
		//		//  リストの中身を表示
		//		for (int i = 0; i < size; i++) {
		//			System.out.println(valueList.get(i));
		//			// 2 3 4 1 6 8
		//		}

		//何をくりかえす？
		for (Integer num : valueList) {
			System.out.println(num);
		}
	}
	//	
	//	public static void aaa(int num, int num2, int num3) {
	//		
	//	}
	//	
	//	public static void aaa(int... num) {
	//		
	//	}

	// 
	public static void main(String... args) {
		logger.info(EnumMain.START.name());
		new TextReader("/Users/sugiyama/workspace/eclipse/java_work/src/lesson11/test.text").execute();
		logger.info(EnumMain.END.name());
	}

}
