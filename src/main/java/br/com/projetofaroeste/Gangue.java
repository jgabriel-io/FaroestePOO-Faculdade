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
            System.out.println("Com ferocidade, os membros de " + this.nomeGangue + " triunfam no tiroteio, causando baixas e forçando os sobreviventes de " + gangue2.getNomeGangue() + " a baterem em retirada. - Alguns membros da gangue rival perderam a vida neste conflito, intensificando ainda mais a rivalidade.\n");
        } else {
            System.out.println("A gangue " + gangue2.getNomeGangue() + " emerge vitoriosa no tiroteio, causando baixas e obrigando os sobreviventes de " + this.nomeGangue + " a recuarem. - Alguns membros da gangue rival perderam a vida neste conflito, intensificando ainda mais a rivalidade.\n");
        }
    }
    public void roubarBanco() {
        System.out.println("Às sombras da noite, membros da gangue " + getNomeGangue() + " tramam o audacioso roubo de um banco!");

        double chanceSucesso = Math.random();

        if (chanceSucesso <= 0.5) {
            System.out.println("Com precisão e astúcia, o assalto é executado com êxito, resultando em uma considerável fortuna. - A gangue parte com os bolsos cheios, desaparecendo nas sombras.\n");
        } else {
            System.out.println("Apesar dos esforços, o assalto não atinge o sucesso planejado, conseguindo apenas subtrair alguns pertences das pessoas presentes no momento. - A gangue deixa a cena com poucos espólios, mas permanece na sombra, pronta para o próximo movimento.\n");
        }
    }

}
