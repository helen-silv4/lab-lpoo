public abstract class Pessoa {
    private String nome;
    private Data data;
    private Endereco endereco;

    public Pessoa(String nome, Data data, Endereco endereco) {
        this.nome = nome;
        this.data = data;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Data getData() {
        return data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract void imprimirDados();
}
