public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("iiirrrrí rilinchin");
    }

    @Override
    public void correr(){
        System.out.println("Galop-galop-galop");
    }
}
