public class Supervisor extends Funcionario{
    public Supervisor(String nome) {
        super(nome);
        super.getComissao().setValorComissao(600.0f);
    }

    @Override
    public String toString() {
        return "--------- SURPEVISOR ---------" +
                "\nNome: " + super.getNome() +
                "\nComissão: R$" + df.format(super.getComissao().getValorComissao()) +
                "\nRenda Total: R$" + df.format(super.rendaTotal()) + "\n";
    }
}
