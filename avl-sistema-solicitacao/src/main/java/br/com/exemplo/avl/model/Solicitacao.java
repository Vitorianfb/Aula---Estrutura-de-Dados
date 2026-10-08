package br.com.exemplo.avl.model;

import java.time.LocalDateTime;

public class Solicitacao {
    private int numero;
    private String solicitante;
    private String descricao;
    private LocalDateTime dataAbertura;

    public Solicitacao(int numero, String solicitante, String descricao, LocalDateTime dataAbertura) {
        this.numero = numero;
        this.solicitante = solicitante;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
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

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
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

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
