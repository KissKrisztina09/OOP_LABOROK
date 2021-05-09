package labor10_1;

public class Main {
    public static void main(String[] args) {
        String [] sa_array = new String[10];
        for(int i=0; i< sa_array.length; ++i){
            sa_array[i] = " ";
        }
        Thread producer = new AddToArray(sa_array);
        producer.start();
        Thread customer = new TakeSomeFromArray(sa_array, "bbb", 2);
        customer.start();
    }
}
