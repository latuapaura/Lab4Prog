package classes;

import classes.Tree;
import utility.Entity;
import utility.Nature;

public class Leafs extends Nature {
    private String name;
    public Leafs() {
        super("листья");
        this.connectToStory();
    }
}
