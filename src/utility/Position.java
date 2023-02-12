package utility;

public enum Position {
    INGRASS("в траве"), UP("вверху"), DOWN("внизу");
    private final String pos;
    Position(String pos){
        this.pos = pos;
    }

    @Override
    public String toString() {
        return pos;
    }
}
