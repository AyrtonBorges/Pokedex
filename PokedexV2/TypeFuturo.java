package Pokedexs.PokedexV2;

public class TypeFuturo {
    String nome;
    String detalhes;
    String fraquezas[] = new String[18];
    String resistencias[] = new String[18];
    String imunidades[] = new String[18];

    public TypeFuturo(String nome, String detalhes, String[] fraquezas, String[] resistencias, String[] imunidades) {
        this.nome = nome;
        this.detalhes = detalhes;
        this.fraquezas = fraquezas;
        this.resistencias = resistencias;
        this.imunidades = imunidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String[] getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(String[] fraquezas) {
        this.fraquezas = fraquezas;
    }

    public String[] getResistencias() {
        return resistencias;
    }

    public void setResistencias(String[] resistencias) {
        this.resistencias = resistencias;
    }

    public String[] getImunidades() {
        return imunidades;
    }

    public void setImunidades(String[] imunidades) {
        this.imunidades = imunidades;
    }

    
}
