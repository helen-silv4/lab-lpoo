public class Supervisor extends Funcionario{
    @Override
    public float verificaComissao(){
        super.getComissao().setValorComissao(600.0f);
        return super.getComissao().getValorComissao();
    }
}
