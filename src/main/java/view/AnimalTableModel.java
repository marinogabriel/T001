package view;


import java.util.List;
import model.Animal;
import model.AnimalDAO;


public class AnimalTableModel extends GenericTableModel {

    public AnimalTableModel(List vDados) {
        super(vDados, new String[]{"Nome", "Sexo", "Espécie", "Dono"});
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
                return int.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal animal = (Animal) vDados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return animal.getNome();
            case 1:
                return animal.getSexo();
            case 2:
                return EspecieDAO.retrieveByIdCliente().getEspecie();
            case 3:
                return ClienteDAO.retrieveById().getNome();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

}