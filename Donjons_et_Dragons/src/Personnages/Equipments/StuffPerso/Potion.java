package Personnages.Equipments.StuffPerso;

import Game.Cases;
import Personnages.Equipments.EquipementDefensif;
import Personnages.Personnage;

public class Potion extends EquipementDefensif implements Cases {

    public Potion(String name, int lvlDef) {
        super(name, lvlDef);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Armes{" +
                "name='" + getName() + '\'' +
                ", lvlDef=" + getLvlDef() +
                '}';
    }
}
