package Excecao;

public class CheckadaVsNaoCheckada {
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }

    // Não checkada.
    static void geraErro1() {
       throw new RuntimeException("Ocorreu um erro. 01");
    }

    // Não checkada - java força a declarar que lança exceçõo.
    static void geraErro2() throws Exception {
         throw new Exception("Ocorreu um erro. 02");
    }
}
