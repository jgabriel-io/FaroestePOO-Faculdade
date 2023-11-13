package br.com.projetofaroeste;

import java.util.ArrayList;
import java.util.List;
public class Inventario {
    private final List<String> itens;
    public Inventario() {
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(String item) {
        itens.add(item);
    }
    public void removerItem(String item) {
        itens.remove(item);
    }
    public List<String> listarItens() {
        return itens;
    }
}