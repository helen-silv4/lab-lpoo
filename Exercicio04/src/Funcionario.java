import java.text.DecimalFormat;
public class Funcionario {
    private String nome;
    private int codigo;
    private Formacao formacao;
    private float rendaBasica;
    DecimalFormat df = new DecimalFormat("#0.00");

    public Funcionario(String nome, int codigo, Formacao formacao) {
        this.nome = nome;
        this.codigo = codigo;
        this.formacao = formacao;
        this.rendaBasica = 1000.0f;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public float getRendaBasica() {
        return rendaBasica;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public void setRendaBasica(float rendaBasica) {
        this.rendaBasica = rendaBasica;
    }

    @Override
    public String toString() {
        return "Formação " + this.getFormacao() +
                "\nRenda : R$" + df.format(this.getRendaBasica()) +
                "\n-------------------------------------------------";
    }
}
