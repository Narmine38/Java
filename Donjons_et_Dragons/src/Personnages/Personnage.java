package Personnages;

abstract public class Personnage {
    protected String name;
    private String type;
    protected int pv;
    protected int force;


    ///////////// Getters et Setters ///////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }


    ///////////// Getters et Setters ///////////

    ///////////// Constructeur ///////////
    public Personnage() {

    }

    public Personnage(String name) {
        this.name = name;
    }


    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Personnage(String name, String type, int pv, int force) {
        this.name = name;
        this.type = type;
        this.pv = pv;
        this.force = force;
    }

    public Personnage(String name, int force, int pv) {
        this.name = name;
        this.force = force;
        this.pv = pv;
    }


    ///////////// Constructeur ///////////

    ///////////// méthode toString(), ///////////

    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pv=" + pv +
                ", force=" + force +
                '}';
    }

    public int getPos() {
        return 0;
    }

    ///////////// méthode toString(), ///////////
}
