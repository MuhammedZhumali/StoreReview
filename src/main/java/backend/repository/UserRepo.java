package backend.repository;

import org.springframework.stereotype.Repository;
import backend.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
