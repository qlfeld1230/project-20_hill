package solid.project_20_hill.Repasitory.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TwentyQuestionService {
    @Autowired
    private TwentyQuestionRepository twentyQuestionRepository;

    public List<TwentyQuestionTable> gettwentyQuestionTableList() {
        return twentyQuestionRepository.findAll();
    }

    public Optional<TwentyQuestionTable> findById (Long id) {
        return twentyQuestionRepository.findById(id);
    }
}
