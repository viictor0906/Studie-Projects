package Studies.POO_Guanabara.Aula04;

public class pen_class_special {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public pen_class_special(String m, String c, float p) {
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public String getModelo() { 
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() { 
        return this.ponta;
    }

    public void setPonta(float p) { //está dizendo que o parâmetro de set ponta é a letra P e ela é float;
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.getModelo());//puxa modelo pelo "get", assim adicionando uma camada de segurnça.
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada? " + this.tampada);
    }
}
