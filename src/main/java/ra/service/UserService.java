package ra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.User;
import ra.repository.IUserRepository;
@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
