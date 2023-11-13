package solid.project_20_hill.Repasitory.Controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItsupJpaRepository extends JpaRepository<ItsupTable, Long>, ItsupRepository {
}
