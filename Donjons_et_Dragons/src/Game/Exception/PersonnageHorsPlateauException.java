package Game.Exception;

public class PersonnageHorsPlateauException extends Throwable {


    public PersonnageHorsPlateauException() {

    }

    @Override
    public String toString() {
        return "Le personnage est sorti du plateau";
    }
}
