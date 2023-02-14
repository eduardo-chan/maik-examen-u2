package mx.edu.utez.examenu2.models.users;

import com.fasterxml.jackson.annotation.JsonIgnore;
    import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.examenu2.models.products.Products;
import org.apache.catalina.Role;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false,length = 50)
    private String name;
    @Column(unique = true,nullable = false,length = 50)
    private String email;
    @Column(length = 100)
    private String password;
    @Column(unique = true,nullable = false,length = 50)
    private String listWish;


    @ManyToMany
    @JoinTable(name = "products_users",
            joinColumns = @JoinColumn(name = "users_id"),
            inverseJoinColumns = @JoinColumn(name = "products_id"))
    @JsonIgnore
    private Set<Products> products;

}
