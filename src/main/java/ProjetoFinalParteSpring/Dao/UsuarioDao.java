package ProjetoFinalParteSpring.Dao;

import ProjetoFinalParteSpring.Domain.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioDao extends JpaRepository<UsuarioEntity, Integer> {

//    @Query(value = "SELECT usuario, senha FROM usuario WHERE id = 1")
//    List<UsuarioEntity> getUsuarioEntitiesBy();

}