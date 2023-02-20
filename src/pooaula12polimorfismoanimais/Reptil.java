package pooaula12polimorfismoanimais;
//@author Mari 
 
public class Reptil extends Animal{
    //Atributos
    private String corEscama;
    //Metodos Publicos
    public void statusReptil(){
        this.statusAnimal();
        System.out.println("Cor escama: "+this.getCorEscama());
    }
    //Metodos sobreposicao
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil!");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais... ");
    }
    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }
    //Metodos especiais
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
