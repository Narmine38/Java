package Personnages.Classe.Player;


import Personnages.Equipments.StuffPerso.Armes;
import Personnages.Equipments.StuffPerso.Bouclier;
import Personnages.Personnage;

public class Guerrier extends Personnage {

    protected Armes arme;
    protected Bouclier bouclier;

    public Guerrier(String name) {
        super(name);
        this.setPv(10);
        this.setForce(10);
        arme = new Armes("Epée de torin","épée",5);
        bouclier = new Bouclier("bouclier nain", "bouclier de torin",5);
    }



    @Override
    public String toString() {
        return
                "Nom: " + getName() + "\r\n" +
                        "Points de vie: " + getPv() + "." + "\r\n" +
                        "Dégats d'attaque: " + getForce() + "." + "\r\n" +
                        "Arme: " + arme.getName() + ", " + arme.getLvlAtk() + " points de dégats." + "\r\n" +
                        "Bouclier: " + bouclier.getName() + ", " + bouclier.getLvlDef() + " points de défense.";
    }
}
