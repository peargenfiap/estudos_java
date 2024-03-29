package Predicate;
import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.getPreco() * (1 - prod.getDesconto())) > 750;

        Produto produto = new Produto("notebok", 3983.3, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
