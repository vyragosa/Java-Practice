package Ex4.Task3;

public enum Specification {
    DISCOUNT("Товар по скидке"),
    LAST("Последний товар"),
    SHOWCASE("Витринный образец"),
    MISSING("Товар отсутствует") {
        @Override
        String isAvailable() {
            return "невозможно купить";
        }
    },

    NORMAL("Обычный товар");

    Specification(String description) {
        this.description = description;
    }

    private final String description;

    String getDescription() {
        return description;
    }

    String isAvailable() {
        return "можно купить";
    }


    @Override
    public String toString() {
        return name() + "{" + getDescription()  + ", "+ isAvailable() + "}";
    }
}
