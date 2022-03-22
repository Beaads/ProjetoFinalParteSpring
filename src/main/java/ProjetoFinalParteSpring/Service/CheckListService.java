package ProjetoFinalParteSpring.Service;

import ProjetoFinalParteSpring.Dao.CheckListDao;
import ProjetoFinalParteSpring.Domain.CheckListDto;
import ProjetoFinalParteSpring.Domain.CheckListEntity;
import ProjetoFinalParteSpring.Domain.CheckListRespostaDTOLista;
import ProjetoFinalParteSpring.Domain.CheckListRespostaDTOPost;
import ProjetoFinalParteSpring.Mapper.CheckListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CheckListService {

    private final CheckListDao checkListDAO;
    private final CheckListMapper mapper;

    public List<CheckListRespostaDTOLista> listAll() {
        final List<CheckListEntity> allcheck = checkListDAO.findAll();
        return mapper.transformaDto2(allcheck);
    }


    public Optional<CheckListEntity> findByIdChecklist(Integer id) {
        return checkListDAO.findById(id);
    }

    @Transactional
    public CheckListRespostaDTOPost save(CheckListEntity checkList) {
        final CheckListEntity post = checkListDAO.save(checkList);
        return mapper.transformaDto3(post);
    }
}