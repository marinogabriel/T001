package model;

/**
 *
 * @author g247455
 */
public class Animal {
    private int cod_Animal;
    private String nome_Animal;
    private String sexo_Animal; //bool?
    private String especie;
    
    public Animal(int cod_Animal, String nome_Animal, String sexo_Animal, String especie) {
        this.cod_Animal = cod_Animal;
        this.nome_Animal = nome_Animal;
        this.sexo_Animal = sexo_Animal;
        this.especie = especie;
    }

    public int getCod_Animal() {
        return cod_Animal;
    }

    public String getNome_Animal() {
        return nome_Animal;
    }

    public void setNome_Animal(String nome_Animal) {
        this.nome_Animal = nome_Animal;
    }

    public String getSexo_Animal() {
        return sexo_Animal;
    }

    public void setSexo_Animal(String sexo_Animal) {
        this.sexo_Animal = sexo_Animal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}


