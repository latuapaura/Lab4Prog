package classes;

import utility.BirdAdj;
import utility.Entity;
import utility.Position;

import java.util.Objects;

public class Birds extends Entity {

    private Position position;
    private BirdAdj adj;
    public Birds() {
        super("птички");
        this.connectToStory();
    }

    public void tweet(BirdAdj adj){
        this.adj = adj;
        System.out.println(this.adj + this.getName()+ " весело чирикали");
    }
    public void peck(Grass grass, BirdAdj adj, Position pos){
        this.adj = adj;
        System.out.println(this.adj + this.getName() + " слетали в " + grass.getName() + " и клюют что-то и взымали к " + this.position);
    }

    public void stoppedToScary(Skuperfild skuperfild, BirdAdj adj){
        this.adj = adj;
        System.out.println("Видя, что " + skuperfild.getName() + " неподвижен " + this.adj + this.getName() + " перестали бояться и пролетели прям под его носом ");
    }


    public void changePos(Position pos){
        this.position = pos;
        System.out.println(this.adj + this.getName() + " в данный момент находятся " + this.position);
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null||getClass() != o.getClass()) return false;
        Birds birds  = (Birds) o;
        return Objects.equals(adj, birds.adj);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(adj);
    }


}
