package br.com.projetofaroeste;

import java.util.List;
public class Cavalo {
    private final String nome;
    private final String raca;
    private final String categoria;
    private final double saude;
    private final double energia;
    private final String velocidade;
    private final String resistencia;
    private final String pelagem;
    private final double vinculo;
    private final Inventario inventarioCavalo;
    public Cowboy cowboy;
    
    public Cavalo(String nome, String raca, String categoria, double saude, double energia, String velocidade, String resistencia, String pelagem, double vinculo) {
        this.nome = nome;
        this.raca = raca;
        this.categoria = categoria;
        this.saude = saude;
        this.energia = energia;
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.pelagem = pelagem;
        this.vinculo = vinculo;
        this.inventarioCavalo = new Inventario();
        this.cowboy = null;
    }
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }



    public double getSaude() {
        return saude;
    }

    public double getEnergia() {
        return energia;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public String getResistencia() {
        return resistencia;
    }

    public String getPelagem() {
        return pelagem;
    }

    public double getVinculo() {
        return vinculo;
    }

    public Cowboy getDonoCavalo() {
        return cowboy;
    }

    public void setDonoCavalo(Cowboy donoCavalo) {
        this.cowboy = donoCavalo;
    }

    public void adicionarItemAoInventario(String item) {
        this.inventarioCavalo.adicionarItem(item);
    }

    public void removerItemDoInventario(String item) {
        this.inventarioCavalo.removerItem(item);
    }

    public List<String> listarItensDoCavalo() {
        return this.inventarioCavalo.listarItens();
    }

    public void trotar() {
        if (cowboy != null) {
            System.out.println(cowboy.getNome() + " está trotando com o cavalo " + nome + ".");
        } else {
            System.out.println("O cavalo " + nome + " está trotando.");
        }
    }

    public void correr() {
        if (cowboy != null) {
            System.out.println(cowboy.getNome() + " está cavalgando no cavalo " + nome + ".");
        } else {
            System.out.println("O cavalo " + nome + " está correndo livremente.");
        }
    }
    
    public void serCuidado() {
        if (cowboy != null) {
            System.out.println(cowboy.getNome() + " está cuidando do cavalo " + nome + ".");
        } else {
            System.out.println("O cavalo " + nome + " está sendo cuidado por alguém.");
        }
    }

    public void serMontado() {
        if (cowboy != null) {
            System.out.println(cowboy.getNome() + " montou no cavalo " + nome + ".");
        } else {
            System.out.println("Alguém montou no cavalo " + nome + ".");
        }
    }

    public static Cavalo criarCavalo(String nome, String raca, String categoria, double saude, double energia, String velocidade, String resistencia, String pelagem, double vinculo) {
        return new Cavalo(nome, raca, categoria, saude, energia, velocidade, resistencia, pelagem, vinculo);
    }

    public String getCategoria() {
        return categoria;
    }
}