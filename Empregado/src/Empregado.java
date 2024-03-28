import java.text.DecimalFormat;

public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;
    private static int totalEmpregados = 0;

    DecimalFormat df = new DecimalFormat("#0.00");

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        totalEmpregados++;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public int getTotalEmpregados() {
        return totalEmpregados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTotalEmpregados(int totalEmpregados) {
        this.totalEmpregados = totalEmpregados;
    }

    public abstract double calculaPagamento();

    public void imprimeCheque(){
        System.out.println("Salário: R$" + df.format(this.salario));
    }

    public void imprimeDados(){
        System.out.println("\nNome: " + this.nome +
                           "\nSobrenome: " +  this.sobrenome);
        imprimeCheque();
    }
}