package pl.camp.micro.car.rent.database;

import pl.camp.micro.car.rent.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        this.users.add(new User("admin", "5ab58eb03c599ea617a3ebc2e5ca9a71"));
        this.users.add(new User("mateusz", "7b0e5cd441108e1dd31219678385aab7"));
    }

    public Optional<User> getUserByLogin(String login) {
        for(User user : this.users) {
            if(user.getLogin().equals(login)) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }

    public List<User> getUsers() {
        return users;
    }
}
