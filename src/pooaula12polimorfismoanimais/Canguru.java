package pooaula12polimorfismoanimais;
//@author Mari 
 
public class Canguru extends Mamifero{
    //Atibutos
    public String nome;
    //Metodos publicos
    public void usarBolsa(){
        System.out.println("Guardar o filhote na bolsa"); 
    }
    public void statusCanguru(){
        System.out.println(" ");
        System.out.println("******Canguru******\nNome: "+this.getNome());
        this.statusMamifero();
        System.out.println("");
    }
    //Metodos sobreposicao 
    @Override
    public void locomover() {
        System.out.println("Saltar");
    }
    //Metodos especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
