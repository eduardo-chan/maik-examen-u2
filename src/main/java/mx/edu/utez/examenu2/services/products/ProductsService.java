package mx.edu.utez.examenu2.services.products;


import mx.edu.utez.examenu2.models.products.Products;
import mx.edu.utez.examenu2.models.products.ProductsRepository;
import mx.edu.utez.examenu2.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductsService {
    @Autowired
    private ProductsRepository repository;


    @Transactional(readOnly = true)
    public CustomResponse<List<Products>> getAll(){
        return new CustomResponse<>(
            this.repository.findAll(),
                false,
                200,
                "okis"
        );
    }


}
