package lesson11;


//抽象クラス
public abstract class AbstractPerson {

	public abstract String getGender();

	public void speak() {
		System.out.println("I'm a " + getGender());
	}
}
