package com.example;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isUserActive(int userId) {
        User user = userRepository.findById(userId);
        return user != null && user.isActive();
    }
}
