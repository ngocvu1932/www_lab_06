package vn.edu.iuh.fit.www_lab_06.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab_06.backend.models.User;
import vn.edu.iuh.fit.www_lab_06.backend.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public void saveUser( User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<User> findById( Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAll () {
        return userRepository.findAll();
    }
}
