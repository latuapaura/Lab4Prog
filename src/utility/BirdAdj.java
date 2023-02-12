package utility;

public enum BirdAdj {
    REDTUMMY("красногрудые "),
    FOREST("лесные ");

    private final String adj;

    BirdAdj(String adj){
        this.adj = adj;
    }
    @Override
    public String toString(){
        return adj;
    }

}
