import java.text.DecimalFormat;

public class Funcionario extends Pessoa {
    private float salario;
    DecimalFormat df = new DecimalFormat("#0.00");

    public Funcionario(String nome, Data data, Endereco endereco, float salario) {
        super(nome, data, endereco);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calculaImposto(){
        return this.getSalario() * 0.03f;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + super.getNome() +
                "\nNascimento: " + super.getData() +
                "\nEndereço: " + super.getEndereco() +
                "\nSalário: R$" + df.format(this.getSalario()));
    }
}
