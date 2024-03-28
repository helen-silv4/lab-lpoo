public class EmpregadoComissionado extends Empregado{
    private double comissao;
    private int unidadesVendidas;

    public EmpregadoComissionado(String nome, String sobrenome, double salario, double comissao) {
        super(nome, sobrenome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }
    @Override
    public double calculaPagamento() {
        return super.getSalario() + (this.comissao * this.unidadesVendidas);
    }

    public void adicionaVendas(int unidadesVendidas){
        for(int i = 0; i < unidadesVendidas; i++){
            this.unidadesVendidas++;
        }
    }

    public void zerarVendas(){
        this.setUnidadesVendidas(0);
    }

    @Override
    public void imprimeCheque(){
        System.out.print("Salário: R$" + df.format(calculaPagamento()));
    }

    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("\nComissão: R$" + df.format(this.comissao) +
                           "\nUnidades vendidas: " + this.unidadesVendidas);
    }
}