package solid.project_20_hill.Repasitory.Controller;

import java.util.List;
import java.util.Optional;

public interface ItsupRepository {
    List<ItsupTable> findAll();
    Optional<ItsupTable> findById(Long id);
}
