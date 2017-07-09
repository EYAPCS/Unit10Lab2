import java.util.Scanner;

/**
 * Created by emma on 7/9/17.
 */
public class MemoryCounterConsoleMenu {

    private Scanner input;
    private Counter counter;
    private MemoryCounter memoryCounter;
    private boolean running;

    public MemoryCounterConsoleMenu() {
        memoryCounter = new MemoryCounter();
        input = new Scanner(System.in);
        running = true;
    }

    public void displayCounter() {
        System.out.println(memoryCounter.getCount());
    }
    public void displayMemoryCounter() { System.out.println(memoryCounter.getMemoryValue()); }

    public void quit() {
        running = false;
    }

    public void start() {

        while(running){

            System.out.println("0 - decrement, 1 - increment, 2 - reset, 3 - add to memory, 4 - reset memory, 5 - quit");

            int decision = input.nextInt();

            switch(decision) {

                case 0:
                    memoryCounter.decrement();
                    break;
                case 1:
                    memoryCounter.increment();
                    break;
                case 2:
                    memoryCounter.reset();
                    break;
                case 3:
                    memoryCounter.memoryAdd(memoryCounter.getCount());
                    break;
                case 4:
                    memoryCounter.memoryReset();
                    break;
                case 5:
                    quit();

            }

            if(running) {
                System.out.print("Counter: ");
                displayCounter();
                System.out.print("Memory: ");
                displayMemoryCounter();
            }

        }

    }

}
