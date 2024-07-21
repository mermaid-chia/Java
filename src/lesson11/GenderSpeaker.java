package lesson11;

public class GenderSpeaker {

	public static void main(String[] args) {
		doSpeak(new Man());
		doSpeak(new Woman());
		doSpeak(new Genderless());
	}

	private static void doSpeak(AbstractPerson person) {
		person.speak();
	}
}
