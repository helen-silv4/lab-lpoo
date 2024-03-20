public class Gerente_geral extends Gerente{

    public Gerente_geral(double valorVenda) {
        super(valorVenda);
    }

    @Override
    protected double calculoComissao(){
        super.setComissao(super.getValorVenda() * 0.06);
        return super.getComissao();
    }
}
