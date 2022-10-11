package view;

import java.util.List;
import model.Cliente;
import model.ClienteDAO;


public class ClienteTableModel extends GenericTableModel {

    public ClienteTableModel(List vDados) {
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
        Cliente cliente = (Cliente) vDados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getSexo();
            case 2:
                return Especie.getNome(EspecieDAO.retrieveById(cliente.getIdEspecie()));
            case 3:
                return Cliente.getNome(ClienteDAO.retrieveById(cliente.getIdCliente()));
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public Object setValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = (Cliente) vDados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getSexo();
            case 2:
                return Especie.getNome(EspecieDAO.retrieveById(cliente.getIdEspecie()));
            case 3:
                return Cliente.getNome(ClienteDAO.retrieveById(cliente.getIdCliente()));
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }   

}