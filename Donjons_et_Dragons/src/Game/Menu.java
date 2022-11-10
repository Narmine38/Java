package Game;

import java.util.Scanner;

public class Menu {

    Scanner clavier = new Scanner(System.in);
    public int demarrage(){
        System.out.println("----------------------------------------------");
        System.out.println("Bienvenue dans le Royaume de Donjon et Dragon");
        System.out.println("1 .Nouvelle Partie");
        System.out.println("2 .Quitter le jeu");

        int choix = Integer.parseInt(clavier.nextLine());

        if (choix == 1){
            System.out.println("C'est Parti !");
        } else if (choix == 2) {
            System.out.println("Tu quitte le Royaume de Donjon et Dragon ");
        }
        return choix;
    }

    public String creatPersoName(){

            System.out.println("----------------------------------------------");
            System.out.println("On vas crée un nouveaux personnage");
            System.out.println("Comment souhaite tu appeler ton Hero");
            return clavier.nextLine();
    }

    public String creatPersoRace(){
        System.out.println("De quelle race souhaite etre");
        return clavier.nextLine();
    }

}
