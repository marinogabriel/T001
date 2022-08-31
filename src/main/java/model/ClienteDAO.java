package model

public class ClienteDAO implements DAO<Cliente> {
    
    private List<Cliente> clientes = new ArrayList<>();
    
    public ClienteDAO() {
        clientes.add(new Cliente(1, "Rua X", "19912345678", "12345678", "pedrinho@gmail.com"));
        clientes.add(new Cliente(2, "Rua Y", "1134781234", "87654321", "joaozinho@dac.unicamp.br"));
    }
    
    @Override
    public Optional<Cliente> retrieve(int id) {
        return Optional.ofNullable(clientes.retrieve((int) id));
    }
    
    @Override
    public List<Cliente> retrieveAll() {
        return clientes;
    }
    
    @Override
    public void create(Cliente cliente) {
        clientes.add(cliente);
    }
    
    @Override
    public void update(Cliente cliente, String[] params) {
        cliente.setEndereco(Objects.requireNonNull(
          params[0], "Endereco nao pode ser null"));
        cliente.setTelefone(Objects.requireNonNull(
          params[1], "Telefone nao pode ser null"));
	    cliente.setCep(Objects.requireNonNull(
          params[2], "Cep nao pode ser null"));
        cliente.setEmail(Objects.requireNonNull(
          params[3], "Email nao pode ser null"));

        clientes.add(cliente);
    }
    
    @Override
    public void delete(Cliente cliente) {
        clientes.remove(cliente);
    }
}
