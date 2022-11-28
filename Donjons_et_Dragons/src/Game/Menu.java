package Game;
import java.util.Scanner;

public class Menu {

    Scanner clavier = new Scanner(System.in);

    public UserChoice demarrage() {
        UserChoice choix;
        System.out.println("----------------------------------------------");
        System.out.println("Bienvenue dans le Royaume de Donjon et Dragon");
        do {
            System.out.println("1 .Nouvelle Partie");
            System.out.println("2 .Quitter le jeu");
            choix = switch (clavier.nextLine()){
                case "1" -> UserChoice.CONTINUE;
                case "2" -> UserChoice.QUIT;
                default -> UserChoice.WRONG_ANSWER;
            };

        }while (choix == UserChoice.WRONG_ANSWER);

        return choix;
    }

    public String creatPersoName() {
        System.out.println("----------------------------------------------");
        System.out.println("On vas crée un nouveaux personnage");
        System.out.println("Comment souhaite tu appeler ton Hero");
        return clavier.nextLine();
    }

    public UserChoice creatPersoRace() {
        UserChoice choix;
        System.out.println("----------------------------------------------");
        do {
            System.out.println("De quelle race souhaite etre | 1 Guerrier / 2 Magicien ");
            choix = switch (clavier.nextLine()){
                case "1" -> UserChoice.GUERRIER;
                case "2" -> UserChoice.MAGICIEN;
                default -> UserChoice.WRONG_ANSWER;
            };
        }while (choix == UserChoice.WRONG_ANSWER);

        return choix;
    }

    public String GoOrModif() {
        System.out.println("----------------------------------------------");
        System.out.println("Ton personage est pret a partir a l'aventure !");
        System.out.println("1: C'est parti | 2: non je veux modifier mon personage | 3: laisse tomber j'ai trop peur");
        return clavier.nextLine();
    }

    public String OptionEnJeux() {
        System.out.println("1. Lancer les dés| 2. info du personnage | 3. Quitter");
        return clavier.nextLine();
    }



}
