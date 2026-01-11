public class Cliente {

    @Visible
    private int id;

    @Visible
    private String nome;
    private String CPF;
    private String email;

    public Cliente(int id, String nome, String CPF, String email) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
