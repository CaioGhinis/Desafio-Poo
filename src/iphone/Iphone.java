package iphone;

import papel.AparelhoTelefonico;
import papel.NavegadorInternet;
import papel.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Discando...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendidida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio por voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}
