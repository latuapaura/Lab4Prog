package classes;

import utility.Nature;
import utility.WindAdj;

import java.util.Objects;

public class Wind extends Nature {

    private WindAdj adj;

    public boolean changeAdj(WindAdj adj){
        this.adj = adj;
        System.out.println(this.getName() + " " + this.adj);
        return true;
    }
    public Wind(){
        super( "ветерок");
        this.connectToStory();
    }


    public void raid(Tree tree, Leafs leafs){
        System.out.println(this.getName() + " налетал порывами и шевелил на " + tree.getName() + " " + leafs.getName());
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Wind wind  = (Wind) o;
        return Objects.equals(adj, wind.adj);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(adj);
    }
}
