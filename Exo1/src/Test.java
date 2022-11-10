import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        String nom;
        int age;
        double salaire;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Saisir votre nom : ");
        nom = clavier.next();
        clavier.nextLine();
        System.out.print("Saisir votre age : ");
        age = clavier.nextInt();
        clavier.nextLine();
        System.out.print("Saisir votre salaire : ");
        salaire = clavier.nextDouble();
        clavier.nextLine();
        System.out.println("[nom = " + nom + " , age = " + age + " , salaire =" + salaire + "]");

        // fermer les ressources
        clavier.close();

    }
}