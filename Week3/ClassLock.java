package Week3;

public class ClassLock {
  private static Object CLASS_LOCK = new Object();

  public static void doSomething() { // lock on static method will work as class lock
    synchronized (CLASS_LOCK) {
    }
  }
}
