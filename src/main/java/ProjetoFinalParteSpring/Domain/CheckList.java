package ProjetoFinalParteSpring.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CheckList {
    //cabeçalho
    private int id;
    private String data;
    private String hora;
    private String saidaRetorno;
    private String placa;
    private String motorista;
    private double kmVeiculo;

    //infos booleanas
    //Pneus do veiculo
    private String tracao;
    private String rodoar;
    private String calibragemPneus;
    private String estepe;

    //Freios e suspensao
    private String freioDianteiro;
    private String freioTraseiro;
    private String amortecedor;
    private String molas;

    //motor
    private String cambioOleo;
    private String direcaoOleo;
    private String limpezaRadiadorAgua;
    private String oleoMotor;

    //parte externa
    private String retrovisor;
    private String paraBrisa;
    private String paraChoqueDianteiro;
    private String paraChoqueTraseiro;

    //parte interna
    private String estofamento;
    private String cortinas;
    private String cintoDeSeguranca;
    private String freioDeEstacionamento;

    public CheckList(int id, String data, String hora, String saidaRetorno, String placa, String motorista, double kmVeiculo) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.saidaRetorno = saidaRetorno;
        this.placa = placa;
        this.motorista = motorista;
        this.kmVeiculo = kmVeiculo;
    }

    public CheckList() {
    }
}
