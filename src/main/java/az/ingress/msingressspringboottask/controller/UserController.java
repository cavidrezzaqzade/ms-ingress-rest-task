package az.ingress.msingressspringboottask.controller;

import az.ingress.msingressspringboottask.model.UserDto;
import az.ingress.msingressspringboottask.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author caci
 */

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers(@RequestParam("page") int page, @RequestParam("size") int size) {
        List<UserDto> users = service.getUsers(page, size);
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id) {
        UserDto user = service.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<UserDto> addUser(@RequestBody /*@NotNull @Valid*/ UserDto userDto) {
        UserDto user = service.addUser(userDto);
        return ResponseEntity.ok(user);
    }
    
}
