package model;
import java.time.LocalDate; //yyyy-MM-dd --> fazer o formato data
/**
 *
 * @author g247455
 */
public class Tratamento {
    private int cod_Tratamento;
    private LocalDate data_ini;
    private LocalDate data_fim;  

    public Tratamento(int cod_Tratamento, LocalDate data_ini, LocalDate data_fim) {
        this.cod_Tratamento = cod_Tratamento;
        this.data_ini = data_ini;
        this.data_fim = data_fim;
    }

    public int getCod_Tratamento() {
        return cod_Tratamento;
    }

    public void setCod_Tratamento(int cod_Tratamento) {
        this.cod_Tratamento = cod_Tratamento;
    }

    public LocalDate getData_ini() {
        return data_ini;
    }

    public void setData_ini(LocalDate data_ini) {
        this.data_ini = data_ini;
    }

    public LocalDate getData_fim() {
        return data_fim;
    }

    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
    }
}
