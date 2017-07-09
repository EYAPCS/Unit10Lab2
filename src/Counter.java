/**
 * Created by emma on 7/8/17.
 */

public class Counter {

    private int count;

    public Counter() {
        reset();
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void reset() {
        count = 0;
    }

}
