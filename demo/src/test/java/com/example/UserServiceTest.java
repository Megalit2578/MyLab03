package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    public void testIsUserActive() {
        UserRepository userRepository = mock(UserRepository.class);
        User activeUser = new User(1, "John Doe", true);
        when(userRepository.findById(1)).thenReturn(activeUser);

        UserService userService = new UserService(userRepository);

        assertTrue(userService.isUserActive(1), "User with ID 1 should be active");
        verify(userRepository, times(1)).findById(1);
    }

    @Test
    public void testIsUserInactive() {
        UserRepository userRepository = mock(UserRepository.class);
        User inactiveUser = new User(2, "Jane Doe", false);
        when(userRepository.findById(2)).thenReturn(inactiveUser);

        UserService userService = new UserService(userRepository);

        assertFalse(userService.isUserActive(2), "User with ID 2 should be inactive");
        verify(userRepository, times(1)).findById(2);
    }
}