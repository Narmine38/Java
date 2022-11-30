package Personnages.Equipments;

    abstract public class EquipementDefensif {

    String name;
    int lvlDef;

    public EquipementDefensif( String name, int lvlDef) {
        this.name = name;
        this.lvlDef = lvlDef;
    }

    ///////////// Getters et Setters ///////////



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

}
