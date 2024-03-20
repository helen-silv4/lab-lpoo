public class Gerente_regional extends Gerente{

    public Gerente_regional(double valorVenda) {
        super(valorVenda);
    }

    @Override
    protected double calculoComissao(){
        super.setComissao((super.getValorVenda() * 0.06) * 1.5);
        return super.getComissao();
    }
}
