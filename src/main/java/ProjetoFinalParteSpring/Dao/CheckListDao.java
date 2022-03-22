package ProjetoFinalParteSpring.Dao;

import ProjetoFinalParteSpring.Domain.CheckListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CheckListDao extends JpaRepository<CheckListEntity, Integer> {

//    @NotNull
//    default CheckListEntity listfindAllCheck() {
//        final var allCheckIds = listfindAllCheck();
//        return listfindAllCheck();
//    }
//
//    @Query(value = "select id, data, hora, saidaRetorno," +
//            " placa, motorista, kmVeiculo, tracao, rodoar, calibragemPneus, estepe, freioDianteiro," +
//            " freioTraseiro, amortecedor, molas, cambioOleo, direcaoOleo, limpezaRadiadorAgua," +
//            " oleoMotor, retrovisor, paraBrisa, paraChoqueDianteiro, paraChoqueTraseiro, " +
//            " estofamento, cortinas, cintoDeSeguranca, freioDeEstacionamento from CheckListEntity", nativeQuery = true)
//    @NotNull
//    List<Integer> listfindAllCheck(@NotNull final List<Integer> checks);
//
//
//    @Query(value = "select id, data, hora, saidaRetorno, placa, motorista, " +
//            "kmVeiculo, tracao, rodoar, calibragemPneus, estepe, freioDianteiro, freioTraseiro, " +
//            "amortecedor, molas, cambioOleo, direcaoOleo, limpezaRadiadorAgua, " +
//            "oleoMotor, retrovisor, paraBrisa, paraChoqueDianteiro, paraChoqueTraseiro, " +
//            "estofamento, cortinas, cintoDeSeguranca, freioDeEstacionamento " +
//            "from CheckListEntity where id = :id", nativeQuery = true)
//    @NotNull
//    CheckListEntity findById(@NotNull final List<Integer> checkIds);
}
