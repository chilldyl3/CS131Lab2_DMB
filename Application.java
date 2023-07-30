package lab2;

//Application class for testing the Wizard class
public class Application {
 public static void main(String[] args) {
     Wizard wizard = new Wizard("Merlin");

     System.out.println("Initial state: " + wizard);

     wizard.setKey(123);
     wizard.lock(123);
     System.out.println("Is Wizard locked? " + wizard.isLocked()); // Should be true

     wizard.unlock(456); // Trying with wrong key
     System.out.println("Is Wizard locked? " + wizard.isLocked()); // Should be true

     wizard.unlock(123); // Unlocking with the correct key
     System.out.println("Is Wizard locked? " + wizard.isLocked()); // Should be false

     wizard.setHealth(100);
     System.out.println("Wizard health: " + wizard.getHealth()); // Should be 100

     wizard.takeDamage(20);
     System.out.println("Wizard health after taking damage: " + wizard.getHealth()); // Should be 80

     wizard.lock(123);
     wizard.takeDamage(30); // Should not take damage as the wizard is locked
     System.out.println("Wizard health after taking damage when locked: " + wizard.getHealth()); // Should be 80
 }
}
