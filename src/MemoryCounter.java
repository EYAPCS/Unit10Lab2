/**
 * Created by emma on 7/9/17.
 */
public class MemoryCounter extends Counter{

    private int memoryValue;

    public MemoryCounter() {
        super();
    }

    public int getMemoryValue() {
        return memoryValue;
    }

    public void memoryAdd(int x) {
        memoryValue += x;
    }

    public void memoryReset() {
        memoryValue = 0;
    }

}
