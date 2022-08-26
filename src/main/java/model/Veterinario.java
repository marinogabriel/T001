package model;

/**
 *
 * @author g247455
 */
public class Veterinario {
    private int cod_Veterinario;
    private String nome_Veterinario;
    private String end_Veterinario;
    private String tel_Veterinario;

    public Veterinario(int cod_Veterinario, String nome_Veterinario, String end_Veterinario, String tel_Veterinario) {
        this.cod_Veterinario = cod_Veterinario;
        this.nome_Veterinario = nome_Veterinario;
        this.end_Veterinario = end_Veterinario;
        this.tel_Veterinario = tel_Veterinario;
    }

    public int getCod_Veterinario() {
        return cod_Veterinario;
    }

    public String getNome_Veterinario() {
        return nome_Veterinario;
    }

    public void setNome_Veterinario(String nome_Veterinario) {
        this.nome_Veterinario = nome_Veterinario;
    }

    public String getEnd_Veterinario() {
        return end_Veterinario;
    }

    public void setEnd_Veterinario(String end_Veterinario) {
        this.end_Veterinario = end_Veterinario;
    }

    public String getTel_Veterinario() {
        return tel_Veterinario;
    }

    public void setTel_Veterinario(String tel_Veterinario) {
        this.tel_Veterinario = tel_Veterinario;
    }
}
