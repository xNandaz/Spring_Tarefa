package br.edu.fatecrl.mvcdemo.models;

public class JogadorLoL {
    private String nome;
    private String campeao;
    private int nivel;
    private int abates;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCampeao() {
        return campeao;
    }

    public void setCampeao(String campeao) {
        this.campeao = campeao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getAbates() {
        return abates;
    }

    public void setAbates(int abates) {
        this.abates = abates;
    }

    public JogadorLoL(String nome, String campeao, int nivel, int abates) {
        this.nome = nome;
        this.campeao = campeao;
        this.nivel = nivel;
        this.abates = abates;
    }
}