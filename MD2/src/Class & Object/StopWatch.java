import java.util.Arrays;
import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }
    public void start() {
        startTime = new Date().getTime();
    }
    public void stop() {
        endTime = new Date().getTime();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        int[] array = new int[100000];
        for (int i = 0; i< array.length; i++) {
            array[i] = (int)(Math.random()* 100000);
        }
        Arrays.sort(array);

        stopwatch.stop();
        System.out.println("The Elapsed Time is: " + stopwatch.getElapsedTime() + " milliseconds.");
    }
}




