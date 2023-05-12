package az.ingress.msingressspringboottask.service;

import az.ingress.msingressspringboottask.model.UserDto;
import az.ingress.msingressspringboottask.repository.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author caci
 */

@Service
@NoArgsConstructor
public class UserServiceImpl implements UserService {

//    @Autowired
    private UserRepository repository;

    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public List<UserDto> getUsers(int page, int size) {
        return repository.getUsers();
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        return UserDto.builder().name("Javid").build();
    }

    @Override
    public UserDto getUserById(Long id) {
        return UserDto.builder().name("Javid").build();
    }
}
