package ProjetoFinalParteSpring.Resource;

import ProjetoFinalParteSpring.Domain.CheckListEntity;
import ProjetoFinalParteSpring.Service.CheckListService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("checklist")
@RestController
@RequiredArgsConstructor

//http://localhost:8080/checklist

public class CheckListResource {

    @Autowired
    private final CheckListService checkListService;

    @GetMapping
    public ResponseEntity<List<CheckListEntity>> list() {
        return new ResponseEntity<>(checkListService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional> findById(@PathVariable int id){
        return new ResponseEntity<>(checkListService.findByIdChecklist(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CheckListEntity> save (@RequestBody CheckListEntity checkListEntity) {
        return new ResponseEntity<>(checkListService.save(checkListEntity), HttpStatus.CREATED);
    }
}
