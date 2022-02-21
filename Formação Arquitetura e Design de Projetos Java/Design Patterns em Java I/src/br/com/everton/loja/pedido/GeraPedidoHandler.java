package br.com.everton.loja.pedido;

import br.com.everton.loja.orcamento.Orcamento;
import br.com.everton.loja.pedido.acao.EnviarEmailPedido;
import br.com.everton.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //Construtor com injeção de dependências: repository, service etc.

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);

        EnviarEmailPedido enviarEmailPedido = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvarPedidoNoBancoDeDados = new SalvarPedidoNoBancoDeDados();

        enviarEmailPedido.executar(pedido);
        salvarPedidoNoBancoDeDados.executar(pedido);
    }
}
