package utility;

public abstract class PichuzkaBody {
    private String name;
    public void Body(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static class Head extends Body{
        public Head(){
            super("голова");
        }
    }

    public static class Wings extends Body{
        public Wings(){
            super("крылья");
        }
    }

}
