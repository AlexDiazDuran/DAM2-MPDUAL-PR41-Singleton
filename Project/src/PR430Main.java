public class PR430Main{

    
    public static void main(String[] args) {

        System.out.println("...INICIANT...");
        PR430Objecte instance1 = PR430Objecte.getInstance("Alex", "Diaz", 20);
        System.out.println(instance1);

        PR430Objecte instance2 = PR430Objecte.getInstance("Pepito", "Duran", 98);
        System.out.println(instance2);

        PR430Objecte instance3 = PR430Objecte.getInstance("Perico", "Palotes", 57);
        System.out.println(instance3);
        }
}