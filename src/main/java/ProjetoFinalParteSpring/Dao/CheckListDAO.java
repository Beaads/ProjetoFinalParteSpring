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
            PreparedStatement stm = connection.prepareStatement("SELECT id, data,"
                    + " hora, saidaRetorno, placa, motorista, kmVeiculo FROM checklist");
            stm.executeQuery();
            ResultSet rst = stm.getResultSet();
            while (rst.next()) {
                int id = rst.getInt("id");
                String data = rst.getString("data");
                String hora = rst.getString("hora");
                boolean saidaRetorno = rst.getBoolean("saidaRetorno");
                String placa = rst.getString("placa");
                String motorista = rst.getString("motorista");
                double kmVeiculo = rst.getDouble("kmVeiculo");

                CheckList checklist = new CheckList(id, data, hora, saidaRetorno, placa, motorista, kmVeiculo);
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
                boolean saidaRetorno = rst.getBoolean("saidaRetorno");
                String placa = rst.getString("placa");
                String motorista = rst.getString("motorista");
                double kmVeiculo = rst.getDouble("kmVeiculo");
                boolean tracao = rst.getBoolean("tracao");
                boolean rodoar = rst.getBoolean("rodoar");
                boolean calibragemPneus = rst.getBoolean("calibragemPneus");
                boolean estepe = rst.getBoolean("estepe");
                boolean freioDianteiro = rst.getBoolean("freioDianteiro");
                boolean freioTraseiro = rst.getBoolean("freioTraseiro");
                boolean amortecedor = rst.getBoolean("amortecedor");
                boolean molas = rst.getBoolean("molas");
                boolean cambioOleo = rst.getBoolean("cambioOleo");
                boolean direcaoOleo = rst.getBoolean("direcaoOleo");
                boolean limpezaRadiadorAgua = rst.getBoolean("limpezaRadiadorAgua");
                boolean oleoMotor = rst.getBoolean("oleoMotor");
                boolean retrovisor = rst.getBoolean("retrovisor");
                boolean paraBrisa = rst.getBoolean("paraBrisa");
                boolean paraChoqueDianteiro = rst.getBoolean("paraChoqueDianteiro");
                boolean paraChoqueTraseiro = rst.getBoolean("paraChoqueTraseiro");
                boolean estofamento = rst.getBoolean("estofamento");
                boolean cortinas = rst.getBoolean("cortinas");
                boolean cintoDeSeguranca = rst.getBoolean("cintoDeSeguranca");
                boolean freioDeEstacionamento = rst.getBoolean("freioDeEstacionamento");

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
            stm.setBoolean(3, checkList.isSaidaRetorno());
            stm.setString(4, checkList.getPlaca());
            stm.setString(5, checkList.getMotorista());
            stm.setDouble(6, checkList.getKmVeiculo());
            stm.setBoolean(7, checkList.isTracao());
            stm.setBoolean(8, checkList.isRodoar());
            stm.setBoolean(9, checkList.isCalibragemPneus());
            stm.setBoolean(10, checkList.isEstepe());
            stm.setBoolean(11, checkList.isFreioDianteiro());
            stm.setBoolean(12, checkList.isFreioTraseiro());
            stm.setBoolean(13, checkList.isAmortecedor());
            stm.setBoolean(14, checkList.isMolas());
            stm.setBoolean(15, checkList.isCambioOleo());
            stm.setBoolean(16, checkList.isDirecaoOleo());
            stm.setBoolean(17, checkList.isLimpezaRadiadorAgua());
            stm.setBoolean(18, checkList.isOleoMotor());
            stm.setBoolean(19, checkList.isRetrovisor());
            stm.setBoolean(20, checkList.isParaBrisa());
            stm.setBoolean(21, checkList.isParaChoqueDianteiro());
            stm.setBoolean(22, checkList.isParaChoqueTraseiro());
            stm.setBoolean(23, checkList.isEstofamento());
            stm.setBoolean(24, checkList.isCortinas());
            stm.setBoolean(25, checkList.isCintoDeSeguranca());
            stm.setBoolean(26, checkList.isFreioDeEstacionamento());
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
