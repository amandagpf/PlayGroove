package br.com.playgroove.modelos;

public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalDeReproducoes;
    private int numeroDeCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getNumeroDeCurtidas() {
        return numeroDeCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.numeroDeCurtidas++;
    }

    public void reproduz() {
        this.totalDeReproducoes++;
    }


}
