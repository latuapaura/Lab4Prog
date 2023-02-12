package utility;

public enum FlowerColor {
    PINK("Розовые "), BLUE("Нежно-голубые ");
    private final String color;

    FlowerColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
