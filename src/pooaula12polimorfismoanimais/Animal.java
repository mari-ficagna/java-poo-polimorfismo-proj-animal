package pooaula12polimorfismoanimais;
//@author Mari 
 
public abstract class Animal {
    //Classe progenitora (raíz)
    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;
    //Metodos publicos abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    //Metodos publicos
    public void statusAnimal(){
        System.out.println("Peso: "+this.getPeso()+"\nIdade: "+this.getIdade()+" anos \nQtde membros: "
                            +this.getMembros());
    }
    //Metodos Especiais
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
}
