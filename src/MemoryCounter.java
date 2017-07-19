/**
 * Created by emma on 7/9/17.
 */

/**
 * MemoryCounter is a subclass of Counter and can be used to control a counter
 * @author Emma Yang
 */

public class MemoryCounter extends Counter{

    private int memoryValue;

    /**
     * Resets the Counter count
     */
    public MemoryCounter() {
        super();
        memoryReset();
    }

    public int getMemoryValue() {
        return memoryValue;
    }

    /**
     * Adds x to the memoryValue
     * @param x
     */
    public void memoryAdd(int x) {
        memoryValue += x;
    }

    public void memoryReset() {
        memoryValue = 0;
    }

}
