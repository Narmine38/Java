package Personnages.Equipments;

public class EquipementDefensif {
    String type;
    String name;
    int lvlDef;

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

    public int getLvlDef() {
        return lvlDef;
    }

    public void setLvlDef(int lvlDef) {
        this.lvlDef = lvlDef;
    }
    ///////////// Getters et Setters ///////////


    public EquipementDefensif(String type, String name, int lvlDef) {
        this.type = type;
        this.name = name;
        this.lvlDef = lvlDef;
    }
}
