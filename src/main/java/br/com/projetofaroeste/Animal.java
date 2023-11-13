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

    public void atacar(Cowboy cowboy) {
        System.out.println();
        System.out.println("Um " + this.getEspecie() + " se aproxima de " + cowboy.getNome() + " para um iminente ataque.");
        double chanceAtaque = Math.random();
        double chanceVitoria = Math.random();

        if (chanceAtaque <= 0.5) {
            System.out.println("O " + this.getEspecie() + " investe contra " + cowboy.getNome() + " primeiro!");
        } else {
            System.out.println("Surpreendentemente, " + cowboy.getNome() + " ataca o " + this.getEspecie() + " primeiro!");
        }

        if (chanceVitoria <= 0.5) {
            System.out.println("O " + this.getEspecie() + " causa ferimentos em " + cowboy.getNome() + ".\n");
        } else {
            System.out.println("Com maestria, " + cowboy.getNome() + " abate o " + this.getEspecie() + ".\n");
        }
    }

    public void fugir() {
        System.out.println("O " + this.getEspecie() + "Fugiu");
    }


    public void serCacado(Cowboy cowboy) {
        System.out.println();
        System.out.println("O  caçador " + cowboy.getNome() + " rastreia silenciosamente um " + this.getEspecie() + ".");
        
        double chanceEncontrar = Math.random();
        double chanceAbate = Math.random();

        if (chanceEncontrar <= 0.5) {
            System.out.println("Em um momento de tensão, " + cowboy.getNome() + " se depara com o imponente " + this.getEspecie() + "!");
        } else {
            System.out.println("De repente, o " + this.getEspecie() + ", astuto como sempre, encontra o destemido " + cowboy.getNome() + "!");
        }

        if (chanceAbate <= 0.5) {
            System.out.println("Com destreza e precisão, " + cowboy.getNome() + " abate corajosamente o " + this.getEspecie() + " - uma vitória para o caçador!\n");
        } else {
            System.out.println("No calor da perseguição, " + cowboy.getNome() + " não consegue abater o astuto " + this.getEspecie() + ", que escapa habilmente - a presa permanece livre.\n");
        }
    }


    public static Animal criarAnimal(String especie, String categoria, String agressividade, String velocidade, String resistencia, String localizacao) {
        return new Animal(especie, categoria, agressividade, velocidade, resistencia, localizacao);
    }
}
