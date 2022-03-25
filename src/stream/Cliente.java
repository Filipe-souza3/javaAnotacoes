package stream;

public class Cliente {
    private String nome;
    private boolean status;
    private String senha;
    private int pontos;



    public Cliente(String nome, boolean status, String senha, int pontos) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
 
}
