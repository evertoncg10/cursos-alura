package br.com.everton.loja;

import br.com.everton.loja.imposto.CalculadoraDeImpostos;
import br.com.everton.loja.imposto.ICMS;
import br.com.everton.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamento1));

        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        System.out.println(calculadora.calcular(orcamento2));

    }
}
