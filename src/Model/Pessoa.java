
package Model;


public class Pessoa {
    
    private Integer id;
    private String nome;
    private Integer idade;
    private Double altura;
    private Double peso;
    private Double imc;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, Double altura, Double peso, Double imc) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getImc() {
        return imc;
    }

    
    public void calcImc(Double peso, Double altura){
        imc += peso / (altura * altura);
    }

}
