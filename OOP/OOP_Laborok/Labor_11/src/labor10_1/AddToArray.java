package labor10_1;

import java.util.Random;

public class AddToArray extends Thread{
    String [] array;

    public AddToArray(String[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true){
            int number = random.nextInt(26);
            char character = (char)(number + 97);
            String str = "" + character +character +character;
            //System.out.println(str);
            synchronized (array) {
                array[minIndex()] = str;
                printArray();
            }
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private int minIndex(){
        int minimumIndex = 0;
        String minValue = array[0];
        for(int i=1; i< array.length; ++i){
            if(array[i].compareTo(minValue) < 0){
                minValue = array[i];
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }

    private void printArray(){
        for(String element:array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
