public class Vendedor extends Funcionario{
    @Override
    public float verificaComissao(){
        super.getComissao().setValorComissao(250.0f);
        return super.getComissao().getValorComissao();
    }
}
