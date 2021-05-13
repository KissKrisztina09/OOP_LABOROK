package labor12_3;

public class Main {
    public static void main(String[] args) {
        Processing processing = new Processing("Labor_12/nevek1.txt");
        processing.Hungarian("Labor_12/magyar.txt");
        processing.Romanian("Labor_12/roman.txt");
        processing.Math("Labor_12/matek.txt");
        processing.Average();
        processing.BAC();
    }
}
