package Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        Supplier<List<String>> list = () -> Arrays.asList("Ana", "Bia", "Ciao", "Gui");
        System.out.println(list.get());
    }
}
