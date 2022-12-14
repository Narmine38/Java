package Personnages.Equipments.StuffPerso;

import Game.Cases;
import Personnages.Equipments.EquipementOffensif;
import Personnages.Personnage;

public class Armes extends EquipementOffensif implements Cases {
    public Armes(String name, String type, int lvlAtk) {
        super(name, type, lvlAtk);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Armes{" +
                "name='" + getName() + '\'' +
                ", type=" + getType() +
                ", lvlAtk=" + getLvlAtk() +
                '}';
    }
}
