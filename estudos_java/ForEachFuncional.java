import java.util.Arrays;
import java.util.List;

public class ForEachFuncional {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia");
		aprovados.forEach(System.out::println);
	}

	static void meuImprimit(String nome) {
		System.out.println("Oi, nome nome é " + nome);
	}

}