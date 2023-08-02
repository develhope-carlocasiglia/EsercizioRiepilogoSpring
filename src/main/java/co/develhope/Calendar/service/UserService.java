package co.develhope.Calendar.service;

import co.develhope.Calendar.model.User;
import co.develhope.Calendar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUserById(int userId) throws Exception {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isEmpty()) throw new Exception(String.format("Cannot find user with user id: %d\n", userId));
        return userOptional.get();
    }

}
