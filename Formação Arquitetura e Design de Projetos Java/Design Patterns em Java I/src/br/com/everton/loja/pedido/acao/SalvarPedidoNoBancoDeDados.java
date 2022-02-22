package br.com.everton.loja.pedido.acao;

import br.com.everton.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando Pedido no banco de dados.");
    }

}
