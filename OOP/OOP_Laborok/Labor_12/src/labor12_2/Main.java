package labor12_2;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
       Storage storage1 = new Storage("Labor_12/data1000000.txt");
       storage1.update("Labor_12/update1000000.txt");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}
