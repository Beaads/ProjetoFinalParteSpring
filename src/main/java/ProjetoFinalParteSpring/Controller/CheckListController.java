package ProjetoFinalParteSpring.Controller;

import ProjetoFinalParteSpring.Domain.CheckList;
import ProjetoFinalParteSpring.Service.CheckListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("checklist")
@RestController
@RequiredArgsConstructor

//http://localhost:8080/checklist

public class CheckListController {

    private final CheckListService checkListService;

    @GetMapping
    public ResponseEntity<List<CheckList>> list() {
        return new ResponseEntity<>(checkListService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CheckList> findById(@PathVariable int id){
        return new ResponseEntity<>(checkListService.findByIdCL(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CheckList> save (@RequestBody CheckList checkList) {
        return new ResponseEntity<>(checkListService.save(checkList), HttpStatus.CREATED);
    }
}
