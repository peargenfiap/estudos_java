package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro", 10.0);
        Aluno a2 = new Aluno("Giovana", 8.1);
        Aluno a3 = new Aluno("Rafaela", 5.2);
        Aluno a4 = new Aluno("Alexandre", 2.1);
        Aluno a5 = new Aluno("Felipe", 5.9);

        
        Predicate<Aluno> isAprovado = a -> a.nota > 7;
        List<Aluno> alunoList = Arrays.asList(a1, a2, a3, a4, a5);
        alunoList.stream()
        .filter(isAprovado)
        .map(a -> "Parabéns " + a.nome)
        .forEach(System.out::println);
    }
}

class Aluno {
    final String nome;
    final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

}