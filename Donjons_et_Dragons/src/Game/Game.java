package Game;

import Personnages.Classe.Guerrier;
import Personnages.Classe.Magicien;
import Personnages.Personnage;

import java.util.Objects;

public class Game {

    Board cece = new Board();
    Menu toto = new Menu();
    Personnage persoDuJoueur;

    public void fullGame() {
        toto.demarrage();
        persoDuJoueur = choosenHero();
        starGame();
    }

    private Personnage choosenHero() {
        String nom = toto.creatPersoName();
        String type = String.valueOf(toto.creatPersoRace());
        Personnage persoDuJoueur = null;
        if (Objects.equals(type, "1")) {
            persoDuJoueur = new Guerrier(nom);
            System.out.println(persoDuJoueur);
        } else if (Objects.equals(type, "2")) {
            persoDuJoueur = new Magicien(nom);
            System.out.println(persoDuJoueur);

        }
        return persoDuJoueur;
    }

    private void starGame(){
       String choice = toto.GoOrModif();

       if (Objects.equals(choice, "1")){
           System.out.println("c'est partie !");
           while (cece.getPlayerPosition() < cece.getTest().length){
               partiLancer();
           }

       }else if (Objects.equals(choice, "2")){
           choosenHero();
           toto.GoOrModif();

       } else if (Objects.equals(choice, "3")) {
           System.exit(0);
       }
    }

    public void partiLancer(){
        cece.plateau();
        String choice = toto.OptionEnJeux();
        if (Objects.equals(choice, "1")){
            cece.setPlayerPosition(cece.getPlayerPosition() + lancerDeDee());
        } else if (Objects.equals(choice,"2")) {
            System.out.println("persoDuJoueur");
        }else if (Objects.equals(choice, "3")) {
            System.exit(0);
        }
    }

    private int lancerDeDee(){
        return (int) (Math.random() * 20 + 1);

    }

}

