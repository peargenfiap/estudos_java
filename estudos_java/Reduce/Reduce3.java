package Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro", 10.0);
        Aluno a2 = new Aluno("Giovana", 8.1);
        Aluno a3 = new Aluno("Rafaela", 5.2);
        Aluno a4 = new Aluno("Alexandre", 2.1);

        List<Aluno> alunoList = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> isAprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.combinar(m1, m2);

        Media media = alunoList.stream()
        .filter(isAprovado)
        .map(apenasNota)
        .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("A média da turma é " + media.getValor());

    }
}
