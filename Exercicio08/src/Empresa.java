public class Empresa {
    private final Funcionario[] cadastro = new Funcionario[10];

    public void cadastraFunc(Funcionario func){
        for(int c = 0; c < 10; c++){
            if(cadastro[c] == null) {
                if (c < 1 && func instanceof Gerente) {
                    cadastro[c] = func;
                    break;
                } else if (c < 3 && func instanceof Supervisor) {
                    cadastro[c] = func;
                    break;
                } else if (func instanceof Vendedor) {
                    cadastro[c] = func;
                    break;
                }
            }
        }
    }

    public void mostraCadastro() {
        for(int c = 0; c < 10; c++){
            if(cadastro[c] != null){
                System.out.println(cadastro[c].toString());
            }
        }
    }
}
