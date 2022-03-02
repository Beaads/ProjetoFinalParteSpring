package ProjetoFinalParteSpring.Controller;

import ProjetoFinalParteSpring.Domain.CheckList;
import ProjetoFinalParteSpring.Service.CheckListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("checklist")
@RestController
public class CheckListController {
    private final CheckListService checkListService;

    @Autowired
    public CheckListController(final CheckListService checkListService) {this.checkListService = checkListService;}

    @GetMapping
    public ResponseEntity<List<CheckList>> list() {
        return new ResponseEntity<>(checkListService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CheckList> findById(@PathVariable final int id) {
        return new ResponseEntity<>(checkListService.findByIdChecklist(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CheckList> save(@RequestBody final CheckList checkList) {
        return new ResponseEntity<>(checkListService.save(checkList), HttpStatus.CREATED);
    }
}
