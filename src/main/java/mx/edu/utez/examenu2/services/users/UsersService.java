package mx.edu.utez.examenu2.services.users;


import mx.edu.utez.examenu2.models.products.Products;
import mx.edu.utez.examenu2.models.users.Users;
import mx.edu.utez.examenu2.models.users.UsersRepository;
import mx.edu.utez.examenu2.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsersService {
    @Autowired
    private UsersRepository repository;

    @Transactional(readOnly = true)
    public CustomResponse<List<Users>> getAll(){
        return new CustomResponse<>(
                this.repository.findAll(),
                false,
                200,
                "okis"
        );
    }


}
