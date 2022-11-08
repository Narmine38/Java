
public class Demenagement {
    public static void main(String[] args) {

        int CapaciteDuCamion = 9;
        int CartonsAEnvoyer = 34;
        int CartonEnvoyer;


        while (CartonsAEnvoyer > 0) {

            if (CartonsAEnvoyer >= CapaciteDuCamion) {
                CartonsAEnvoyer -= CapaciteDuCamion;
                CartonEnvoyer = CapaciteDuCamion;

            } else {
                CapaciteDuCamion = CartonsAEnvoyer;
                CartonEnvoyer = CapaciteDuCamion;
                CartonsAEnvoyer -= CartonEnvoyer;

            }

            System.out.println("Voyage de " + CartonEnvoyer + " cartons.");

        }
    }
}
