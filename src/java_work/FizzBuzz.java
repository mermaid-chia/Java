package java_work;

public class FizzBuzz {

	public static void main(String[] args) {
		if (args.length == 0) {
			return;
		}
		
		///受け取った引数を数値に変換する 34
		int max = Integer.parseInt(args[0]);
		
		String result = null;
		
		///定型分で繰り返し
		for (int i = 0; i < max; i++) {
			int num = i + 1;
			result = "";
			if (num % 3 == 0) {
				result = result + "Fizz";
			}
			if (num % 5 == 0) {
				result = result + 	"Buzz";
			}
			if (result.length() == 0) {
				result = result + num;
			}
			System.out.print(result + " ");
		}
		
		
		//   youyuugaarutokini dousitekounatteirukamitemoraitai
		for (int i = 0; i < max; i++) {
			int num = i + 1;
			if (num % 15 == 0) {
				System.out.println("FizzBuzz");
				return ;
			}
			
			if (num % 5 == 0) {
				System.out.println("Buzz");
				return;
			}
			
			if (num % 3 == 0) {
				System.out.println("Fizz");
				return;
			}
			
			System.out.println(num);
		}
	}

}
