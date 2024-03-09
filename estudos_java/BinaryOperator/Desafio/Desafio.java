package BinaryOperator.Desafio;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import Predicate.Produto;

public class Desafio {

    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> calcularPrecoReal = prod -> prod.getPreco() * (1 - prod.getDesconto());

        UnaryOperator<Double> calcularPrecoMunicipal = preco -> preco >= 2500 ? preco * (1 - 0.085) : preco;

        UnaryOperator<Double> precoFinalComFrete = preco -> calcularPrecoReal.andThen(calcularPrecoMunicipal)
                .apply(p) >= 3000 ? preco + 100 : preco + 50;
        
        UnaryOperator<Double> arredondar = preco -> Math.round(preco * 100.0) / 100.0;

        Function<Double, String> formatar = preco -> String.format("R$ %.2f", preco).replace('.', ',');

        String preco = calcularPrecoReal
                        .andThen(calcularPrecoMunicipal)
                        .andThen(precoFinalComFrete)
                        .andThen(arredondar)
                        .andThen(formatar)
                        .apply(p);
        System.out.println(preco);



    }
}
