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
    private boolean saidaRetorno;
    private String placa;
    private String motorista;
    private double kmVeiculo;

    //infos booleanas
    //Pneus do veiculo
    private boolean tracao;
    private boolean rodoar;
    private boolean calibragemPneus;
    private boolean estepe;

    //Freios e suspensao
    private boolean freioDianteiro;
    private boolean freioTraseiro;
    private boolean amortecedor;
    private boolean molas;

    //motor
    private boolean cambioOleo;
    private boolean direcaoOleo;
    private boolean limpezaRadiadorAgua;
    private boolean oleoMotor;

    //parte externa
    private boolean retrovisor;
    private boolean paraBrisa;
    private boolean paraChoqueDianteiro;
    private boolean paraChoqueTraseiro;

    //parte interna
    private boolean estofamento;
    private boolean cortinas;
    private boolean cintoDeSeguranca;
    private boolean freioDeEstacionamento;

    public CheckList(int id, String data, String hora, boolean saidaRetorno, String placa, String motorista, double kmVeiculo) {
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
