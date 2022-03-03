package ProjetoFinalParteSpring.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CheckList {
    private int id;
    private final String data;
    private final String hora;
    private final String saidaRetorno;
    private final String placa;
    private final String motorista;
    private final Integer kmVeiculo;
    private final String tracao;
    private final String rodoar;
    private final String calibragemPneus;
    private final String estepe;
    private final String freioDianteiro;
    private final String freioTraseiro;
    private final String amortecedor;
    private final String molas;
    private final String cambioOleo;
    private final String direcaoOleo;
    private final String limpezaRadiadorAgua;
    private final String oleoMotor;
    private final String retrovisor;
    private final String paraBrisa;
    private final String paraChoqueDianteiro;
    private final String paraChoqueTraseiro;
    private final String estofamento;
    private final String cortinas;
    private final String cintoDeSeguranca;
    private final String freioDeEstacionamento;
}
