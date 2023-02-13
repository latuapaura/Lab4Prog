package classes;

import exceptions.PositionException;
import utility.FlowerColor;
import utility.Nature;
import utility.Position;
import java.util.Objects;

public class Flowers extends Nature {
    private Position pos;
    public Flowers(FlowerColor color) {
        super(color + "цветы");
        this.connectToStory();
    }

    public void dazzle(Grass grass){
        System.out.println("В " + grass.getName()  + " пестреют "+ this.getName());
    }

    public boolean changePos(Position pos) {
        this.pos = pos;
        System.out.println(this.getName() + " " + this.pos);
        return true;
    }

    public void settingPosition() throws PositionException {

        if (this.pos == null) {
            throw new PositionException("Кажется, что-то здесь отсутсвует.");
        }
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Flowers flowers  = (Flowers) o;
        return Objects.equals(pos, flowers.pos);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(pos);
    }

}

