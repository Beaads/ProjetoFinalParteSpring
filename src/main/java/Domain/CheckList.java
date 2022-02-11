package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CheckList {
    //cabeçalho
    private String data;
    private String hora;
    private boolean saidaRetorno;
    private int placa;
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

}
