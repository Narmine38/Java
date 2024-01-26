package fr.cedric.gamelibrary.view;

import fr.cedric.gamelibrary.factory.GameType;

public class View {

    public static void noValideTypeGame(){
        System.out.println("Entrée invalide. Veuillez saisir une valeur correcte.");

    }

    public static void selectGame(){
        System.out.println("Veuillez choisir un jeu dans la liste suivante :");
    }

    public static void welcome(GameType game){
        System.out.println("Bienvenue dans " + game.name().toLowerCase() + " ! Le jeu commence maintenant.");

    }
}
