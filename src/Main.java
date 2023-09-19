import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= 0) {
                numbers.remove(i);
                i--;
            }
            if (numbers.get(i)%2 != 0){
                numbers.remove(i);
                i--;
            }
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
