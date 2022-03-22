package ProjetoFinalParteSpring.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class CheckListRespostaDTOPost {
    private String data;
    private String hora;
    private String saidaRetorno;
    private String placa;
    private String motorista;
    private String kmVeiculo;
    private String tracao;
    private String rodoar;
    private String calibragemPneus;
    private String estepe;
    private String freioDianteiro;
    private String freioTraseiro;
    private String amortecedor;
    private String molas;
    private String cambioOleo;
    private String direcaoOleo;
    private String limpezaRadiadorAgua;
    private String oleoMotor;
    private String retrovisor;
    private String paraBrisa;
    private String paraChoqueDianteiro;
    private String paraChoqueTraseiro;
    private String estofamento;
    private String cortinas;
    private String cintoDeSeguranca;
    private String freioDeEstacionamento;

}

