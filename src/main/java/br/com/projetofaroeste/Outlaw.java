package br.com.projetofaroeste;
import java.util.Random;
class Outlaw extends Cowboy {
    public Outlaw(String nome, int idade, double saude, double energia, String cavalo, String gangue) {
        super(nome, idade, saude, energia, cavalo, gangue);
    }
    public void roubar() {
        System.out.println();
        Random random = new Random();
        double chanceAcao = random.nextDouble();
        double chanceSucesso = random.nextDouble();

        if (chanceAcao <= 0.3) {
            System.out.println(getNome() + " está tentando roubar uma casa!");
        } else if (chanceAcao <= 0.6) {
            System.out.println(getNome() + " está tentando roubar uma carruagem!");
        } else {
            System.out.println(getNome() + " está tentando roubar um trem!");
        }

        if (chanceSucesso <= 0.5) {
            System.out.println("O assalto foi realizado com sucesso, resultando em uma considerável soma de dinheiro.\n");
        } else {
            System.out.println("O assalto foi malsucedido, conseguindo apenas roubar alguns pertences das pessoas presentes no momento.\n");
        }
    }
    public void roubarBanco() {
        System.out.println(getNome() + " está planejando roubar um banco!");
        Random random = new Random();
        double chance = random.nextDouble();

        if (chance <= 0.2) {
            System.out.println("Com muita sorte, o assalto foi executado com êxito, resultando em uma significativa quantidade de dinheiro.\n");
        } else {
            System.out.println("O assalto foi malsucedido. Parece que " + getNome() + " não estava preparado para essa empreitada.\n");
        }
    }
    public void duelar(Lawman lawman) {
        super.duelar(lawman);
    }
    public static Outlaw criarOutlaw(String nome, int idade, double saude, double energia, String cavalo, String gangue) {
        return new Outlaw(nome, idade, saude, energia, cavalo, gangue);
    }
}
