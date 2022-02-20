package br.com.everton.loja;

import br.com.everton.loja.imposto.CalculadoraDeImpostos;
import br.com.everton.loja.imposto.ICMS;
import br.com.everton.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));

    }
}
