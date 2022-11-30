package Game.Board;

import Game.CaseVide;
import Game.Cases;
import Game.Exception.PersonnageHorsPlateauException;
import Personnages.Equipments.StuffPerso.Armes;
import Personnages.Equipments.StuffPerso.Potion;
import Personnages.LesMechant.Gobelin;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public ArrayList<Cases> getTableau() {
        return tableau;
    }

    public void setTableau(ArrayList<Cases> tableau) {
        this.tableau = tableau;
    }

    private int playerPosition;
    ArrayList<Cases> tableau = new ArrayList<>();

    public Board() {

        int nbCase = 64;
        for (int i = 0; i < nbCase + 1; i++) {
            switch (i) {

                case 1 -> tableau.add(new CaseVide());
                case 2 -> tableau.add(new Gobelin("anis", 10, 10));
                case 3 -> tableau.add(new Armes("Sabre", "épée", 5));
                case 4 -> tableau.add(new Potion("petitePotion", 10));

            }
            ;
        }


    }

    public void afficheLePlateau() {
        for (int i = 0; i < tableau.size(); i++) {

            if (playerPosition == i) {
                System.out.print("***");
            } else {
                System.out.print("...");
            }
            System.out.print("|");

        }
        System.out.println(" ");

    }

    public void move(int nb) throws PersonnageHorsPlateauException {
        if (getPlayerPosition() + nb >= tableau.size()){
            throw new PersonnageHorsPlateauException();

        }else {
            setPlayerPosition(getPlayerPosition() + lancerDeDee());
        }
    }
    public int lancerDeDee() {
        int D = (int) (Math.random() * 1 + 1);
        System.out.println(D);
        return D;

    }

}
// cece.move(lancerDeDee());
//         c
//
