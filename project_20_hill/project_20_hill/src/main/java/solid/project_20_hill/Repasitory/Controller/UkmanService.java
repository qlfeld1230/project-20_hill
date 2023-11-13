package solid.project_20_hill.Repasitory.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UkmanService {
    @Autowired
    private UkmanRepository ukmanRepository;

    public List<UkmanTable> getUkmanTableList() {
        return ukmanRepository.findAll();
    }

    public Optional<UkmanTable> findById (Long id) {
        return ukmanRepository.findById(id);
    }
}
