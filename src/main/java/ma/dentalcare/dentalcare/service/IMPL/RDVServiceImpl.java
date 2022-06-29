package ma.dentalcare.dentalcare.service.IMPL;

import ma.dentalcare.dentalcare.model.RDV;
import ma.dentalcare.dentalcare.repository.RDVRepository;
import ma.dentalcare.dentalcare.service.RDVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RDVServiceImpl implements RDVService {
    @Autowired
    private RDVRepository repo;

    public RDVServiceImpl(RDVRepository repo) {
        this.repo = repo;
    }

    @Override
    public RDV AddRdv(RDV rdv) {
        return repo.save(rdv);
    }

    @Override
    public List<RDV> getAllRDVs() {
        return repo.findAll();
    }

    @Override
    public RDV saveRDV(RDV RDV) {
        return repo.save(RDV);
    }

    @Override
    public RDV getRDVById(Long id) {
        return repo.findById(id).orElseThrow(()->new UsernameNotFoundException("RDV by id "+id+"was not found"));
    }

    @Override
    public RDV updateRDV(RDV RDV) {
        return repo.save(RDV);
    }

    @Override
    public void deleteRDV(Long id) {
     repo.deleteById(id);
    }
}
