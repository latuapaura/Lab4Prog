package utility;

import utility.Entity;

public abstract class Nature {
    private String name;
    public Nature(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void connectToStory(){
        System.out.println(this.getName()+" присоединяется к рассказу");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        Entity o = (Entity) obj;
        if (this.name == o.getName()) {return true;}
        else {return false;}
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
