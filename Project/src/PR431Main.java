import java.lang.reflect.Constructor;

public class PR431Main{

    public static void main(String[] args) {

        System.out.println("...INICIANT...");
        PR431Objecte instance1 = PR431Objecte.getInstance("Alex", "Diaz", 20);

        PR431Objecte instance2 = null;

        PR431Objecte instance3 = null;

try {
    Constructor[] constructors = PR431Objecte.class.getDeclaredConstructors();
    for (Constructor constructor : constructors) {
        //Below code will destroy the singleton pattern
        constructor.setAccessible(true);
        instance2 = (PR431Objecte) constructor.newInstance("Pepito", "Duran", 98);
        instance3 = (PR431Objecte) constructor.newInstance("Perico", "Palotes", 57);
        break;
    }
    
    System.out.println(instance1);
    System.out.println(instance2);
    System.out.println(instance3);

} catch (Exception e) { e.printStackTrace(); }
    }

}
