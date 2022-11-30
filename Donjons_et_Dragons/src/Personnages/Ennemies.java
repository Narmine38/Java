package Personnages;

import Game.Cases;

public class Ennemies extends Personnage {

    public Ennemies(String name, int pv,int force) {
        super(name);
        this.pv = pv;
        this.force = force;
    }

    @Override
    public String toString() {
        return "Ennemies{" +
                "name='" + name + '\'' +
                ", pv=" + pv +
                ", force=" + force +
                '}';
    }
}
