package mx.edu.utez.examenu2.models.users;
import mx.edu.utez.examenu2.models.products.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
public interface UsersRepository extends JpaRepository<Users, Long>  {
}
