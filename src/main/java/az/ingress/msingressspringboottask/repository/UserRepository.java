package az.ingress.msingressspringboottask.repository;

import az.ingress.msingressspringboottask.model.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caci
 */

@Component
public interface UserRepository {
    //it is for testing purpose:)
    default List<UserDto> getUsers(){
        return new ArrayList<>();
    };
}
