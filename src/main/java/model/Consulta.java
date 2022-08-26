package model;
import java.time.LocalDate; //yyyy-MM-dd --> fazer o formato data

/**
 *
 * @author g247455
 */
public class Consulta {
    private int cod_Consulta;
    private LocalDate data_Consulta;
    private String historico;
    private String exames;

    public Consulta(int cod_Consulta, LocalDate data_Consulta, String historico, String exames) {
        this.cod_Consulta = cod_Consulta;
        this.data_Consulta = data_Consulta;
        this.historico = historico;
        this.exames = exames;
    }

    public int getCod_Consulta() {
        return cod_Consulta;
    }

    public LocalDate getData_Consulta() {
        return data_Consulta;
    }

    public void setData_Consulta(LocalDate data_Consulta) {
        this.data_Consulta = data_Consulta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getExames() {
        return exames;
    }

    public void setExames(String exames) {
        this.exames = exames;
    }
    
}
