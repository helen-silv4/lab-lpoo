public class Vendedor extends Funcionario{
    public Vendedor(String nome) {
        super(nome);
        super.getComissao().setValorComissao(250.0f);
    }

    @Override
    public String toString() {
        return "--------- VENDEDOR ---------" +
                "\nNome: " + super.getNome() +
                "\nComissão: R$" + df.format(super.getComissao().getValorComissao()) +
                "\nRenda Total: R$" + df.format(super.rendaTotal()) + "\n";
    }
}
