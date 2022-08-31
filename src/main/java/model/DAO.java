package model;

public interface DAO<T> {
    
    void create(T t);
    
    Optional<T> retrieve(int id);
    
    List<T> retrieveAll();
    
    void update(T t, String[] params);
    
    void delete(T t);
}
