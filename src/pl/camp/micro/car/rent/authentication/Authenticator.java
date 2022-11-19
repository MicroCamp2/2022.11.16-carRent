package pl.camp.micro.car.rent.authentication;

import org.apache.commons.codec.digest.DigestUtils;
import pl.camp.micro.car.rent.database.UserRepository;
import pl.camp.micro.car.rent.model.User;

import java.util.Optional;

public class Authenticator {
    private final UserRepository userRepository;
    private final String seed = "z0@q%!I6LPBw#%lc26w!WjL*C@X8#i";

    public Authenticator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(User user) {
        Optional<User> userBoxFromDb = this.userRepository.getUserByLogin(user.getLogin());
        return userBoxFromDb.isPresent() &&
                userBoxFromDb.get()
                        .getPassword()
                        .equals(DigestUtils.md5Hex(user.getPassword() + seed));
    }
}
