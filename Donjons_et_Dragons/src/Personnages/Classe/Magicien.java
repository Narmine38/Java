package Personnages.Classe;

import Personnages.Equipments.StuffPerso.Philtre;
import Personnages.Equipments.StuffPerso.Sorts;
import Personnages.Personnage;

public class Magicien extends Personnage {
   protected Sorts sort;
    protected Philtre philtre;

    public Magicien(String name) {
        super(name);
        this.setPv(6);
        this.setForce(15);
        sort = new Sorts("gandalf","baton", 5);
        philtre = new Philtre("potion", "petitePotin", 3);

    }

    @Override
    public String toString() {
        return
                "Nom: " + getName() + "\r\n" +
                        "Points de vie: " + getPv() + "." + "\r\n" +
                        "Dégats d'attaque: " + getForce() + "." + "\r\n" +
                        "Arme: " + sort.getName() + ", " + sort.getLvlAtk() + " points de dégats." + "\r\n" +
                        "Bouclier: " + philtre.getName() + ", " + philtre.getLvlDef() + " points de défense.";
    }
}
