package Game;

import Personnages.Personnage;

public class Game {


    public void startGame() {
        int choix;
        String choix1;
        String choix2;

        Menu toto = new Menu();
        choix = toto.demarrage();

        if (choix == 1){

            choix1 = toto.creatPersoName();
            choix2 = toto.creatPersoRace();

            Personnage test = new Personnage(choix1,choix2);

            System.out.println("Ton personnage est" + test.getName() + "ta race est" + test.getType());
        }
    }






    }

