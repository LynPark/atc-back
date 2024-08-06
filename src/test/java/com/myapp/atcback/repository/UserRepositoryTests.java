package com.myapp.atcback.repository;

import com.myapp.atcback.entity.User;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    // 회원 입력 테스트
    @Test
    public void testRegisterUser() {
        /* User user = new User();
        user.setEmail("test01@test.com");
        user.setPassword("123456");
        user.setNickname("test01");
        user.setCreatedAt(LocalDateTime.now());
        user.setRole(User.Role.USER);
        userRepository.save(user); */
        IntStream.range(1, 10).forEach(i -> {
            User user = User.builder()
                    .email("email" + i + "@email.com")
                    .password("123456")
                    .nickname("user" + i)
                    .role((i < 9) ? User.Role.USER : User.Role.ADMIN)
                    .createdAt(LocalDateTime.now())
                    .build();
            userRepository.save(user);
        });
    }
}
