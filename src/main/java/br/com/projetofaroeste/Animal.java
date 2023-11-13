package br.com.projetofaroeste;
public class Animal {
    private final String especie;
    private final String categoria;
    private final String agressividade;
    private final String velocidade;
    private final String resistencia;
    private final String localizacao;
    public Animal(String especie, String categoria, String agressividade, String velocidade, String resistencia, String localizacao) {
        this.especie = especie;
        this.categoria = categoria;
        this.agressividade = agressividade;
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.localizacao = localizacao;
    }

    public String getEspecie() {
        return especie;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getAgressividade() {
        return agressividade;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public String getResistencia() {
        return resistencia;
    }

    public String getLocalizacao() {
        return localizacao;
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
            System.out.println("O " + this.getEspecie() + " causa ferimentos em " + cowboy.getNome() + " mas o cowboy consegue realizra o abate. - A presa foi abatida\n");
        } else {
            System.out.println("Com maestria, " + cowboy.getNome() + " abate o " + this.getEspecie() + ". - A presa foi abatida\n");
        }
    }
    public void serCacado(Cowboy cowboy) {
        System.out.println("O caçador " + cowboy.getNome() + " rastreia silenciosamente um " + this.getEspecie() + ".");

        double chanceEncontrar = Math.random();
        double chanceAbate = Math.random();

        if (chanceEncontrar <= 0.5) {
            System.out.println("Em um momento de tensão, " + cowboy.getNome() + " se depara com o imponente " + this.getEspecie() + "!");
        } else {
            System.out.println("De repente, o " + this.getEspecie() + ", astuto como sempre, encontra o destemido " + cowboy.getNome() + "!");
        }

        if (chanceAbate <= 0.5) {
            System.out.println("Com destreza e precisão, " + cowboy.getNome() + " abate corajosamente o " + this.getEspecie() + " - Uma vitória para o caçador!\n");
        } else {
            System.out.println("No calor da perseguição, " + cowboy.getNome() + " não consegue abater o astuto " + this.getEspecie() + ", que escapa habilmente - A presa permanece livre.\n");
        }
    }
    public void serEsfolado(Cowboy cowboy) {
        System.out.println("O experiente caçador " + cowboy.getNome() + " habilmente esfola o " + this.getEspecie() + ".");
        double chanceEsfolar = Math.random();
        double chanceRecompensa = Math.random();

        if (chanceEsfolar <= 0.5) {
            System.out.println("Com perícia, " + cowboy.getNome() + " esfola o " + this.getEspecie() + " preservando a preciosa pele!");
            System.out.println("Uma grande quantidade de recursos é extraído do " + this.getEspecie() + " por " + cowboy.getNome() + "!");
        } else {
            System.out.println("Infelizmente, a inexperiência de " + cowboy.getNome() + " ao esfolar o " + this.getEspecie() + " resulta em danos à valiosa pele.");
            System.out.println("Apesar dos desafios, " + cowboy.getNome() + " obtém uma modesta quantidade de recursos do " + this.getEspecie() + ".");
        }
        System.out.println();
    }

    public static Animal criarAnimal(String especie, String categoria, String agressividade, String velocidade, String resistencia, String localizacao) {
        return new Animal(especie, categoria, agressividade, velocidade, resistencia, localizacao);
    }
}
