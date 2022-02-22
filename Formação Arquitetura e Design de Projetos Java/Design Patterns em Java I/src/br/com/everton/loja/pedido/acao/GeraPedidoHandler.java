package br.com.everton.loja.pedido.acao;

import br.com.everton.loja.orcamento.Orcamento;
import br.com.everton.loja.pedido.GeraPedido;
import br.com.everton.loja.pedido.Pedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
