package ProjetoFinalParteSpring.Resource;

import ProjetoFinalParteSpring.Domain.CheckListDto;
import ProjetoFinalParteSpring.Domain.CheckListEntity;
import ProjetoFinalParteSpring.Domain.CheckListRespostaDTOPost;
import ProjetoFinalParteSpring.Domain.CheckListRespostaDTOLista;
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

    @GetMapping
    public ResponseEntity<List<CheckListRespostaDTOLista>> list() {
        return new ResponseEntity<>(checkListService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional> findById(@PathVariable Integer id){
        return new ResponseEntity<>(checkListService.findByIdChecklist(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CheckListRespostaDTOPost> save (@RequestBody CheckListEntity checkDto) {
        return new ResponseEntity<>(checkListService.save(checkDto), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        checkListService.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
