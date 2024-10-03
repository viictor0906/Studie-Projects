package Studies.POO_Guanabara.Pen;

public class Caneta {
    public String modelo; //string: caractere
    public String cor; //string: carctere
    private float ponta; //float: real
    private int carga; //int: inteiro
    private boolean tampada; //boolean:false or true

    public void status() { //'void': vazio, não retorna valor definido.
    //System.out.println(); printa na tela oque eu defino.
        System.out.println("Uma caneta de cor " + this.cor); //cor da caneta;
        System.out.println("Ponta: " + this.ponta); //a espessura da ponta;
        System.out.println("Modelo: " + this.modelo); //o modelo da mesma;
        System.out.println("Carga: " + this.carga); //carga
        System.out.println("Está tampada? " + this.tampada); //se está ou não tampada;
    }

    public void valor_carga() { //esse método é publico, mas chama um atributo privado, logo, o atributo pode ser modificado somente pela própria classe, mas não pela configuração do objeto;
        this.carga = 80; //o atributo 'carga' é pŕivado, mas está dentro de uma relação publica(valor_carga), ou seja, o objeto não pode mexer no atributo, mas o método dentro da classe pode;
    }

    public void rabiscar() { //se a caneta estiver tampada, logo, não posso rabiscar. Em caso contrário, rabisca algo.
        if (this.tampada == true) { //'=':recebe '==':igual.
            System.out.println("ERRO! Não posso rabiscar");
        } else{
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar() {    
        this.tampada = true; //"This" é uma referêcia ao objeto que chamou o método(nesse caso, o 'c1');
    }

    public void destampar() {
        this.tampada = false;
    }
}
