package Equipments;

public class EquipementOffensif {
    String type;
    String name;
    int LvlAtk;

    ///////////// Getters et Setters ///////////
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvlAtk() {
        return LvlAtk;
    }

    public void setLvlAtk(int lvlAtk) {
        LvlAtk = lvlAtk;
    }
    ///////////// Getters et Setters ///////////


    public EquipementOffensif(String type, String name, int lvlAtk) {
        this.type = type;
        this.name = name;
        LvlAtk = lvlAtk;
    }
}
