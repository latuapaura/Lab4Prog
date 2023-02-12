package utility;

public abstract class Body{
    private final String name;
    public Body(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static class Corpus extends Body{
        public Corpus(){
            super("туловище");
        }
    }

    public static class Legs extends Body{
        public Legs(){
            super("ноги");
        }
    }

    public static class Hands extends Body{
        public Hands(){
            super("руки");
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
