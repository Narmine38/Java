package Game;

import Personnages.Personnage;

import java.util.Objects;
import java.util.Scanner;

public class Game {


    public void startGame() {
        int choix;
        String nom = new String();
        String type = new String();

        Menu toto = new Menu();
        choix = toto.demarrage();


        if (choix == 1) {
            nom = toto.creatPersoName();
            type = toto.creatPersoRace();

            if (Objects.equals(type, "Guerrier")){
                int force = 10 ;
                int pv = 10 ;
                Personnage test = new Personnage(nom, type, pv, force);
                System.out.println(test);
                toto.GoOrModif();
            } else if (Objects.equals(type, "Magicien")) {
                int force = 15 ;
                int pv = 6 ;
                Personnage test = new Personnage(nom, type, pv, force);
                System.out.println(test);
                toto.GoOrModif();
            }

        }
    }
}

//System.out.println("Ton personnage est" + " " + test.getName() + " " + "ta race est" + test.getType());
//race = toto.creatPersoRace();
//nom = toto.creatPersoName();
