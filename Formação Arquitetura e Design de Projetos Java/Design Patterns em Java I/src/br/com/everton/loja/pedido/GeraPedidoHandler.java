package br.com.everton.loja.pedido;

import br.com.everton.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //Construtor com injeção de dependências: repository, service etc.

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);

        System.out.println("Salvar pedido no Banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
