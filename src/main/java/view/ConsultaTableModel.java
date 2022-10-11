package view;

import java.util.List;
import model.Consulta;
import model.ConsultaDAO;


public class ConsultaTableModel extends GenericTableModel {

    public ConsultaTableModel(List vDados) {
        super(vDados, new String[]{"Nome", "Endereço", "CEP", "Telefone", "Email"});
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;    
             
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Consulta = consulta (Consulta) vDados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return consulta.getNome();
            case 1:
                return consulta.getSexo();
            case 2:
                return Especie.getNome(EspecieDAO.retrieveById(consulta.getIdEspecie()));
            case 3:
                return Consulta.getNome(ConsultaDAO.retrieveById(consulta.getIdConsulta()));
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    public Object setValueAt(int rowIndex, int columnIndex) {
        Consulta consulta = (Consulta) vDados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return consulta.getNome();
            case 1:
                return consulta.getEndereco();
            case 2:
                return consulta.getTelefone();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }   

}