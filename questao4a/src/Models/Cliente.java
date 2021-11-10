package Models;

public class Cliente {
    private long id;
    private String username;
    private String nome;
    private String sobrenome;

    public Cliente() {
    }

    public Cliente(long id, String username, String nome, String sobrenome) {
        this.id = id;
        this.username = username;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Cliente(String username, String nome, String sobrenome) {
        this.username = username;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}