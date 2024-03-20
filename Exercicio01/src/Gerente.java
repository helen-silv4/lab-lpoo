public class Gerente extends Funcionario{
    private String area;

    public Gerente(String nome, Data data, Endereco endereco, float salario, String area) {
        super(nome, data, endereco, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public float calculaImposto(){
        return this.getSalario() * 0.05f;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + super.getNome() +
                "\nNascimento: " + super.getData() +
                "\nEndereço: " + super.getEndereco() +
                "\nSalário: R$" + df.format(super.getSalario()) +
                "\nÁrea: " + this.getArea());
    }

}
