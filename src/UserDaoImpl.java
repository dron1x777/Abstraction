import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements GenericDao<User> {
    List<User> users = new ArrayList<>();
    @Override
    public void create(User newObject) {
        users.add(newObject);
    }

    @Override
    public User getByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void update(String name, User newObject) {
        User user = newObject;
        for (User user1 : users) {
            if (user1.getName().equals(name)) {
                user1 = user;
            }
        }
    }

    @Override
    public void delete(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                users.remove(user);
            }
        }
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
