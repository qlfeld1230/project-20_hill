package solid.project_20_hill.Repasitory.Controller;

import java.util.List;
import java.util.Optional;

public interface UkmanRepository {
    List<UkmanTable> findAll();
    Optional<UkmanTable> findById(Long id);
}
