package lesson11;

import java.util.Optional;

public class OptionalSample {
    private String name;

    public OptionalSample(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}