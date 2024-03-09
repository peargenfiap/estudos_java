package Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    Aluno a1 = new Aluno("Pedro", 10.0);
    Aluno a2 = new Aluno("Giovana", 8.1);
    Aluno a3 = new Aluno("Rafaela", 5.2);
    Aluno a4 = new Aluno("Alexandre", 2.1);

    List<Aluno> alunoList = Arrays.asList(a1, a2, a3, a4);

    Predicate<Aluno> isAprovado = a -> a.nota >= 7;
    Function<Aluno, Double> apenasNota = a -> a.nota;
    BinaryOperator<Double> somatorio = (a, b) -> a + b;

    alunoList.stream()
    .filter(isAprovado)
    .map(apenasNota)
    .reduce(somatorio)
    .ifPresent(System.out::println);

}

class Aluno {
    final String nome;
    final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

}