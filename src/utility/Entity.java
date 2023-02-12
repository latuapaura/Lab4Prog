package utility;

import classes.Skuperfild;

public abstract class Entity implements GetProp {

    private final String name;
    public Entity(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void connectToStory() {
        System.out.println(this.getName()+" присоединяется к рассказу");
    }

    public void breath() {
        System.out.println(this.getName() + " использует кислород");
    }

    public void exist() {
        System.out.println(this.getName() + " существует и находится под присмотром Господа Бога");
    }

    public void toSee() {
        System.out.println(this.getName() + " видит и в окулисте не нуждается");
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
