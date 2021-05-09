package labor10_1;

public class TakeSomeFromArray extends Thread{
    private String [] array;
    private String str;
    private int number;

    public TakeSomeFromArray(String[] array, String str, int number){
        this.array = array;
        this.str = str;
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (array) {
            //nem tudom ha csak ennyi lenne ide
            for (int i = 0; i < array.length; ++i) {
                if (array[i] == str) {
                    array[i] = " ";
                }
            }
        }
    }


}
