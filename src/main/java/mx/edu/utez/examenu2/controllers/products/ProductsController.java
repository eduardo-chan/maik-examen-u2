package mx.edu.utez.examenu2.controllers.products;



import mx.edu.utez.examenu2.models.products.Products;
import mx.edu.utez.examenu2.services.products.ProductsService;
import mx.edu.utez.examenu2.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/examenu2/products/")
@CrossOrigin(origins = {"*"})

public class ProductsController {
    @Autowired
    private ProductsService service;
    @GetMapping("/")
    public ResponseEntity<CustomResponse<List<Products>>> getAll() {
        return new ResponseEntity<>(
                this.service.getAll(),
                HttpStatus.OK
        );
    }
    @PostMapping("/")
    public ResponseEntity<CustomResponse<Products>> insert (
            @RequestBody
    )










}











