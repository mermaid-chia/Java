package lesson11;

public enum Season {
    SPRING("春"), SUMMER("夏"), AUTUMN("秋"), WINTER("冬");

    private final String value;

    private Season(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}