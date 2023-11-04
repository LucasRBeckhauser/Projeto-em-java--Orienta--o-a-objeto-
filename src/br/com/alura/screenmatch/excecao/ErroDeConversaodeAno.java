package br.com.alura.screenmatch.excecao;

public class ErroDeConversaodeAno extends RuntimeException {

    private String mensagem;
    public ErroDeConversaodeAno(String s) {
    this.mensagem = mensagem;

    }

    @Override
    public String getMessage() {
    return this.mensagem;

    }
}
