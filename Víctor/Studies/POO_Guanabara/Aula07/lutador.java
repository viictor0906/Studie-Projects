package Studies.POO_Guanabara.Aula07;

public class lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //método construtor
    public lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    //métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if(this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if(this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if(this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    //métodos
    public void apresentar(){
        System.out.println("-------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println(this.getIdade() + " Anos de idade");
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println(this.getAltura() + "M de altura");
        System.out.println("Num. de Vitórias: " + this.getVitorias());
        System.out.println("Num. de Derrotas: " + this.getDerrotas());
        System.out.println("Num. de Empates: " + this.getEmpates());
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + "vitórias");
        System.out.println(this.getDerrotas() + "derrotas");
        System.out.println(this.getEmpates() + "empates");
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
}
