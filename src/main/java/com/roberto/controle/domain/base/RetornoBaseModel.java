package com.roberto.controle.domain.base;

public class RetornoBaseModel {
    private boolean sucesso;
    private String mensagem;
    private Object objeto;

    public RetornoBaseModel() {
        this.sucesso = false;
        this.mensagem = "O objeto de retorno não foi inicializado.";
        this.objeto = new Object();
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    @Override
    public boolean equals(Object o) {
        return this == o ? true : false;
    }

    @Override
    public String toString() {
        return  "Sucesso: "  + isSucesso() +
                "Mensagem: " + getMensagem() +
                "Objeto: "   + getObjeto();
    }
}
