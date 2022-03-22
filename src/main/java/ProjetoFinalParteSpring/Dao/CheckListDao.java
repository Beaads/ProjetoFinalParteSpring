package ProjetoFinalParteSpring.Dao;

import ProjetoFinalParteSpring.Domain.CheckListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListDao extends JpaRepository<CheckListEntity, Integer> {
}
