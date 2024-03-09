package MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro", 10.0);
        Aluno a2 = new Aluno("Giovana", 8.1);
        Aluno a3 = new Aluno("Rafaela", 5.2);
        Aluno a4 = new Aluno("Alexandre", 2.1);

        List<Aluno> alunoList = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        Comparator<Aluno> piorrNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        System.out.println(alunoList.stream().max(melhorNota).get());
        System.out.println(alunoList.stream().min(melhorNota).get());
        System.out.println(alunoList.stream().max(piorrNota).get());

    }
}

class Aluno {
    final String nome;
    final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota=" + nota + "]";
    }
    
}