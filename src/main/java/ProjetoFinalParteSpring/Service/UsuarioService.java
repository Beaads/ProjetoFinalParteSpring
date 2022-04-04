package ProjetoFinalParteSpring.Service;

import ProjetoFinalParteSpring.Dao.UsuarioDao;
import ProjetoFinalParteSpring.Domain.UsuarioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UsuarioService {

    private final UsuarioDao usuarioDao;

    public Optional<UsuarioEntity> findByUsuario(Integer id) {
        return usuarioDao.findById(id);
    }

    public List<UsuarioEntity> listAll() {
        return usuarioDao.findAll();
    }

    @Transactional
    public UsuarioEntity save(UsuarioEntity usuario) {
        return usuarioDao.save(usuario);
    }
}
