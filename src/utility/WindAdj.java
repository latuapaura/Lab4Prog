package utility;

public enum WindAdj {
    WARM("тёплый "),
    GENTLE("ласковый ");

    private final String adj;

    WindAdj(String adj){
        this.adj = adj;
    }
    @Override
    public String toString(){
        return adj;
    }
}
