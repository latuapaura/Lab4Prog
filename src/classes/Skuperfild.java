package classes;

import utility.*;

import java.util.Objects;

public class Skuperfild extends Entity  {
    private Emotion emo;
    public Skuperfild() {
        super("Скуперфильд");
        this.connectToStory();
    }


    public void toSquander(){
        System.out.println(this.getName() + " растратил силы и понял, что не освободится");
    }

    public void toFrozen(){
        System.out.println(this.getName() + " застыл на месте");
    }

    public void toStiffened(Body.Hands hands, Body.Legs legs, Body.Corpus corpus){
        System.out.println(hands.getName() + " и " + legs.getName() +" и даже " + corpus.getName() + " одеревенели");
    }

    public void notFeel(Body.Hands hands, Body.Legs legs, Body.Corpus corpus){
        System.out.println(this.getName() + " не чувствовал " + hands.getName() + " и " + legs.getName() +" и даже " + corpus.getName());
    }
    public void toFeel(Tree tree){
        System.out.println(this.getName() + " казалось, что " + tree.getName() + " машут и шумят");
    }

    public void dontKnow(Emotion emo) {
        this.emo = emo;
        System.out.println(this.getName() + " не знал, как они называются, но смотреть на них ему было чрезвычайно " + this.emo);
    }

    public void dontSee(Birds birds, BirdAdj adj, Emotion emo) {
        System.out.println(this.getName() + " никогда не видел " + adj + birds.getName() + " вблизи, и смотреть на них доставляло ему величайшее " + emo);

    }

    public class Stump {

        public final String STAT = "обгорелый";

        public void seenLike(){
            System.out.println("Он был принят за " + STAT + " пень");
        }

    }

    public void feltSoft(){
        System.out.println(this.getName() + " почувствовал умиление");
    }

    public void startedToCry(){
        System.out.println(this.getName() + ", ощутив нежное прикосновение этого милого существа, расчувствовался и заплакал");
    }

    public void strolling() {
        class Skup {
            public void skupStrolling() {
                System.out.println("Происходит наслаждение прогулкой");
            }
        }
        System.out.println(this.getName() + " прогуливается");
        Skup skup = new Skup();
        skup.skupStrolling();
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Skuperfild skuperfild  = (Skuperfild) o;
        return Objects.equals(emo, skuperfild.emo);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(emo);
    }

}
