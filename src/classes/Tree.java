package classes;

import utility.Nature;

public class Tree extends Nature {
    public Tree() {
        super("Деревья");
        this.connectToStory();
    }

    public void whisper(){
        System.out.println(this.getName()+" что-то шепчут на своём лесном языке");
    }
}
