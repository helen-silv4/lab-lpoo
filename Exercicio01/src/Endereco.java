public class Endereco {
    private Logradouro logradouro;
    private int numero;
    private String complemento;
    private int cep;
    private String cidade;
    private String estado;

    public Endereco(Logradouro logradouro, int numero, String complemento, int cep, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado.toUpperCase();
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return logradouro +
                ", numero: " + this.getNumero() +
                ", complemento: " + this.getComplemento() +
                ", cep: " + this.getCep() +
                ", cidade: " + this.getCidade() +
                ", estado: " + this.getEstado();
    }
}
