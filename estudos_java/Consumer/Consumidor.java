package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import Predicate.Produto;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = produto -> System.out.println(produto.getNome());

        Produto p = new Produto("Caneta", 12.34, 0.10);
        Produto p2 = new Produto("Lapis", 9.12, 0.30);
        Produto p3 = new Produto("Corracha", 3.00, 0.5);

        List<Produto> produtos = Arrays.asList(p, p2, p3);
        produtos.forEach(imprimir);
    }
}
