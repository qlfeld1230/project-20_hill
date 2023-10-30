package solid.project_20_hill.Repasitory.Controller;

import java.util.List;
import java.util.Optional;

public interface TwentyQuestionRepository {
    List<TwentyQuestionTable> findAll();
    Optional<TwentyQuestionTable> findById(Long id);

}
