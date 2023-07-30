package lab2;

//Lockable interface
interface Lockable {
 void setKey(int key);
 boolean isLocked();
 void lock(int key);
 void unlock(int key);
}
