package br.com.alura.rh.model;

public class Terceirizado {
    private String empresa;
    private DadosPessoais dadosPessoais;

    public Terceirizado(String empresa, DadosPessoais dadosPessoais) {
        this.empresa = empresa;
        this.dadosPessoais = dadosPessoais;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
}
