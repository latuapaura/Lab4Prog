package utility;

public abstract class PichuzkaBody {
    private final String name;
    public PichuzkaBody(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static class Head extends PichuzkaBody{
        public Head(){
            super("голова");
        }
    }

    public static class Wings extends PichuzkaBody{
        public Wings(){
            super("крылья");
        }
    }

}
