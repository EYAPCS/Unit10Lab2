import java.util.Scanner;

/**
 * Created by emma on 7/9/17.
 */

/**
 * MemoryCounterConsoleMenu uses a MemoryCounter (and an inherited Counter) and controls it based on
 * user input
 * @author Emma Yang
 */

public class MemoryCounterConsoleMenu {

    private Scanner input;
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

            System.out.println("1 - decrement, 2 - increment, 3 - reset, 4 - add to memory, 5 - reset memory, 0 - quit");

            int decision = input.nextInt();

            switch(decision) {

                case 1:
                    memoryCounter.decrement();
                    break;
                case 2:
                    memoryCounter.increment();
                    break;
                case 3:
                    memoryCounter.reset();
                    break;
                case 4:
                    memoryCounter.memoryAdd(memoryCounter.getCount());
                    break;
                case 5:
                    memoryCounter.memoryReset();
                    break;
                case 0:
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
