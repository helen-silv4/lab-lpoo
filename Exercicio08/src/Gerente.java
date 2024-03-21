public class Gerente extends Funcionario{

    public Gerente(String nome) {
        super(nome);
        super.getComissao().setValorComissao(1500.0f);
    }

    @Override
    public String toString() {
        return "---------- GERENTE -----------" +
                "\nNome: " + super.getNome() +
                "\nComissão: R$" + df.format(super.getComissao().getValorComissao()) +
                "\nRenda Total: R$" + df.format(super.rendaTotal()) + "\n";
    }
}
