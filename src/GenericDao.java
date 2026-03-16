import java.util.List;

public interface GenericDao<T> {

     void create(T newObject);
    T getByName(String name);
     void update(String name, T newObject);
     void delete(String name);
    List<T> getAll();


}
