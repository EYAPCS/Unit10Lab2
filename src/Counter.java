/**
 * Created by emma on 7/8/17.
 */

/**
 * Counter class has an integer count.
 */

public class Counter {

    private int count;

    /**
     * Sets the count to zero
     */
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
