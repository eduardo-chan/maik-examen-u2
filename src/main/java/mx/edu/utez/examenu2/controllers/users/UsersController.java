package mx.edu.utez.examenu2.controllers.users;





import mx.edu.utez.examenu2.models.users.Users;
import mx.edu.utez.examenu2.services.users.UsersService;
import mx.edu.utez.examenu2.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/examenu2/users/")
@CrossOrigin(origins = {"*"})

public class UsersController {
    @Autowired
    private UsersService service;

    @GetMapping("/")
    public ResponseEntity<CustomResponse<List<Users>>> getAll(){
        return new ResponseEntity<>(
                this.service.getAll(),
                HttpStatus.OK
        );
    }


}
