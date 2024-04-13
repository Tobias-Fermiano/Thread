
public class Main {
    public static void main(String[] args) {
        Thread cliente1 = new MyThread("Afonso", 100, 0);
        Thread cliente2 = new MyThread("Cassio", 100, 0);
        Thread cliente3 = new MyThread("Gustavo", 100, 0);
        Thread cliente4 = new MyThread("Tobias", 100, 0);
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
    }
}