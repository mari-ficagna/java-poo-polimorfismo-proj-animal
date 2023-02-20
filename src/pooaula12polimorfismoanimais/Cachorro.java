package pooaula12polimorfismoanimais;
//@author Mari 
 
public class Cachorro extends Mamifero {
    //Atributos
    public String nome;
    public String raça;
    //Metodos publicos
    public void enterrarOsso(){
        System.out.println("Enterrando o osso...");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo...");
    }
    public void statusCachorro(){
        System.out.println(" ");
        System.out.println("******Cachorro******\nNome: "+this.getNome()+"\nRaça: "+this.getRaça());
        this.statusMamifero();
        System.out.println("");
    }
    //Metodos sobreposicao
    @Override
    public void emitirSom() {
        System.out.println("Au au au au au au au au au");
        //super.emitirSom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    //Metodos especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaça() {
        return raça;
    }
    public void setRaça(String raça) {
        this.raça = raça;
    }
}
