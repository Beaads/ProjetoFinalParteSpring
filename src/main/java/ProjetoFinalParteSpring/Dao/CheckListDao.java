package ProjetoFinalParteSpring.Dao;

import ProjetoFinalParteSpring.Domain.CheckListEntity;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CheckListDao extends JpaRepository<CheckListEntity, Long> {
    @Query(value = "select id, data, hora, saidaRetorno," +
            " placa, motorista, kmVeiculo, tracao, rodoar, calibragemPneus, estepe, freioDianteiro," +
            " freioTraseiro, amortecedor, molas, cambioOleo, direcaoOleo, limpezaRadiadorAgua," +
            " oleoMotor, retrovisor, paraBrisa, paraChoqueDianteiro, paraChoqueTraseiro, " +
            " estofamento, cortinas, cintoDeSeguranca, freioDeEstacionamento from CheckListEntity")
    @NotNull
    List<CheckListEntity> listAllCheckList();


    @Query(value = "select id, data, hora, saidaRetorno, placa, motorista, " +
            "kmVeiculo, tracao, rodoar, calibragemPneus, estepe, freioDianteiro, freioTraseiro, " +
            "amortecedor, molas, cambioOleo, direcaoOleo, limpezaRadiadorAgua, " +
            "oleoMotor, retrovisor, paraBrisa, paraChoqueDianteiro, paraChoqueTraseiro, " +
            "estofamento, cortinas, cintoDeSeguranca, freioDeEstacionamento " +
            "from CheckListEntity where id = :id")
    @NotNull
    CheckListEntity findByIdCheckList(int id);

}


    //    default List<CheckListEntity> listAllCheckList() {
//        Connection conn = null;
//        List<CheckListEntity> checklists = new ArrayList<>();
//        try {PreparedStatement stm = conn.prepareStatement("SELECT id, data, hora, saidaRetorno," +
//                    "placa, motorista, kmVeiculo, tracao, rodoar, calibragemPneus, estepe, freioDianteiro," +
//                    "freioTraseiro, amortecedor, molas, cambioOleo, direcaoOleo, limpezaRadiadorAgua," +
//                    "oleoMotor, retrovisor, paraBrisa, paraChoqueDianteiro, paraChoqueTraseiro, estofamento," +
//                    "cortinas, cintoDeSeguranca, freioDeEstacionamento FROM checklist");
//            stm.executeQuery();
//            ResultSet rst = stm.getResultSet();
//            while (rst.next()) {
//                int id = rst.getInt("id");
//                String data = rst.getString("data");
//                String hora = rst.getString("hora");
//                String saidaRetorno = rst.getString("saidaRetorno");
//                String placa = rst.getString("placa");
//                String motorista = rst.getString("motorista");
//                String kmVeiculo = rst.getString("kmVeiculo");
//                String tracao = rst.getString("tracao");
//                String rodoar = rst.getString("rodoar");
//                String calibragemPneus = rst.getString("calibragemPneus");
//                String estepe = rst.getString("estepe");
//                String freioDianteiro = rst.getString("freioDianteiro");
//                String freioTraseiro = rst.getString("freioTraseiro");
//                String amortecedor = rst.getString("amortecedor");
//                String molas = rst.getString("molas");
//                String cambioOleo = rst.getString("cambioOleo");
//                String direcaoOleo = rst.getString("direcaoOleo");
//                String limpezaRadiadorAgua = rst.getString("limpezaRadiadorAgua");
//                String oleoMotor = rst.getString("oleoMotor");
//                String retrovisor = rst.getString("retrovisor");
//                String paraBrisa = rst.getString("paraBrisa");
//                String paraChoqueDianteiro = rst.getString("paraChoqueDianteiro");
//                String paraChoqueTraseiro = rst.getString("paraChoqueTraseiro");
//                String estofamento = rst.getString("estofamento");
//                String cortinas = rst.getString("cortinas");
//                String cintoDeSeguranca = rst.getString("cintoDeSeguranca");
//                String freioDeEstacionamento = rst.getString("freioDeEstacionamento");
//
//                CheckListEntity checklist = new CheckListEntity(id, data, hora, saidaRetorno, placa, motorista, kmVeiculo, tracao,
//                                                                rodoar, calibragemPneus, estepe, freioDianteiro, freioTraseiro, amortecedor, molas, cambioOleo,
//                                                                direcaoOleo, limpezaRadiadorAgua, oleoMotor, retrovisor, paraBrisa, paraChoqueDianteiro,
//                                                                paraChoqueTraseiro, estofamento, cortinas, cintoDeSeguranca, freioDeEstacionamento);
//                checklists.add(checklist);
//            }
//        } catch (SQLException | NullPointerException e) {
//            e.printStackTrace();
//        }
//        return checklists;
//    }

//     default CheckListEntity findByIdCheckList(int id) {
//        Connection conn = null;
//            try {
//                PreparedStatement stm = conn.prepareStatement("SELECT id, data,"
//                                                                      + " hora, saidaRetorno, placa, motorista, " +
//                                                                      "kmVeiculo, tracao, rodoar, calibragemPneus,"
//                                                                      + " estepe, freioDianteiro, freioTraseiro, " +
//                                                                      "amortecedor, molas, cambioOleo, "
//                                                                      + " direcaoOleo, limpezaRadiadorAgua, " +
//                                                                      "oleoMotor, retrovisor, paraBrisa, "
//                                                                      + " paraChoqueDianteiro, paraChoqueTraseiro, " +
//                                                                      "estofamento, cortinas, "
//                                                                      + " cintoDeSeguranca, freioDeEstacionamento  " +
//                                                                      "FROM checklist WHERE id = (?)");
//                stm.setInt(1, id);
//                stm.executeQuery();
//                ResultSet rst = stm.getResultSet();
//                while (rst.next()) {
//                    String data = rst.getString("data");
//                    String hora = rst.getString("hora");
//                    String saidaRetorno = rst.getString("saidaRetorno");
//                    String placa = rst.getString("placa");
//                    String motorista = rst.getString("motorista");
//                    String kmVeiculo = rst.getString("kmVeiculo");
//                    String tracao = rst.getString("tracao");
//                    String rodoar = rst.getString("rodoar");
//                    String calibragemPneus = rst.getString("calibragemPneus");
//                    String estepe = rst.getString("estepe");
//                    String freioDianteiro = rst.getString("freioDianteiro");
//                    String freioTraseiro = rst.getString("freioTraseiro");
//                    String amortecedor = rst.getString("amortecedor");
//                    String molas = rst.getString("molas");
//                    String cambioOleo = rst.getString("cambioOleo");
//                    String direcaoOleo = rst.getString("direcaoOleo");
//                    String limpezaRadiadorAgua = rst.getString("limpezaRadiadorAgua");
//                    String oleoMotor = rst.getString("oleoMotor");
//                    String retrovisor = rst.getString("retrovisor");
//                    String paraBrisa = rst.getString("paraBrisa");
//                    String paraChoqueDianteiro = rst.getString("paraChoqueDianteiro");
//                    String paraChoqueTraseiro = rst.getString("paraChoqueTraseiro");
//                    String estofamento = rst.getString("estofamento");
//                    String cortinas = rst.getString("cortinas");
//                    String cintoDeSeguranca = rst.getString("cintoDeSeguranca");
//                    String freioDeEstacionamento = rst.getString("freioDeEstacionamento");
//
//                    CheckListEntity check =
//                            new CheckListEntity(id,
//                                                data,
//                                                hora,
//                                                saidaRetorno,
//                                                placa,
//                                                motorista,
//                                                kmVeiculo,
//                                                tracao,
//                                                rodoar,
//                                                calibragemPneus,
//                                                estepe,
//                                                freioDianteiro,
//                                                freioTraseiro,
//                                                amortecedor,
//                                                molas,
//                                                cambioOleo,
//                                                direcaoOleo,
//                                                limpezaRadiadorAgua,
//                                                oleoMotor,
//                                                retrovisor,
//                                                paraBrisa,
//                                                paraChoqueDianteiro,
//                                                paraChoqueTraseiro,
//                                                estofamento,
//                                                cortinas,
//                                                cintoDeSeguranca,
//                                                freioDeEstacionamento);
//                    conn.close();
//                    return check;
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }


//    default CheckListDto cadastraCheckList(CheckListDto checkList) {
//            Connection conn = null;
//        try {
//            PreparedStatement stm = conn.prepareStatement("INSERT INTO checklist ("
//                    + "data, hora, saidaRetorno, placa, motorista, kmVeiculo, tracao, rodoar, calibragemPneus, "
//                    + " estepe, freioDianteiro, freioTraseiro, amortecedor, molas, cambioOleo, "
//                    + " direcaoOleo, limpezaRadiadorAgua, oleoMotor, retrovisor, paraBrisa,"
//                    + " paraChoqueDianteiro, paraChoqueTraseiro, estofamento, cortinas, "
//                    + " cintoDeSeguranca, freioDeEstacionamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
//                    "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING ID");
//            stm.setString(1, checkList.getData());
//            stm.setString(2, checkList.getHora());
//            stm.setString(3, checkList.getSaidaRetorno());
//            stm.setString(4, checkList.getPlaca());
//            stm.setString(5, checkList.getMotorista());
//            stm.setString(6, checkList.getKmVeiculo());
//            stm.setString(7, checkList.getTracao());
//            stm.setString(8, checkList.getRodoar());
//            stm.setString(9, checkList.getCalibragemPneus());
//            stm.setString(10, checkList.getEstepe());
//            stm.setString(11, checkList.getFreioDianteiro());
//            stm.setString(12, checkList.getFreioTraseiro());
//            stm.setString(13, checkList.getAmortecedor());
//            stm.setString(14, checkList.getMolas());
//            stm.setString(15, checkList.getCambioOleo());
//            stm.setString(16, checkList.getDirecaoOleo());
//            stm.setString(17, checkList.getLimpezaRadiadorAgua());
//            stm.setString(18, checkList.getOleoMotor());
//            stm.setString(19, checkList.getRetrovisor());
//            stm.setString(20, checkList.getParaBrisa());
//            stm.setString(21, checkList.getParaChoqueDianteiro());
//            stm.setString(22, checkList.getParaChoqueTraseiro());
//            stm.setString(23, checkList.getEstofamento());
//            stm.setString(24, checkList.getCortinas());
//            stm.setString(25, checkList.getCintoDeSeguranca());
//            stm.setString(26, checkList.getFreioDeEstacionamento());
//            stm.execute();
//            ResultSet rst = stm.getResultSet();
//            while (rst.next()) {
//                int id = rst.getInt("id");
//                checkList.setId(id);
//            }
//            conn.close();
//            return checkList;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
