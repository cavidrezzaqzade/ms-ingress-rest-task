package az.ingress.msingressspringboottask.service;

import az.ingress.msingressspringboottask.model.UserDto;
import java.util.List;

/**
 * @author caci
 */

public interface UserService {
    List<UserDto> getUsers(int page, int size);

    UserDto addUser(UserDto userDto);

    UserDto getUserById(Long id);
}
