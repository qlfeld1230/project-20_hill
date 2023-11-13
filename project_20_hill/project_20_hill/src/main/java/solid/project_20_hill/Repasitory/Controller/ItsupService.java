package solid.project_20_hill.Repasitory.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ItsupService {
    @Autowired
    private ItsupRepository itsupRepository;

    public List<ItsupTable> getItsupTableList() {
        return itsupRepository.findAll();
    }

    public Optional<ItsupTable> findById (Long id) {
        return itsupRepository.findById(id);
    }
}
