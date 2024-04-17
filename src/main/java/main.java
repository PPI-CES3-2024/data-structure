import java.util.ArrayList;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        int arraySize = 20;
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 1; i <= arraySize; i++) {
            numbers.add(random());
        }

        System.out.println("Numbers in array:");
        System.out.println(numbers);
        System.out.println("Evens numbers");
        //numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::print);
        ArrayList<Integer> evens = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(evens);
    }

    private static int random() {
        int min = 1;
        int max = 10;
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
