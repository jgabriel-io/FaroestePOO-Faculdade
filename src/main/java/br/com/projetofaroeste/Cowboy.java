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
            System.out.println(getNome() + " disparou contra o inimigo e acertou o tiro! - o inimigo está ferido\n");
        } else {
            System.out.println(getNome() + " disparou contra o inimigo e errou o tiro! - o inimigo não foi atingido\n");
        }
    }
    public void duelar(Cowboy cowboy) {
        System.out.println("À medida que o sol se põe, lançando uma luz dourada sobre a rua empoeirada, " + this.getNome() + " e " + cowboy.getNome() + " se enfrentam em um duelo épico.");
        double chanceAtaque = Math.random();
        double chanceVitoria = Math.random();

        if (chanceAtaque <= 0.5) {
            System.out.println("Num movimento rápido, " + this.getNome() + " ataca primeiro contra " + cowboy.getNome() + "!");
        } else {
            System.out.println("Cowboy" + cowboy.getNome() + " demonstra agilidade e ataca primeiro contra " + this.getNome() + "!");
        }

        if (chanceVitoria <= 0.5) {
            System.out.println("Em uma reviravolta surpreendente, " + this.getNome() + " emerge vitorioso sobre " + cowboy.getNome() + " no duelo. - o oponente foi morto\n");
        } else {
            System.out.println("Com habilidade notável, " + cowboy.getNome() + " vence o duelo, derrotando " + this.getNome() + ". - o oponente foi morto\n");
        }
    }
    public static Cowboy criarCowboy(String nome, int idade, double saude, double energia, String cavalo, String gangue) {
        return new Cowboy(nome, idade, saude, energia, cavalo, gangue);
    }
}
