package Game;

import Game.Board.Board;
import Game.Exception.PersonnageHorsPlateauException;
import Game.Menu.Menu;
import Game.Menu.UserChoice;
import Personnages.Classe.Player.Guerrier;
import Personnages.Classe.Player.Magicien;
import Personnages.Personnage;

public class Game {

    Board cece = new Board();
    Menu toto = new Menu();
    Personnage persoDuJoueur;

    public void fullGame() {

        if (toto.demarrage() == UserChoice.CONTINUE) {
            persoDuJoueur = choosenHero();

        } else {
            System.out.println("GameOver");
            System.exit(0);
        }
        starGame();
    }

    private Personnage choosenHero() {
        String nom = toto.creatPersoName();
        UserChoice choix = toto.creatPersoRace();
        Personnage persoDuJoueur = null;

        if (choix == UserChoice.GUERRIER) {
            persoDuJoueur = new Guerrier(nom);
            System.out.println(persoDuJoueur);

        } else if (choix == UserChoice.MAGICIEN) {
            persoDuJoueur = new Magicien(nom);
            System.out.println(persoDuJoueur);
        }
        return persoDuJoueur;
    }

    private void starGame() {
        UserChoice choix = toto.GoOrModif();

        if (choix == UserChoice.PLAY) {
            System.out.println("c'est partie !");
            boolean playing = true;
            while (playing) {
                try {
                    partiLancer();
                } catch (PersonnageHorsPlateauException e) {
                    System.out.println(e.getMessage());
                    playing = false;
                }
            }

        } else if (choix == UserChoice.MODIF) {
            choosenHero();
            starGame();

        } else if (choix == UserChoice.QUIT) {
            System.out.println("GameOver");
            System.exit(0);
        }
    }

    public void partiLancer() throws PersonnageHorsPlateauException {

        cece.afficheLePlateau();
        cece.getTableau().get(cece.getPlayerPosition()).interact(persoDuJoueur);//truc pour recuperé l'interacte selon la postion du joueur

        UserChoice choix = toto.OptionEnJeux();
        if (choix == UserChoice.PLAY) {
            cece.move(lancerDeDee());


        } else if (choix == UserChoice.INFO) {
            System.out.println(persoDuJoueur);

        } else if (choix == UserChoice.QUIT) {
            System.out.println("GameOver");
            System.exit(0);
        }
    }


    public int lancerDeDee() {
        int D = (int) (Math.random() * 1 + 1);
        System.out.println(D);
        return D;

    }

}

