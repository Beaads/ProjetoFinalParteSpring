package ProjetoFinalParteSpring.Resource;

import ProjetoFinalParteSpring.Domain.CheckListRespostaDTOLista;
import ProjetoFinalParteSpring.Domain.UsuarioEntity;
import ProjetoFinalParteSpring.Service.UsuarionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@RequestMapping("usuario")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class UsuarioResource {

    private final UsuarionService usuarionService;

    @GetMapping
    public ResponseEntity<List<UsuarioEntity>> list() {
        return new ResponseEntity<>(usuarionService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{usuario}")
    public ResponseEntity<Optional> findByUsuario(Integer id) {
        return new ResponseEntity<>(usuarionService.findByUsuario(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UsuarioEntity> save(@RequestBody UsuarioEntity usuario) {
        return new ResponseEntity<>(usuarionService.save(usuario), HttpStatus.CREATED);
    }
}
