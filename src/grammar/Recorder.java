
import java.util.HashMap;
import java.util.Map;

public class Recorder {
	

  private Map<String, String> data = new HashMap <>();
  //[“キー”, “バリュー”][“キー2”, “バリュー2”][“キー3”,”バリュー3”]
	public void put(String key, String value) {
		//値を格納する["red", "apple"]
		data.put(key, value);
		System.out.println(key + "=" + value);
		//   red=apple
	}
	
	public void get(String key) {
		// マップの中にkeyが存在するかどうか
		if (!data.containsKey(key)) {
			throw new IllegalArgumentException();
		}
	    // key(red)を指定してvalue(apple)を取り出す
		System.out.println(data.get(key));
	}
	
	// 引数のkeyにひもづく値を削除
	public void delete(String key) {
		if (!data.containsKey(key)) {
			throw new IllegalArgumentException();
		}

		data.remove(key);
		System.out.println("deleted: "  + key);
	}
	
	
	// 全部削除
	public void delete() {
		data.clear();
		System.out.println("deleted all");
	}
}



