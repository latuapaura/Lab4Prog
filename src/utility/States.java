package utility;

import exceptions.MoralStatesException;

public class States {
    String name;
    boolean mindFine;
    boolean mindBad;
    public States(String name){
        this.name = name;
    }
    public void kind() {
        System.out.println("Разум в порядке");
        mindFine = true;
    }
    public void angry() {
        System.out.println("Разум нестабилен!!!");
        mindBad = true;
    }

    public void settingMindBad() throws MoralStatesException {

        if (mindBad) {
            throw new MoralStatesException("Разум разрушен. Скуперфильд безжалостно съел Пичужку заживо, предварительно открутив ей голову. Вы создали монстра." +
                    " Да разъест твою плоть Красная гниль.");
        }
    }
}