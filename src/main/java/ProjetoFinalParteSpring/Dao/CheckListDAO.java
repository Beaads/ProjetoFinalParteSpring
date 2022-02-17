package ProjetoFinalParteSpring.Dao;

import ProjetoFinalParteSpring.Connection.ConnectionFactory;
import ProjetoFinalParteSpring.Domain.CheckList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CheckListDAO {

    public List<CheckList> listAllCheckList() {
        List<CheckList> checklists = new ArrayList<>();
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("SELECT id, data," +
                    "                     hora, saidaRetorno, placa, motorista, kmVeiculo, tracao, rodoar, calibragemPneus," +
                    "                     estepe, freioDianteiro, freioTraseiro, amortecedor, molas, cambioOleo," +
                    "                     direcaoOleo, limpezaRadiadorAgua, oleoMotor, retrovisor, paraBrisa," +
                    "                     paraChoqueDianteiro, paraChoqueTraseiro, estofamento, cortinas," +
                    "                     cintoDeSeguranca, freioDeEstacionamento FROM checklist");
            stm.executeQuery();
            ResultSet rst = stm.getResultSet();
            while (rst.next()) {
                int id = rst.getInt("id");
                String data = rst.getString("data");
                String hora = rst.getString("hora");
                String saidaRetorno = rst.getString("saidaRetorno");
                String placa = rst.getString("placa");
                String motorista = rst.getString("motorista");
                double kmVeiculo = rst.getDouble("kmVeiculo");
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

                CheckList checklist = new CheckList(id, data, hora, saidaRetorno, placa, motorista, kmVeiculo, tracao, rodoar,
                        calibragemPneus, estepe, freioDianteiro, freioTraseiro, amortecedor, molas, cambioOleo, direcaoOleo,
                        limpezaRadiadorAgua, oleoMotor, retrovisor, paraBrisa, paraChoqueDianteiro, paraChoqueTraseiro,
                        estofamento, cortinas, cintoDeSeguranca, freioDeEstacionamento);
                checklists.add(checklist);
            }
        } catch (SQLException | NullPointerException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return checklists;
    }

    public CheckList findByIdCheckList(int id) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("SELECT id, data,"
                    + " hora, saidaRetorno, placa, motorista, kmVeiculo, tracao, rodoar, calibragemPneus,"
                    + " estepe, freioDianteiro, freioTraseiro, amortecedor, molas, cambioOleo, "
                    + " direcaoOleo, limpezaRadiadorAgua, oleoMotor, retrovisor, paraBrisa, "
                    + " paraChoqueDianteiro, paraChoqueTraseiro, estofamento, cortinas, "
                    + " cintoDeSeguranca, freioDeEstacionamento  FROM checklist WHERE id = (?)");
            stm.setInt(1, id);
            stm.executeQuery();
            ResultSet rst = stm.getResultSet();
            while (rst.next()) {
                String data = rst.getString("data");
                String hora = rst.getString("hora");
                String saidaRetorno = rst.getString("saidaRetorno");
                String placa = rst.getString("placa");
                String motorista = rst.getString("motorista");
                double kmVeiculo = rst.getDouble("kmVeiculo");
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

                CheckList check = new CheckList(id, data, hora, saidaRetorno, placa, motorista, kmVeiculo, tracao, rodoar,
                        calibragemPneus, estepe, freioDianteiro, freioTraseiro, amortecedor, molas, cambioOleo, direcaoOleo,
                        limpezaRadiadorAgua, oleoMotor, retrovisor, paraBrisa, paraChoqueDianteiro, paraChoqueTraseiro,
                        estofamento, cortinas, cintoDeSeguranca, freioDeEstacionamento);
                return check;
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public CheckList cadastraCheckList(CheckList checkList) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("INSERT INTO checklist (" +
                    "data, hora, saidaRetorno, placa, motorista, kmVeiculo, tracao, rodoar, calibragemPneus, "
                     +" estepe, freioDianteiro, freioTraseiro, amortecedor, molas, cambioOleo, "
                     +" direcaoOleo, limpezaRadiadorAgua, oleoMotor, retrovisor, paraBrisa,"
                     +" paraChoqueDianteiro, paraChoqueTraseiro, estofamento, cortinas, "
                     +" cintoDeSeguranca, freioDeEstacionamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                    "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING ID");
            stm.setString(1, checkList.getData());
            stm.setString(2, checkList.getHora());
            stm.setString(3, checkList.getSaidaRetorno());
            stm.setString(4, checkList.getPlaca());
            stm.setString(5, checkList.getMotorista());
            stm.setDouble(6, checkList.getKmVeiculo());
            stm.setString(7, checkList.getTracao());
            stm.setString(8, checkList.getRodoar());
            stm.setString(9, checkList.getCalibragemPneus());
            stm.setString(10, checkList.getEstepe());
            stm.setString(11, checkList.getFreioDianteiro());
            stm.setString(12, checkList.getFreioTraseiro());
            stm.setString(13, checkList.getAmortecedor());
            stm.setString(14, checkList.getMolas());
            stm.setString(15, checkList.getCambioOleo());
            stm.setString(16, checkList.getDirecaoOleo());
            stm.setString(17, checkList.getLimpezaRadiadorAgua());
            stm.setString(18, checkList.getOleoMotor());
            stm.setString(19, checkList.getRetrovisor());
            stm.setString(20, checkList.getParaBrisa());
            stm.setString(21, checkList.getParaChoqueDianteiro());
            stm.setString(22, checkList.getParaChoqueTraseiro());
            stm.setString(23, checkList.getEstofamento());
            stm.setString(24, checkList.getCortinas());
            stm.setString(25, checkList.getCintoDeSeguranca());
            stm.setString(26, checkList.getFreioDeEstacionamento());
            stm.execute();
            ResultSet rst = stm.getResultSet();
            while (rst.next()) {
                int id = rst.getInt("id");
                checkList.setId(id);
            }
            return checkList;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
