package ProjetoFinalParteSpring.Dao;

import ProjetoFinalParteSpring.Domain.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends JpaRepository<UsuarioEntity, Integer> {
}