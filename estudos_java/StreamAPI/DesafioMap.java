package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        nums.stream()
            .map(Integer::toBinaryString)
            .map(s -> new StringBuilder(s).reverse().toString())
            .map(s -> Integer.parseInt(s, 2))
            .forEach(System.out::println);
    }

    }
