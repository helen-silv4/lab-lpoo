import java.text.DecimalFormat;

public class Funcionario {
    private String nome;
    private Comissao comissao;
    private float renda;

    DecimalFormat df = new DecimalFormat("#0.00");

    public Funcionario(String nome) {
        this.nome = nome;
        this.comissao = new Comissao();
        this.renda = 1000.0f;
    }

    public String getNome() {
        return nome;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public float getRenda() {
        return renda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public float rendaTotal() {
        float rendaTotal = this.getRenda();
        if (comissao != null) {
            rendaTotal += comissao.getValorComissao();
        }
        return rendaTotal;
    }

    @Override
    public String toString() {
        return "--------- FUNCIONÁRIO --------" +
                "\nNome: " + this.getNome() +
                "\nComissão: R$" + df.format(this.getComissao().getValorComissao()) +
                "\nRenda Total: R$" + df.format(this.rendaTotal()) + "\n";
    }
}