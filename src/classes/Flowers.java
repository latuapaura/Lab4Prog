package classes;

import utility.FlowerColor;
import utility.Nature;
import utility.Position;

import java.awt.*;

public class Flowers extends Nature {
    private Position pos;
    private Color color;
    public Flowers(FlowerColor color) {
        super(color + "цветы");
        this.connectToStory();
    }

    public void dazzle(Grass grass){
        System.out.println("В " + grass.getName()  + " пестреют "+ this.getName());
    }

    public boolean changePos(Position pos){
        this.pos = pos;
        System.out.println(this.getName() + " " + this.pos);
        return true;
    }

    public boolean changeColor(Color color){
        this.color = color;
        System.out.println(this.getName() + " " + this.color);
        return true;
    }

}
