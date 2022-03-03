package ProjetoFinalParteSpring.Dao;

import ProjetoFinalParteSpring.Connection.ConnectionFactory;
import ProjetoFinalParteSpring.Domain.CheckList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CheckListDao {

    public List<CheckList> listAllCheckList() {
        List<CheckList> checklists = new ArrayList<>();
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("select id, data, hora, saidaretorno," +
                                                                        "placa, motorista, kmveiculo, tracao, rodoar," +
                                                                        " calibragempneus, estepe, freiodianteiro," +
                                                                        "freiotraseiro, amortecedor, molas, " +
                                                                        "cambiooleo, direcaooleo, " +
                                                                        "limpezaradiadoragua," +
                                                                        "oleomotor, retrovisor, parabrisa, " +
                                                                        "parachoquedianteiro, parachoquetraseiro, " +
                                                                        "estofamento," +
                                                                        "cortinas, cintodeseguranca, " +
                                                                        "freiodeestacionamento from checklist");
            stm.executeQuery();
            ResultSet rst = stm.getResultSet();
            while (rst.next()) {
                CheckList checklist = createChecklist(rst);
                checklists.add(checklist);
            }
        } catch (SQLException | NullPointerException | ClassNotFoundException e) {
            throw new IllegalStateException("Erro ao listar os checklist");
        }
        return checklists;
    }

    public CheckList findByIdCheckList(int id) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("select id, data,"
                                                                        + " hora, saidaretorno, placa, motorista, " +
                                                                        "kmveiculo, tracao, rodoar, calibragempneus,"
                                                                        + " estepe, freiodianteiro, freiotraseiro, " +
                                                                        "amortecedor, molas, cambiooleo, "
                                                                        + " direcaooleo, limpezaradiadoragua, " +
                                                                        "oleomotor, retrovisor, parabrisa, "
                                                                        + " parachoquedianteiro, parachoquetraseiro, " +
                                                                        "estofamento, cortinas, "
                                                                        + " cintodeseguranca, freiodeestacionamento  " +
                                                                        "from checklist where id = (?)");
            stm.setInt(1, id);
            stm.executeQuery();
            ResultSet rst = stm.getResultSet();
            if (rst.next()) {
                return createChecklist(rst);
            } else {
                throw new IllegalStateException("Checklist não encontrado");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new IllegalStateException("Erro ao buscar o checklist");
        }
    }

    public CheckList cadastraCheckList(CheckList checkList) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement(
                    """
                            insert into checklist (data_hora, data, hora, saidaretorno, placa, motorista, kmveiculo, tracao, rodoar, calibragempneus,
                                                   estepe, freiodianteiro, freiotraseiro, amortecedor, molas, cambiooleo,
                                                   direcaooleo, limpezaradiadoragua, oleomotor, retrovisor, parabrisa,
                                                   parachoquedianteiro, parachoquetraseiro, estofamento, cortinas,
                                                   cintodeseguranca, freiodeestacionamento)
                            values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                            returning id;""");
            stm.setObject(1, LocalDateTime.now());
            stm.setString(2, checkList.getData());
            stm.setString(3, checkList.getHora());
            stm.setString(4, checkList.getSaidaRetorno());
            stm.setString(5, checkList.getPlaca());
            stm.setString(6, checkList.getMotorista());
            stm.setInt(7, checkList.getKmVeiculo());
            stm.setString(8, checkList.getTracao());
            stm.setString(9, checkList.getRodoar());
            stm.setString(10, checkList.getCalibragemPneus());
            stm.setString(11, checkList.getEstepe());
            stm.setString(12, checkList.getFreioDianteiro());
            stm.setString(13, checkList.getFreioTraseiro());
            stm.setString(14, checkList.getAmortecedor());
            stm.setString(15, checkList.getMolas());
            stm.setString(16, checkList.getCambioOleo());
            stm.setString(17, checkList.getDirecaoOleo());
            stm.setString(18, checkList.getLimpezaRadiadorAgua());
            stm.setString(19, checkList.getOleoMotor());
            stm.setString(20, checkList.getRetrovisor());
            stm.setString(21, checkList.getParaBrisa());
            stm.setString(22, checkList.getParaChoqueDianteiro());
            stm.setString(23, checkList.getParaChoqueTraseiro());
            stm.setString(24, checkList.getEstofamento());
            stm.setString(25, checkList.getCortinas());
            stm.setString(26, checkList.getCintoDeSeguranca());
            stm.setString(27, checkList.getFreioDeEstacionamento());
            stm.execute();
            ResultSet rst = stm.getResultSet();
            if (rst.next()) {
                int id = rst.getInt("id");
                checkList.setId(id);
            }
            return checkList;
        } catch (SQLException | ClassNotFoundException e) {
            throw new IllegalStateException("Erro ao inserir o checklist");
        }
    }

    private CheckList createChecklist(final ResultSet rst) throws SQLException {
        int id = rst.getInt("id");
        String data = rst.getString("data");
        String hora = rst.getString("hora");
        String saidaRetorno = rst.getString("saidaRetorno");
        String placa = rst.getString("placa");
        String motorista = rst.getString("motorista");
        Integer kmVeiculo = rst.getInt("kmVeiculo");
        String tracao = rst.getString("tracao");
        String rodoar = rst.getString("rodoar");
        String calibragemPneus = rst.getString("calibragemPneus");
        String estepe = rst.getString("estepe");
        String freioDianteiro = rst.getString("freioDianteiro");
        String freioTraseiro = rst.getString("freioTraseiro");
        String amortecedor = rst.getString("amortecedor");
        String molas = rst.getString("molas");
        String cambioOleo = rst.getString("cambioOleo");
        String direcaoOleo = rst.getString("direcaoOleo");
        String limpezaRadiadorAgua = rst.getString("limpezaRadiadorAgua");
        String oleoMotor = rst.getString("oleoMotor");
        String retrovisor = rst.getString("retrovisor");
        String paraBrisa = rst.getString("paraBrisa");
        String paraChoqueDianteiro = rst.getString("paraChoqueDianteiro");
        String paraChoqueTraseiro = rst.getString("paraChoqueTraseiro");
        String estofamento = rst.getString("estofamento");
        String cortinas = rst.getString("cortinas");
        String cintoDeSeguranca = rst.getString("cintoDeSeguranca");
        String freioDeEstacionamento = rst.getString("freioDeEstacionamento");

        return new CheckList(id, data, hora, saidaRetorno, placa, motorista, kmVeiculo,
                             tracao, rodoar, calibragemPneus, estepe, freioDianteiro, freioTraseiro, amortecedor, molas,
                             cambioOleo, direcaoOleo, limpezaRadiadorAgua, oleoMotor, retrovisor, paraBrisa,
                             paraChoqueDianteiro, paraChoqueTraseiro, estofamento, cortinas, cintoDeSeguranca,
                             freioDeEstacionamento);
    }
}
