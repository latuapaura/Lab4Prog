package utility;

public enum Emotion {
    NICE("приятно"), PLEASURE("наслаждение");
    private String emo;

    Emotion(String emo){
        this.emo = emo;
    }

    @Override
    public String toString() {
        return emo;
    }
}
