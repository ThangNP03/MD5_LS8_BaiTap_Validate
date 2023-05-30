package ra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
}
