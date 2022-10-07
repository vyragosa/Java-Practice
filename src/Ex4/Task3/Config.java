package Ex4.Task3;

public enum Config {
    LOGIN("admin"),
    PASSWORD("123123");
    String description;
    Config(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
