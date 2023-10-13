package Pokedexs.PokedexV2;

public class PokemonEntry {
    private String categoria;
    private double peso;
    private double altura;
    private String descricao;
    private boolean capturado;

    public PokemonEntry(String categoria, double peso, double altura, String descricao) {
        this.categoria = categoria;
        this.peso = peso;
        this.altura = altura;
        this.descricao = descricao;
        this.capturado = false;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isCapturado() {
        return capturado;
    }
    public void setCapturado() {
        this.capturado = true;
    }
}
