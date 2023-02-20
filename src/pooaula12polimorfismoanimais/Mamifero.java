package pooaula12polimorfismoanimais;
// @author Mari 
 
public class Mamifero extends Animal {
    //Atributos
    private String corPelo;
    //Metodos publicos
    public void statusMamifero(){
        this.statusAnimal();
        System.out.println("Cor pelo: "+this.getCorPelo());
    }
    //Metodos sobreposicao
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero!");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }
    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
