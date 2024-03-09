package Filter.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.1, 4);
        Produto p2 = new Produto("Notebook", 2324.9, 5);
        Produto p3 = new Produto("Whisky", 187.80, 2);
        Produto p4 = new Produto("iPhone", 4159.99, 3);

        List<Produto> produtoList = Arrays.asList(p1, p2, p3, p4);

        Predicate<Produto> isGoodGrade = p -> p.nota > 3;
        Predicate<Produto> isExpansive = p -> p.preco < 1000;

        produtoList.stream()
        .filter(isGoodGrade)
        .filter(isExpansive)
        .map(a -> "O produto " + a.nome + " tem uma boa avaliação e preço!")
        .forEach(System.out::println);

    }
}

class Produto {
    final String nome;
    final double preco;
    final Integer nota;

    public Produto(String nome, double preco, Integer nota) {
        this.nome = nome;
        this.preco = preco;
        this.nota = nota;
    }

}