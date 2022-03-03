package ProjetoFinalParteSpring.Service;

import ProjetoFinalParteSpring.Dao.CheckListDao;
import ProjetoFinalParteSpring.Domain.CheckList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckListService {
    private final CheckListDao checkListDao = new CheckListDao();

    public List<CheckList> listAll() {
        return checkListDao.listAllCheckList();
    }

    public CheckList findByIdChecklist(final int id) {
        return checkListDao.findByIdCheckList(id);
    }

    public CheckList save(final CheckList checkList) {
        return checkListDao.cadastraCheckList(checkList);
    }
}
