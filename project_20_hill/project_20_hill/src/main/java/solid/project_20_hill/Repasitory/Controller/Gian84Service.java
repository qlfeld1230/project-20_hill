package solid.project_20_hill.Repasitory.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Gian84Service {
    @Autowired
    private Gian84Repository gian84Repository;

    public List<Gian84Table> getGian84TableList() {
        return gian84Repository.findAll();
    }

    public Optional<Gian84Table> findById (Long id) {
        return gian84Repository.findById(id);
    }

    public List<Gian84Table> findByAnswer (String answer) {
        return gian84Repository.findByAnswer(answer);
    }
}
