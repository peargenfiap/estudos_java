package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        aprovados.forEach(System.out::println);

        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);

    }
}
