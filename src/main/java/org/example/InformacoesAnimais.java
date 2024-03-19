package org.example;

public class InformacoesAnimais {

    private InformacoesAnimais() {};
    private static InformacoesAnimais instance = new InformacoesAnimais();
    public static InformacoesAnimais getInstance() {
        return instance;
    }

    private String nomeAnimal;
    private String especie;
    private String raca;
    private int idade;
    private String tutor;

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaça() {
        return raca;
    }

    public void setRaça(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
}
