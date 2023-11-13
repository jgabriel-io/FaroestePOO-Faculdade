package br.com.projetofaroeste;
public class Animal {
    private String especie;
    private String categoria;
    private String agressividade;
    private String velocidade;
    private String resistencia;
    private String localizacao;
    public Animal(String especie, String categoria, String agressividade, String velocidade, String resistencia, String localizacao) {
        this.especie = especie;
        this.categoria = categoria;
        this.agressividade = agressividade;
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.localizacao = localizacao;
    }
    public static Cavalo criarCavalo(String nome, String raca, String categoria, double saude, double energia, String velocidade, String resistencia, String pelagem, double vinculo) {
        return new Cavalo(nome, raca, categoria, saude, energia, velocidade, resistencia, pelagem, vinculo);
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getAgressividade() {
        return agressividade;
    }
    public void setAgressividade(String agressividade) {
        this.agressividade = agressividade;
    }
    public String getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }
    public String getResistencia() {
        return resistencia;
    }
    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void atacar() {
    }
    public void fugir() {
    }
    public void serCacado() {
    }
    public static Animal criarAnimal(String especie, String categoria, String agressividade, String velocidade, String resistencia, String localizacao) {
        return new Animal(especie, categoria, agressividade, velocidade, resistencia, localizacao);
    }
}
