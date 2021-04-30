package thread_unsafe;

public class ThreadUnsafeCounter {
    private int counter;
    public synchronized void increment(){ // ha synchronized nelkul van akkor unsafe
        //synchronized (this){
        //     ++ counter
        //}
        ++counter;
    }

    public int getCounter() {
        return counter;
    }

}
