package LoggerTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Input max size: ");
        int size = scanner.nextInt();
        System.out.println("Input the upper limit of a range: ");
        int upperLimit = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(upperLimit));
        }

        logger.log("Array with random numbers: " + numbers);

        System.out.println("Input the number of filter: ");
        int f = scanner.nextInt();

        Filter filter = new Filter(f);

        System.out.println("Final array: " + filter.filterOut(numbers));
    }
}
