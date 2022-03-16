package ProjetoFinalParteSpring.Service;

import ProjetoFinalParteSpring.Dao.CheckListDao;
import ProjetoFinalParteSpring.Domain.CheckListDto;
import ProjetoFinalParteSpring.Domain.CheckListEntity;
import ProjetoFinalParteSpring.Mapper.CheckListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CheckListService {

    private final CheckListDao checkListDAO;
    private final CheckListMapper checkListMapper;

    public List<CheckListEntity> listAll() {
        return checkListDAO.listAllCheckList();
    }

    public CheckListEntity findByIdChecklist(int id) {
        return checkListDAO.findByIdCheckList(id);
    }

    public CheckListEntity save(CheckListEntity checkList) {
        return checkListDAO.save(checkList);
    }
}
