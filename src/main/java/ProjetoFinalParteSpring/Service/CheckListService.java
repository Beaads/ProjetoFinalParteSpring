package ProjetoFinalParteSpring.Service;

import ProjetoFinalParteSpring.Dao.CheckListDAO;
import ProjetoFinalParteSpring.Domain.CheckList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckListService {

    private final CheckListDAO checkListDAO = new CheckListDAO();

    public List<CheckList> listAll() {
        return checkListDAO.listAllCheckList();
    }

    public CheckList findByIdCL(int id) {
        return checkListDAO.findByIdCheckList(id);
    }

    public CheckList save(CheckList checkList) {
        return checkListDAO.cadastraCheckList(checkList);
    }
}
