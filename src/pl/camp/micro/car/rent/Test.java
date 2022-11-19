package pl.camp.micro.car.rent;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        /*Optional<Integer> integerBox = Optional.of(10);

        if(integerBox.isPresent()) {
            Integer i = integerBox.get();
        }
        integerBox.orElse(5);*/

        String pass = "mateusz" + "z0@q%!I6LPBw#%lc26w!WjL*C@X8#i";
        String hash = DigestUtils.md5Hex(pass);
        System.out.println(hash);
    }
}
