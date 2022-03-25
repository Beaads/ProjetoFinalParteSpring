package ProjetoFinalParteSpring.Resource;

import ProjetoFinalParteSpring.Domain.CheckListEntity;
import ProjetoFinalParteSpring.Domain.CheckListRespostaDTOPost;
import ProjetoFinalParteSpring.Domain.CheckListRespostaDTOLista;
import ProjetoFinalParteSpring.Mapper.CheckListMapper;
import ProjetoFinalParteSpring.Service.CheckListService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@RequestMapping("checklist")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

//http://localhost:8080/checklist

public class CheckListResource {

    private final CheckListService checkListService;
    private final CheckListMapper mapper;

    @GetMapping
    public List<CheckListRespostaDTOLista> list() {
        final var check = checkListService.listAll();
        return mapper.transformaDtoList(check);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(checkListService.findByIdChecklist(id), HttpStatus.OK);
    }

    @PostMapping
    public CheckListRespostaDTOPost save(@RequestBody CheckListEntity checkDto) {
        final var post = checkListService.save(checkDto);
        return mapper.transformaDtoPost(post);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> remove(@PathVariable Integer id) {
        return checkListService.findByIdChecklist(id).map(record -> {
            checkListService.delete(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("entidade nao encontrada!"));
    }
}
