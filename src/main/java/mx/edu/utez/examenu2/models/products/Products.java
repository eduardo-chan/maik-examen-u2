package mx.edu.utez.examenu2.models.products;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "products")

public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false,length = 50)
    private String name;
    @Column(unique = true,nullable = false,length = 50)
    private String categoryProduct;
    @Column(unique = true,nullable = false,length = 50)
    private Float price;
    @Column(nullable = false, columnDefinition = "TINYINT DEFAULT 1")
    private Boolean status;

}


















