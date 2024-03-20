public class Zoologico {
    private final Animal[] jaulas = new Animal[10] ;

    public void colocaAnimal(Animal animal){
        for(int c = 0; c < 10; c++){
            if(jaulas[c] == null){
                jaulas[c] = animal;
                break;
            }
        }
    }

    public boolean verificaComportamento(Animal animal){
        try {
            animal.getClass().getMethod("correr");  // verfica se 'animal' possui o método correr
            return true;
        } catch (NoSuchMethodException e) { // NoSuchMethodException é uma exceção se a classe não possuir o método correr
            System.out.print("Comportamento não encontrado: " + e.getMessage());
            return false;
        }
    }

    public void percorreJaula() {
        for(int c = 0; c < 10; c++){
            if(jaulas[c] != null){
                System.out.print("Som do animal: ");
                jaulas[c].emitirSom();
                if(verificaComportamento(jaulas[c])){ // 'jaulas[c]' tem o método correr?
                    System.out.print("Comportamento do animal: ");
                    jaulas[c].correr();
                }
            }
        }
    }
}