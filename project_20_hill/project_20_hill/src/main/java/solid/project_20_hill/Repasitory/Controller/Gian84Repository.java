package solid.project_20_hill.Repasitory.Controller;

import java.util.List;
import java.util.Optional;

public interface Gian84Repository {
    List<Gian84Table> findAll();
    Optional<Gian84Table> findById(Long id);
}
