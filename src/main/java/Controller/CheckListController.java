package Controller;

import Service.CheckListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("checklist")
@RestController
@RequiredArgsConstructor

//http://localhost:8080/checklist

public class CheckListController {

    private final CheckListService checkListService;



}
