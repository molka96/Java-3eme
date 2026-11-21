package entities;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("Age d'animal invalide : l'age ne peut pas etre negatif.");
    }
}
