public class EmpregadoHorista extends Empregado{
    private int horas;

    public EmpregadoHorista(String nome, String sobrenome, double salario, int horas) {
        super(nome, sobrenome, salario);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calculaPagamento() {
        return super.getSalario() * this.horas;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + super.getNome() +
                           "\nSobrenome: " +  super.getSobrenome() +
                           "\nSalário: R$" + df.format(calculaPagamento()));
    }
}