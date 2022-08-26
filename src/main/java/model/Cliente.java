package model;

/**
 *
 * @author g247455
 */
public class Cliente {
    private int cod_Cliente;
    private String end_Cliente; //decompor?
    private String tel_Cliente;
    private String cep_Cliente;
    private String email_Cliente;

    public Cliente(int cod_Cliente, String end_Cliente, String tel_Cliente, String cep_Cliente, String email_Cliente) {
        this.cod_Cliente = cod_Cliente;
        this.end_Cliente = end_Cliente;
        this.tel_Cliente = tel_Cliente;
        this.cep_Cliente = cep_Cliente;
        this.email_Cliente = email_Cliente;
    }

    public int getCod_Cliente() {
        return cod_Cliente;
    }

    public String getEnd_Cliente() {
        return end_Cliente;
    }

    public void setEnd_Cliente(String end_Cliente) {
        this.end_Cliente = end_Cliente;
    }

    public String getTel_Cliente() {
        return tel_Cliente;
    }

    public void setTel_Cliente(String tel_Cliente) {
        this.tel_Cliente = tel_Cliente;
    }

    public String getCep_Cliente() {
        return cep_Cliente;
    }

    public void setCep_Cliente(String cep_Cliente) {
        this.cep_Cliente = cep_Cliente;
    }

    public String getEmail_Cliente() {
        return email_Cliente;
    }

    public void setEmail_Cliente(String email_Cliente) {
        this.email_Cliente = email_Cliente;
    }
    
}
