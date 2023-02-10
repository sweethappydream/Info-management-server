package com.net.infoManager.user;

import org.springframework.data.repository.config.EnableMapRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Optional;

@Service
@EnableMapRepositories
public class UserService {
    private final CrudRepository<User, Long> repository;

    public UserService(CrudRepository<User, Long> repository) {
        this.repository = repository;
        this.repository.saveAll(defaultUsers());
    }

    private static List<User> defaultUsers() {
        return List.of(
            new User(1L, "susano", "suanowithmail@gmail.com", "asdfasdf" )
        )
    }

    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        Iterable<User> users = repository.findAll();
        users.forEach(list::add);
        return list;
    }

    public Optional<User> find(Long id) {
        return repository.findById(id);
    }

    public User create (User user) {
        User copy = new User(
            new Date().getTime(),
            user.getName(),
            user.getEmail(),
            user.getPassword()
        );

        return repository.save(copy);
    }

    public Optional<User> update( Long id, User newUser) {
        return repository.findById(id)
                .map(oldUser -> {
                    User updated = oldUser.updateWith(newUser);
                    return repository.save(updated);
                });
    }

    public void delete( Long id) {
        repository.deleteById(id);
    }
}
 