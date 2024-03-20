public class Gerente extends Funcionario{
    @Override
    public float verificaComissao(){
        super.getComissao().setValorComissao(1500.0f);
        return super.getComissao().getValorComissao();
    }
}
