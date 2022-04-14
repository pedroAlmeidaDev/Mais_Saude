
package Model;


public class Exercicio {
    
    private Integer id;
    private String nome;
    private Integer serie;
    private Integer repet;
    private String partCorpo;

    public Exercicio() {
    }

    public Exercicio(String nome, Integer serie, Integer repet, String partCorpo) {
        this.nome = nome;
        this.serie = serie;
        this.repet = repet;
        this.partCorpo = partCorpo;
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

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Integer getRepet() {
        return repet;
    }

    public void setRepet(Integer repet) {
        this.repet = repet;
    }

    public String getPartCorpo() {
        return partCorpo;
    }

    public void setPartCorpo(String partCorpo) {
        this.partCorpo = partCorpo;
    }
    
    
}
