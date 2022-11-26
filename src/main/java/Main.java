import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueueOfNumbers = new PriorityQueue<Integer>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            priorityQueueOfNumbers.add(random.nextInt(100));
        }

        System.out.println(priorityQueueOfNumbers);
        Double sum = 0.0;

        Iterator<Integer> iterator = priorityQueueOfNumbers.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println(priorityQueueOfNumbers.size());
        System.out.println(sum / priorityQueueOfNumbers.size());
    }
}
