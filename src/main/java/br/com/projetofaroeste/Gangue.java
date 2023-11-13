package br.com.projetofaroeste;

import java.util.ArrayList;
import java.util.List;
public class Gangue {
    private final String nomeGangue;
    private final String lider;
    private final boolean agressividade;
    private final List<Cowboy> membros;
    public Gangue(String nomeGangue, String lider, boolean agressividade) {
        this.nomeGangue = nomeGangue;
        this.lider = lider;
        this.membros = new ArrayList<>();
        this.agressividade = agressividade;
    }
    public String getNomeGangue() {
        return this.nomeGangue;
    }
    public void adicionarMembro(Cowboy membro) {
        membros.add(membro);
        System.out.println(membro.getNome() + " foi adicionado à gangue " + nomeGangue + ".");
    }
    public void removerMembro(Cowboy membro) {
        if (membros.remove(membro)) {
            System.out.println(membro.getNome() + " foi removido da gangue " + nomeGangue + ".");
        } else {
            System.out.println(membro.getNome() + " não faz parte da gangue " + nomeGangue);
        }
    }
    public void imprimirInformacoes() {
        System.out.println("_".repeat(150) + "\n");
        System.out.println("INFORMAÇÕES SOBRE A GANGUE");
        System.out.println("Nome: " + nomeGangue + ".");
        System.out.println("Líder: " + lider + ".");
        System.out.println("Agressividade: " + (agressividade ? "Alta, Demonstram agressividade em suas atividades criminosas." : "Baixa, Geralmente optam por abordagens menos violentas em suas atividades criminosas."));
        imprimirMembros();
    }
    public void imprimirMembros() {
        System.out.print("Membros: ");
        if (membros.isEmpty()) {
            System.out.println("Nenhum membro disponível.\n");
        } else {
            for (int i = 0; i < membros.size(); i++) {
                System.out.print(membros.get(i).getNome());

                if (i < membros.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(".");
        }
    }
    public void brigarEntreGangues(Gangue gangue2) {
        System.out.println("Ao entardecer, a luz dourada do sol lança sombras na rua empoeirada, onde as gangues " + this.nomeGangue + " e " + gangue2.getNomeGangue() + " se encontram para um confronto.");
        double chanceAtaque = Math.random();
        double chanceVitoria = Math.random();

        if (chanceAtaque <= 0.5) {
            System.out.println("Um membro da gangue " + this.nomeGangue + " ataca primeiro contra " + gangue2.getNomeGangue() + "!");
        } else {
            System.out.println("Um membro da gangue " + gangue2.getNomeGangue() + " ataca primeiro contra " + this.nomeGangue + "!");
        }
        if (chanceVitoria <= 0.5) {
            System.out.println("Membros de " + this.nomeGangue + " vencem o tiroteio, causando baixas e forçando os sobreviventes de " + gangue2.getNomeGangue() + " a fugirem.\n");
        } else {
            System.out.println("A gangue " + gangue2.getNomeGangue() + " vence o tiroteio, causando baixas e forçando os sobreviventes de " + this.nomeGangue + " a fugirem.\n");
        }
    }
    public void roubarBanco() {
        System.out.println("Membros da gangue " + getNomeGangue() + " estão tentando roubar um banco!");
        double chanceSucesso = Math.random();

        if (chanceSucesso <= 0.5) {
            System.out.println("O assalto foi executado com êxito, resultando em uma considerável soma de dinheiro.\n");
        } else {
            System.out.println("O assalto foi malsucedido, conseguindo apenas roubar alguns pertences das pessoas presentes no momento.\n");
        }
    }
}
