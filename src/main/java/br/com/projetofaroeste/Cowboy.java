package br.com.projetofaroeste;

import java.util.List;
public class Cowboy {
    private final String nome;
    private final int idade;
    private final double saude;
    private final double energia;
    private final Inventario inventario;
    private String cavalo;
    private String gangue;
    public Cowboy(String nome, int idade, double saude, double energia, String cavalo, String gangue) {
        this.nome = nome;
        this.idade = idade;
        this.saude = saude;
        this.energia = energia;
        this.inventario = new Inventario();
        this.cavalo = cavalo;
        this.gangue = gangue;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getSaude() {
        return saude;
    }
    public double getEnergia() {
        return energia;
    }
    public String getCavalo() {
        return cavalo;
    }
    void setCavalo(String cavalo) {
        this.cavalo = cavalo;
    }
    public String getGangue() {
        return gangue;
    }
    public void setGangue(String gangue) {
        this.gangue = gangue;
    }
    public void adicionarItemAoInventario(String item) {
        this.inventario.adicionarItem(item);
    }
    public List<String> listarItensDoInventario() {
        return this.inventario.listarItens();
    }
    public void removerItemDoInventario(String item) {
        this.inventario.removerItem(item);
    }
    public void atirar() {
        double chanceAcerto = Math.random();

        if (chanceAcerto <= 0.5) {
            System.out.println(getNome() + " disparou contra o inimigo e acertou o tiro!\n");
        } else {
            System.out.println(getNome() + " disparou contra o inimigo e errou o tiro!\n");
        }
    }
    public void duelar(Cowboy cowboy) {
        System.out.println("Ao entardecer, a luz dourada do sol lança sombras na rua empoeirada, onde " + this.getNome() + " e " + cowboy.getNome() + " se encontram para um confronto.");
        double chanceAtaque = Math.random();
        double chanceVitoria = Math.random();

        if (chanceAtaque <= 0.5) {
            System.out.println(this.getNome() + " ataca primeiro contra " + cowboy.getNome() + "!");
        } else {
            System.out.println(cowboy.getNome() + " ataca primeiro contra " + this.getNome() + "!");
        }

        if (chanceVitoria <= 0.5) {
            System.out.println(this.getNome() + " vence o duelo, causando baixas em " + cowboy.getNome() + ".\n");
        } else {
            System.out.println(cowboy.getNome() + " vence o duelo, causando baixas em " + this.getNome() + ".\n");
        }
    }
    public static Cowboy criarCowboy(String nome, int idade, double saude, double energia, String cavalo, String gangue) {
        return new Cowboy(nome, idade, saude, energia, cavalo, gangue);
    }
}
