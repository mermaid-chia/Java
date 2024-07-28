package lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TextReader1 {
	private String path;

	private static Logger logger = Logger.getLogger(TextReader.class.getName());

	private static final String START = "START";
	private static final String END = "END";

	private TextReader1(String path) {
		this.path = path;
	}

	private void execute() {
		List<Integer> valueList = new ArrayList();

		FileReader fr = null;
		BufferedReader br = null;

		// ここでファイルの中身を取得
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				// 取得した中身をリストに格納
				valueList.add(Integer.parseInt(line));
				// [2, 3, 4, 1, 6, 8]
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
				}
			}
		}
		int size = valueList.size();
		//  リストの中身を表示
		for (int i = 0; i < size; i++) {
			System.out.println(valueList.get(i));
			// 2 3 4 1 6 8
		}
	}

	public static void main(String[] args) {
		logger.info(EnumMain.START.name());
		new TextReader1("/Users/sugiyama/workspace/eclipse/java_work/src/lesson11/test.text").execute();
		logger.info(EnumMain.END.name());
	}

}