package Personnages.Equipments;

public class EquipementOffensif {

    String name;

    String type;
    int LvlAtk;

    public EquipementOffensif(String name, String type, int lvlAtk) {
        this.name = name;
        this.type = type;
        LvlAtk = lvlAtk;
    }

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

    public int getLvlAtk() {
        return LvlAtk;
    }

    public void setLvlAtk(int lvlAtk) {
        LvlAtk = lvlAtk;
    }

    @Override
    public String toString() {
        return "EquipementOffensif{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", LvlAtk=" + LvlAtk +
                '}';
    }
}
