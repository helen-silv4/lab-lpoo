public class Funcionario {
    private double valorVenda;
    private double comissao;

    public Funcionario(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    protected double calculoComissao(){
        this.setComissao(this.getValorVenda() * 0.03);
        return this.getComissao();
    }
}
