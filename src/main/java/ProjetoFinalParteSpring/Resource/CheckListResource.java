package ProjetoFinalParteSpring.Resource;

import ProjetoFinalParteSpring.Domain.CheckListDto;
import ProjetoFinalParteSpring.Domain.CheckListEntity;
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
@RequiredArgsConstructor

//http://localhost:8080/checklist

public class CheckListResource {

    private final CheckListService checkListService;
    private final CheckListMapper mapper;

    @Autowired

    @GetMapping
    public ResponseEntity<List<CheckListEntity>> list() {
        return new ResponseEntity<>(checkListService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional> findById(@PathVariable int id){
        return new ResponseEntity<>(checkListService.findByIdChecklist(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CheckListEntity> save (@RequestBody CheckListDto checkDto) {
        CheckListEntity checkEntity = checkListService.save(checkDto.transformaParaDto());
        return new ResponseEntity<>(checkEntity, HttpStatus.CREATED);
    }
}
