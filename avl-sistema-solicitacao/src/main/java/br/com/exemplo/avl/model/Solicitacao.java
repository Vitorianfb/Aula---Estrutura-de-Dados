package br.com.exemplo.avl.model;

public class Solicitacao {
    private int numero;
    private String solicitante;
    private String descricao;
    private Date dataSolicitacao;

    public Solicitacao(int numero, String solicitante, String descricao, Date dataSolicitacao) {
        this.numero = numero;
        this.solicitante = solicitante;
        this.descricao = descricao;
        this.dataSolicitacao = dataSolicitacao;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
}
