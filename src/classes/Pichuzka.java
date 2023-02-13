package classes;

import utility.BirdAdj;
import utility.Entity;
import utility.PichuzkaBody;

public class Pichuzka extends Entity {

    public Pichuzka(){
        super("Пичужка");
        this.connectToStory();
    }

    public void satOnShoulder(Skuperfild skuperfild){
        System.out.println(this.getName() + " села на плечо " + skuperfild.getName());
    }

    public void lookedWay(PichuzkaBody.Head head){
        System.out.println(this.getName() + " поглядывала по сторонам, наклоняя " + head.getName() + " то на один бок то на другой");
    }

    public void fliedAway(PichuzkaBody.Wings wings, Skuperfild skuperfild){
        System.out.println(this.getName() + " вспорхнула " + wings.getName() + " и улетела, задев " + skuperfild.getName() + " по щеке краем крыла");
    }

}
