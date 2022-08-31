package model

public class AnimalDAO implements DAO<Animal> {
    
    private List<Animal> animais = new ArrayList<>();
    
    public AnimalDAO() {
        animais.add(new Animal(1, "Joaquim", "M", "Cachorro"));
        animais.add(new Animal(2, "Nina", "F", "Gato"));
    }
    
    @Override
    public Optional<Animal> retrieve(int id) {
        return Optional.ofNullable(animais.retrieve((int) id));
    }
    
    @Override
    public List<Animal> retrieveAll() {
        return animais;
    }
    
    @Override
    public void create(Animal animal) {
        animais.add(animal);
    }
    
    @Override
    public void update(Animal animal, String[] params) {
        animal.setNome(Objects.requireNonNull(
          params[0], "Nome nao pode ser null"));
        animal.setSexo(Objects.requireNonNull(
          params[1], "Sexo nao pode ser null"));
	animal.setEspecie(Objects.requireNonNull(
          params[2], "Especie nao pode ser null"));

        animais.add(animal);
    }
    
    @Override
    public void delete(Animal animal) {
        animais.remove(animal);
    }
}
