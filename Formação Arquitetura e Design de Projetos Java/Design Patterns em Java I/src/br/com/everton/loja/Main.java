package br.com.everton.loja;

import br.com.everton.loja.imposto.CalculadoraDeImpostos;
import br.com.everton.loja.imposto.TipoImposto;
import br.com.everton.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));

    }
}
