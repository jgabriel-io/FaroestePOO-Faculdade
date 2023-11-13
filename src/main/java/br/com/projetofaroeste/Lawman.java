package br.com.projetofaroeste;
class Lawman extends Cowboy {
    private String cidade;
    public Lawman(String nome, int idade, double saude, double energia, String cavalo, String cidade) {
        super(nome, idade, saude, energia, cavalo, cidade);
        this.cidade = cidade;
    }
    public String getCidade() {
        return cidade;
    }
    @Override
    public void setGangue(String cidade) {
        this.cidade = cidade;
    }
    public void prenderOutlaw(Outlaw outlaw) {
        System.out.println(getNome() + " e membros de " + cidade + " estão tentando prender " + outlaw.getNome() + ".");
        double chancePrender = Math.random();

        if (chancePrender <= 0.5) {
            System.out.println(outlaw.getNome() + " foi preso!\n");
        } else {
            System.out.println(outlaw.getNome() + " escapou da prisão!\n");
        }
    }
    public static Lawman criarLawman(String nome, int idade, double saude, double energia, String cavalo, String cidade) {
        return new Lawman(nome, idade, saude, energia, cavalo, cidade);
    }
}
