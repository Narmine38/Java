package Personnages.LesMechant;

import Game.Cases;
import Personnages.Ennemies;
import Personnages.Personnage;

public class Gobelin extends Ennemies implements Cases {

    public Gobelin(String name, int pv, int force) {
        super(name, pv, force);
    }

    @Override
    public void interact(Personnage personnage) {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Gobelin{" +
                "name='" + name + '\'' +
                ", pv=" + pv +
                ", force=" + force +
                '}';
    }
}
