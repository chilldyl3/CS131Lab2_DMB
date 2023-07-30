package lab2;

//Wizard class
public class Wizard implements Lockable {
 private String name;
 private int health;
 private int key;
 private boolean locked;

 /**
  * End constructor to put object into consistent state
  */
 public Wizard() {
     setName("");
     setHealth(0);
     setKey(0);
     setLocked(false);
 }

 private void setLocked(boolean b) {
	// TODO Auto-generated method stub
	
}

/**
  * Constructor to create object with common usage.
  * This is the preferred constructor.
  *
  * @param name The name of the wizard.
  */
 public Wizard(String name) {
     setName(name);
     setHealth(0);
     setKey(0);
     setLocked(false);
 }

 /**
  * This method processes the damage to the object when it is hit by other objects
  * (e.g. weapons, lightning, etc.)
  *
  * @param power The amount of damage to be taken.
  */
 public void takeDamage(int power) {
     if (!isLocked()) {
         health -= power;
     }
 }

 /**
  * Getter for name
  *
  * @return The name of the wizard.
  */
 public String getName() {
     return name;
 }

 /**
  * Setter for name
  *
  * @param name The name of the wizard to set.
  */
 public void setName(String name) {
     this.name = name;
 }

 /**
  * Getter for health
  *
  * @return The health of the wizard.
  */
 public int getHealth() {
     return health;
 }

 /**
  * Setter for health
  *
  * @param health The health of the wizard to set.
  */
 public void setHealth(int health) {
     this.health = health;
 }

 /**
  * Getter for the key
  *
  * @return The key value.
  */
 public int getKey() {
     return key;
 }

 /**
  * Setter for the key
  *
  * @param key The key value to set.
  */
 public void setKey(int key) {
     if (key > 0 && this.key == 0) {
         this.key = key;
     }
 }

 /**
  * Check if the wizard is currently locked.
  *
  * @return true if the wizard is locked, false otherwise.
  */
 @Override
 public boolean isLocked() {
     return locked;
 }

 /**
  * Lock the wizard with a specific key.
  *
  * @param key The key value to lock the wizard.
  */
 @Override
 public void lock(int key) {
     if (key == this.key) {
         locked = true;
     }
 }

 /**
  * Unlock the wizard with a specific key.
  *
  * @param key The key value to unlock the wizard.
  */
 @Override
 public void unlock(int key) {
     if (key == this.key) {
         locked = false;
     }
 }

 @Override
 public String toString() {
     return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
 }
}
