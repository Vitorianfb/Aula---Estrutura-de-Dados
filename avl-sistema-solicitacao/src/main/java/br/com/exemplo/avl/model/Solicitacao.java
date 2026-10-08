package br.com.exemplo.avl.model;

import java.time.LocalDateTime;

public class Solicitacao {
    private int numero;
    private String solicitante;
    private String descricao;
    private LocalDateTime dataSolicitacao;

    public Solicitacao(int numero, String solicitante, String descricao, LocalDateTime dataSolicitacao) {
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

    public LocalDateTime getDataSolicitacao() {
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

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
}
